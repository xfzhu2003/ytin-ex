/* Autoconf patching by David Hedbor, neotron@lysator.liu.se */
/*********************************************************************/
/* file: llist.c - linked-list datastructure             */
/*               TINTIN III               */
/*     (T)he K(I)cki(N) (T)ickin D(I)kumud Clie(N)t       */
/*           coded by peter unold 1992           */
/*********************************************************************/

#include <config.h>
#include "tintin.h"

#if defined(HAVE_STRING_H)
#include <string.h>
#elif defined(HAVE_STRINGS_H)
#include <strings.h>
#endif

#ifdef HAVE_STDLIB_H
#include <stdlib.h>
#endif

#ifdef HAVE_UNISTD_H
#include <unistd.h>
#endif

#include "files.proto"
#include "glob.proto"
#include "llist.proto"
#include "main.proto"
#include "parse.proto"
#include "rl.proto"
#include "rltab.proto"
#include "utils.proto"
#include "class.proto"

/***************************************/
/* init list - return: ptr to listhead */
/***************************************/

struct listnode *init_list()
{
	struct listnode *listhead;
	
	if(!(listhead = (struct listnode *)malloc(sizeof(struct listnode)))) {
		fprintf(stderr, "couldn't alloc listhead\n");
		exit(1);
	}
	listhead->next = NULL;
	listhead->left = NULL;
	listhead->right = NULL;
	listhead->pr = NULL;
    listhead->cll = NULL;
    
	return(listhead);
}

/************************************************/
/* kill list - run throught list and free nodes */
/************************************************/ 

void kill_list(struct listnode *nptr)
{
	struct listnode *nexttodel;
	
	nexttodel = nptr->next;
	free(nptr);
	
	for(nptr = nexttodel; nptr; nptr = nexttodel) {
		nexttodel = nptr->next;
		free(nptr->left);
		free(nptr->right);
		free(nptr->pr);
		free(nptr);
	}
}

/*******************************************************************/
/*  This function will clear all lists associated with a session  */
/*******************************************************************/

void kill_all(struct session* &ses, int mode)
{
	switch(mode) {
		case CLEAN:
			if(ses) {
				kill_list(ses->aliases);
				ses->aliases = init_list();
				kill_list(ses->actions);
				ses->actions = init_list();
				kill_list(ses->myvars);
				ses->myvars = init_list();
				kill_list(ses->highs);
				ses->highs = init_list();
				kill_list(ses->subs);
				ses->subs = init_list();
				kill_list(ses->antisubs);
				ses->antisubs = init_list();
#ifndef _WINDOWS
				kill_list(ses->macros);         /* experimental meta key mapping - vastheman 2001-08-07 */
				ses->macros = init_list();
#endif
                class_list_clean(ses->classes);
                ses->classes = NULL;
				/* CHANGED to kill path stuff as well */
				kill_list(ses->path);
				ses->path = init_list();
				kill_list(ses->pathdirs);
				ses->pathdirs = init_list();
				tintin_puts("Lists cleared.", ses);
				prompt(NULL);
			}
			else {
				tintin_puts("Can't clean the common lists (yet):", NULL);
				prompt(NULL);
			}
			break;
			
		case END:
			if(ses) {
				kill_list(ses->aliases);
				kill_list(ses->actions);
				kill_list(ses->myvars);
				kill_list(ses->highs);
				kill_list(ses->subs);
				kill_list(ses->antisubs);
				kill_list(ses->pathdirs);
				kill_list(ses->myfuncs);
#ifndef _WINDOWS
				kill_list(ses->macros);         /* experimental meta key mapping - vastheman 2001-08-07 */
#endif
                class_list_clean(ses->classes);
                
				kill_list(ses->path); //unique for non-null session
			}
			else {
				kill_list(common_aliases);
				kill_list(common_actions);
                class_list_clean(common_classes);               
				kill_list(common_myvars);
				kill_list(common_highs);
				kill_list(common_subs);
				kill_list(common_antisubs);
				kill_list(common_pathdirs);
				kill_list(common_functions);
				kill_list(common_macros); //new! session specific counter parts - vastheman 2001-08-07
				/*chitchat: clear complete_head for tablist, free_complete(), in readline, it is rltab_purge */
				free_complete();
				rltab_purge();
			}
			break;
	}
}

