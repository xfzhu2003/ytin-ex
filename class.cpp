//#define F_DEBUG
/* Autoconf patching by David Hedbor, neotron@lysator.liu.se */
/*********************************************************************/
/* file: class.cpp - funtions related to the class command           */
/*                             TINTIN III                            */
/*          (T)he K(I)cki(N) (T)ickin D(I)kumud Clie(N)t             */
/*                     coded by peter unold 1992                     */
/*********************************************************************/

#include <config.h>
#include "tintin.h"

#if defined(HAVE_STRING_H)
#include <string.h>
#elif defined(HAVE_STRINGS_H)
#include <strings.h>
#endif

#include <ctype.h>

#ifndef _WINDOWS
#include <readline/readline.h>
extern int readline_echoing_p;
#endif

#include <stdlib.h>
#include "action.proto"
#include "ansi.proto"
#include "llist.proto"
#include "main.proto"
#include "parse.proto"
#include "rl.proto"
#include "variables.proto"
#include "class.proto"
#include "glob.proto"

GSList *common_classes = NULL;

static void show_list_class(GSList *listhead);

/* 0 is match,1 is mismatch */
gint  class_name_match (gconstpointer a,gconstpointer b)
{
    struct class_s *ca = (struct class_s *)a;
    struct class_s *cb = (struct class_s *)b;
    
    return (strcmp(ca->name,cb->name));
}

/* b contian the regexp */
gint  class_name_wild_match (gconstpointer a,gconstpointer b)
{
    struct class_s *ca = (struct class_s *)a;
    struct class_s *cb = (struct class_s *)b;
    
    return (!match(cb->name,ca->name));
}

GSList *class_list_delete(GSList *list,GSList *link)
{
    if(link->data) free(link->data);
    return g_slist_delete_link(list,link);
}

GSList *class_list_append(GSList *list,char *cln)
{
    struct class_s *pcl;

    pcl = (struct class_s *)malloc(sizeof(struct class_s));
    if(!pcl) return NULL;
    
    strncpy(pcl->name,cln,sizeof(pcl->name));
    /* default class enabled,else disable */
    if(strcmp(cln,DEFAULT_CLASS_NAME) == 0)
    {
        pcl->enable = TRUE;
    }
    else
    {
        pcl->enable = FALSE;
    }

    return g_slist_append(list,pcl);
}

GSList *class_list_find(GSList *list,char *cln)
{
    struct class_s cl;

    strncpy(cl.name,cln,sizeof(cl.name));
    return g_slist_find_custom(list,&cl,class_name_match);
}

GSList* class_list_copy (GSList *list)
{
    GSList *new_list = NULL;

    if (list)
    {
        GSList *last;

        new_list = g_slist_alloc ();
        new_list->data = (struct class_s *)malloc(sizeof(struct class_s));
        memcpy(new_list->data,list->data,sizeof(struct class_s));

        last = new_list;
        list = list->next;
        while (list)
        {
            last->next = g_slist_alloc ();
            last = last->next;
            last->data = (struct class_s *)malloc(sizeof(struct class_s));
            memcpy(last->data,list->data,sizeof(struct class_s));
            list = list->next;
        }
        last->next = NULL;
    }

    return new_list;
}

void class_list_clean(GSList *nptr)
{
	GSList *nexttodel;

    if(!nptr) return;
    
	nexttodel = nptr->next;
    if(nptr->data) free(nptr->data);
	free(nptr);
	
	for(nptr = nexttodel; nptr; nptr = nexttodel) {
		nexttodel = nptr->next;
		if(nptr->data) free(nptr->data);
		free(nptr);
	}
    
    return;
}

/***********************/
/* the #action command */
/***********************/

/*  Priority code added by Robert Ellsworth 2/2/94 */

void class_command(const char *arg, struct session* ses)
{
    struct class_s cl;char cln[BUFFER_SIZE];
    char result[BUFFER_SIZE];
    GSList *myclasses,*ccl;

    myclasses = (ses ? ses->classes : common_classes);
	arg = get_arg_in_braces(arg, cln, 0);
#ifdef F_DEBUG
    sprintf(result, "#DBG: <%lx>,<%lx>,<%lx>,<%s> - <%lx>",
            myclasses,ses->classes,common_classes,cln,ses);
    tintin_puts(result, ses);
#endif    
    if(!*cln)
    {
        tintin_puts2("#Defined classes:", ses);
		show_list_class(myclasses);
		prompt(ses);
    }
    else
    {
        strncpy(cl.name,cln,sizeof(cl.name));
        cl.enable = TRUE;
        
        if(ccl = g_slist_find_custom(myclasses,&cl,class_name_wild_match))
        {
            while(myclasses=g_slist_find_custom(myclasses,&cl,class_name_wild_match))
            {
                GSL_CLASS_ENABLE(myclasses) = TRUE;
                
                if(mesvar[8])
                {
                    sprintf(result, "#OK.class [%s] is now enabled.",
                            GSL_CLASS_NAME(myclasses));
                    tintin_puts(result, ses);
                }
                myclasses = myclasses->next;
            }
        }
        else
        {
            if(mesvar[8])
            tintin_puts2("#That class is not defined.", ses);
        }
    }
    return;
}

void unclass_command(const char *arg, struct session* ses)
{
    struct class_s cl;char cln[BUFFER_SIZE];
    char result[BUFFER_SIZE];
    GSList *myclasses,*ccl;

    myclasses = (ses ? ses->classes : common_classes);
	arg = get_arg_in_braces(arg, cln, 0);

    if(!*cln)
    {
        tintin_puts2("#Defined classes:", ses);
		show_list_class(myclasses);
		prompt(ses);
    }
    else
    {
        strncpy(cl.name,cln,sizeof(cl.name));
        cl.enable = FALSE;

        if(ccl = g_slist_find_custom(myclasses,&cl,class_name_wild_match))
        {
            while(myclasses=g_slist_find_custom(myclasses,&cl,class_name_wild_match))
            {
                GSL_CLASS_ENABLE(myclasses) = FALSE;
                if(mesvar[8])
                {
                    sprintf(result, "#OK.class [%s] is now enabled.",
                            GSL_CLASS_NAME(myclasses));
                    tintin_puts(result, ses);
                }
                myclasses = myclasses->next;
            }
        }
        else
        {
            if(mesvar[8])
            tintin_puts2("#That class is not defined.", ses);
        }
/*        
        ccl = g_slist_find_custom(myclasses,&cl,class_name_match);
    
        if(!ccl)
        {
            tintin_puts2("#That class is not defined.", ses);		 
        }
        else
        {
            GSL_CLASS_ENABLE(ccl) = FALSE;
            sprintf(result, "#OK.class [%s] is now disabled.", cln);
            tintin_puts(result, ses);
        }
*/       
    }    
   
    return;
}

static void show_list_class(GSList *listhead)
{
    char temp[BUFFER_SIZE];

    if(listhead == NULL)
    {
        tintin_puts2("none of class is defined", NULL);
        return;
    }
	while(listhead)
	{
        memset(temp,0,sizeof temp);
        sprintf(temp, "{%s%16s%s}\t\t@\t{%d}",
                GSL_CLASS_ENABLE(listhead)?COLOR_GRN:COLOR_NOR,
                GSL_CLASS_NAME(listhead),
                COLOR_NOR,
                GSL_CLASS_ENABLE(listhead)
                );
        tintin_puts2(temp, NULL);
        listhead = listhead->next;
    }
}