/***********************************************/
/* make a copy of a list - return: ptr to copy */
/***********************************************/

struct listnode *copy_list(struct listnode *sourcelist, int mode)
{
	struct listnode *resultlist;
	
	resultlist = init_list();
	while((sourcelist = sourcelist->next))
		insertnode_list_inccl(resultlist, sourcelist->left, sourcelist->right, 
		sourcelist->pr, sourcelist->cll, mode);
	
	return(resultlist);
} 

/*****************************************************************/
/* create a node containing the ltext, rtext fields and stuff it */
/* into the list - in lexicographical order, or by numerical   */
/* priority (dependent on mode) - Mods by Joann Ellsworth 2/2/94 */
/*****************************************************************/

void insertnode_list(struct listnode *listhead,
const char *ltext, const char *rtext, const char *prtext,
int mode)
{
	struct listnode *nptr, *nptrlast, *newnode;
	
	if(!(newnode = (struct listnode *)malloc(sizeof(struct listnode)))) {
		fprintf(stderr, "couldn't malloc listhead");
		exit(1);
	}
	newnode->left = (char *)malloc(strlen(ltext)+1);
	newnode->right = (char *)malloc(strlen(rtext)+1);
	newnode->pr = (char *)malloc(strlen(prtext)+1);
	strcpy(newnode->left, ltext);
	strcpy(newnode->right, rtext);
	strcpy(newnode->pr, prtext);
	newnode->cll = NULL;
    
	nptr = listhead;
	switch(mode) {
		case PRIORITY:
			while((nptrlast = nptr) && (nptr = nptr->next))
				if(strcmp(prtext, nptr->pr) < 0) {
				newnode->next = nptr;
				nptrlast->next = newnode;
				return;
			}
			else if(!strcmp(prtext, nptr->pr)) {
				while(nptrlast && nptr && !strcmp(prtext, nptr->pr)) {
					if(strcmp(ltext, nptr->left) <= 0) {
						newnode->next = nptr;
						nptrlast->next = newnode;
						return;
					}
					nptrlast = nptr;
					nptr = nptr->next;
				}
				nptrlast->next = newnode;
				newnode->next = nptr;
				return;
			}
			
			nptrlast->next = newnode;
			newnode->next = NULL;
			return;
			
		case ALPHA:
			while((nptrlast = nptr) && (nptr = nptr->next))
				if(strcmp(ltext, nptr->left) <= 0) {
				newnode->next = nptr;
				nptrlast->next = newnode;
				return;
			}
			
			nptrlast->next = newnode;
			newnode->next = NULL;
			return;
	}
}

/*****************************/
/* delete a node from a list */
/*****************************/

void deletenode_list(struct listnode *listhead, struct listnode *nptr)
{
	struct listnode *lastnode = listhead;
	
	while((listhead = listhead->next)) {
		if(listhead == nptr) {
			lastnode->next = listhead->next;
			free(listhead->left);
			free(listhead->right);
			free(listhead->pr);
			free(listhead);
			return;
		}
		lastnode = listhead;
	}
	return;
}

/********************************************************/
/* search for a node containing the ltext in left-field */
/* return: ptr to node on succes / NULL on failure   */
/********************************************************/

struct listnode *searchnode_list(struct listnode *listhead, const char *cptr)
{
	while((listhead = listhead->next))
		if(!strcmp(listhead->left, cptr))
		return(listhead);
	
	return(NULL);
}

/***********************************************/
/* make a copy of a list - return: ptr to copy */
/***********************************************/

struct listnode *copy_list_inccl(struct session *ses,
                                 struct listnode *sourcelist,
                                 GSList *classlist,
                                 int mode)
{
	struct listnode *resultlist;

    resultlist = init_list();
    
    ses->classes = class_list_copy(classlist);
    	
	while((sourcelist = sourcelist->next))
    {
        GSList *cll = NULL;

        if(sourcelist->cll)
            cll = class_list_find(ses->classes,GSL_CLASS_NAME(sourcelist->cll));
 
		insertnode_list_inccl(resultlist, sourcelist->left,
                              sourcelist->right, 
                              sourcelist->pr, cll, mode);
	}
	return(resultlist);
}

/*****************************************************************/
/* create a node containing the ltext, rtext fields and stuff it */
/* into the list - in lexicographical order, or by numerical   */
/* priority (dependent on mode) - Mods by Joann Ellsworth 2/2/94 */
/*****************************************************************/

void insertnode_list_inccl(struct listnode *listhead,
                     const char *ltext, const char *rtext,
                     const char *prtext,GSList *cll,
                     int mode)
{
	struct listnode *nptr, *nptrlast, *newnode;
	
    
	if(!(newnode = (struct listnode *)malloc(sizeof(struct listnode)))) {
		fprintf(stderr, "couldn't malloc listhead");
		exit(1);
	}
	newnode->left = (char *)malloc(strlen(ltext)+1);
	newnode->right = (char *)malloc(strlen(rtext)+1);
	newnode->pr = (char *)malloc(strlen(prtext)+1);
    
    newnode->cll = cll;
	strcpy(newnode->left, ltext);
	strcpy(newnode->right, rtext);
	strcpy(newnode->pr, prtext);
	
	nptr = listhead;
	switch(mode) {
		case PRIORITY:
			while((nptrlast = nptr) && (nptr = nptr->next))
				if(strcmp(prtext, nptr->pr) < 0) {
				newnode->next = nptr;
				nptrlast->next = newnode;
				return;
			}
			else if(!strcmp(prtext, nptr->pr)) {
				while(nptrlast && nptr && !strcmp(prtext, nptr->pr)) {
					if(strcmp(ltext, nptr->left) <= 0) {
						newnode->next = nptr;
						nptrlast->next = newnode;
						return;
					}
					nptrlast = nptr;
					nptr = nptr->next;
				}
				nptrlast->next = newnode;
				newnode->next = nptr;
				return;
			}
			
			nptrlast->next = newnode;
			newnode->next = NULL;
			return;
			
		case ALPHA:
			while((nptrlast = nptr) && (nptr = nptr->next))
				if(strcmp(ltext, nptr->left) <= 0) {
				newnode->next = nptr;
				nptrlast->next = newnode;
				return;
			}
			
			nptrlast->next = newnode;
			newnode->next = NULL;
			return;
	}
}
/*****************************/
/* delete a node from a list */
/*****************************/

void deletenode_list_inccl(struct listnode *listhead,
                           struct listnode *nptr,
                           GSList *cllist)
{
    GSList *cll = nptr->cll;
    struct listnode *head = listhead;
    
    nptr->cll = NULL;
	while((listhead = listhead->next))
    {       
		if(listhead->cll == cll)
        {
            break;
        }
    }
    /* the class are not used,free it */
    if(!listhead)
    {
        class_list_delete(cllist,cll);
    }

    /* we will set cll to NULL again,but not care */
    deletenode_list(head,nptr);

    return;
}

struct listnode *searchnode_list_inccl(struct listnode *listhead,
                                       const char *cptr,
                                       const char *cln)
{
	while((listhead = listhead->next))
		if((listhead->cll)
           &&(!strcmp(GSL_CLASS_NAME(listhead->cll),cln))
           &&(!strcmp(listhead->left, cptr))
           )
		return(listhead);
	
	return(NULL);
}

/********************************************************/
/* search for a node that has cptr as a beginning    */
/* return: ptr to node on succes / NULL on failure   */
/* Mods made by Joann Ellsworth - 2/2/94        */
/********************************************************/

struct listnode *searchnode_list_begin(struct listnode *listhead,
const char *cptr, int mode)
{
	int i;
	
	switch(mode) {
		case PRIORITY:
			while((listhead = listhead->next)) {
				if(!(i = strncmp(listhead->left, cptr, strlen(cptr))) &&
					(listhead->left[strlen(cptr)] == ' ' ||
					!listhead->left[strlen(cptr)]))
					return(listhead);
			}
			break;
			
		case ALPHA:
			while((listhead = listhead->next)) {
				if(!(i = strncmp(listhead->left, cptr, strlen(cptr))) &&
					(listhead->left[strlen(cptr)] == ' ' ||
					!listhead->left[strlen(cptr)]))
					return(listhead);
				else if(i > 0)
					return(NULL);
			}
	}
	
	return(NULL);
}

/************************************/
/* show contens of a node on screen */
/************************************/

void shownode_list(struct listnode *nptr)
{
	char temp[BUFFER_SIZE];

    memset(temp,0,sizeof temp);
	sprintf(temp, "{%s}={%s}", nptr->left, nptr->right);
	tintin_puts2(temp, NULL);
}

void shownode_list_action(struct listnode *nptr)
{
	char temp[BUFFER_SIZE];
	
	sprintf(temp, "{%s}={%s} @ {%s} {%s}", nptr->left, nptr->right, nptr->pr, GSL_CLASS_NAME(nptr->cll));
	tintin_puts2(temp, NULL);
}

/************************************/
/* list contens of a list on screen */
/************************************/

void show_list(struct listnode *listhead)
{
	while((listhead = listhead->next))
		shownode_list(listhead);
}

void show_list_action(struct listnode *listhead)
{
	while((listhead = listhead->next))
		shownode_list_action(listhead);
}

struct listnode *search_node_with_wild(struct listnode *listhead,
const char *cptr)
{
	while((listhead = listhead->next)) {
		/* CHANGED to fix silly globbing behavior
		if(check_one_node(listhead->left, cptr))
			*/
			if(match(cptr, listhead->left))
			return(listhead);
	}
	return(NULL);
}

int check_one_node(const char *text, const char *action)
{
	char temp2[BUFFER_SIZE], *tptr;
	const char *temp;
	
	while(*text && *action) {
		if(*action == '*') {
			action++;
			temp = action;
			tptr = temp2;
			while(*temp && *temp != '*')
				*tptr++ = *temp++;
			*tptr = '\0';
			if(!*temp2)
				return(TRUE);
			while(strncmp(temp2, text, strlen(temp2)) && *text)
				text++;
		}
		else {
			temp = action;
			tptr = temp2;
			while(*temp && *temp != '*')
				*tptr++ = *temp++;
			*tptr = '\0';
			if(strncmp(temp2, text, strlen(temp2)))
				return(FALSE);
			else {
				text += strlen(temp2);
				action += strlen(temp2);
			}
		}
	}
	
	if(*text)
		return(FALSE);
	else if(!*action || (*action == '*' && !action[1]))
		return(TRUE);
	return(FALSE);
}

/*********************************************************************/
/* create a node containint the ltext, rtext fields and place at the */
/* end of a list - as insertnode_list(), but not alphabetical     */
/*********************************************************************/

void addnode_list(struct listnode *listhead,
const char *ltext, const char *rtext, const char *prtext)
{
	struct listnode *newnode;
	
	if(!(newnode = (struct listnode *)malloc(sizeof(struct listnode)))) {
		fprintf(stderr, "couldn't malloc listhead");
		exit(1);
	}
	newnode->left = (char *)malloc(strlen(ltext)+1);
	newnode->right = (char *)malloc(strlen(rtext)+1);
	newnode->pr = (char *)malloc(strlen(prtext)+1);
	newnode->next = NULL;
newnode->cll = NULL;
	strcpy(newnode->left, ltext);
	strcpy(newnode->right, rtext);
	strcpy(newnode->pr, prtext);
	while(listhead->next)
		listhead = listhead->next;
	listhead->next = newnode;
}

int count_list(struct listnode *listhead)
{ 
	int count = 0;
	struct listnode *nptr;
	
	nptr = listhead;
	while((nptr = nptr->next))
		++count;
	return(count);
}
