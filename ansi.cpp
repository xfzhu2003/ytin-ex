
#include <config.h>
#include "tintin.h"

#include <ctype.h>

#include "ansi.proto"

/* Warning! This function is more of a hack than anything else.         */
/* It tries to calculate the length of an ansi code sequence.           */
/* The calculations were obtained by trial and error by matching to the */
/* output echo gives in a normal unix xterm (and some knowledge of what */
/* the code sequences look like).                                       */

int skip_ansi(const char *str)
{
	int skip = 0;
	
	if(!str || !*str)
		return(skip);
	
	switch(*str++) {
		case '\a': /* BEL */
		case '\b': /* BS */
		case '\t': /* HT */
			/*case '\n':    NL */
		case '\v': /* VT */
		case '\f': /* NP */
			/*case '\r':    CR */
		case 14:   /* SO */
		case 15:   /* SI */
			return(++skip);
			
		case 27:   /* ESC */
			skip++;
			break;
			
		default:
			return(skip);
	}
	
	if(*str == '[') {
		str++;
		skip++;
		if(*str == '@' || *str == '[' || *str == '\\' || *str == ']' ||
			*str == '^' || *str == '_' || *str == '`' || *str == '{' ||
				*str == '|' || *str == '}' || *str == '~')
			return(skip+1);
		
		if(ispunct(*str) &&
			*str != '!' && *str != '"' && *str != '#' && *str != '$' &&
			*str != '%' && *str != '&' && *str != '\'' && *str != '(' &&
			*str != ')' && *str != '*' && *str != '+' && *str != ',' &&
			*str != '-' && *str != '.' && *str != '/' && *str != ' ') {
			str++;
			skip++;
			if(ispunct(*str) &&
				*str != '!' && *str != '"' && *str != '#' && *str != '$' &&
				*str != '%' && *str != '&' && *str != '\'' && *str != '(' &&
				*str != ')' && *str != '*' && *str != '+' && *str != ',' &&
				*str != '-' && *str != '.' && *str != '/' && *str != ' ') {
				str++;
				skip++;
			}
		}
		
		while(*str &&
			(*str == '!' || *str == '"' || *str == '#' || *str == '$' ||
			*str == '%' || *str == '&' || *str == '\'' || *str == '(' ||
			*str == ')' || *str == '*' || *str == '+' || *str == ',' ||
			*str == '-' || *str == '.' || *str == '/' || *str == ' ' ||
			*str == ';' || isdigit(*str) || iscntrl(*str))) {
			str++;
			skip++;
		}
	}
	else if(*str == ']') {
		do {
			str++;
			skip++;
		} while(isdigit(*str));
		
		if(!*str)
			return(skip);
		
		do {
			str++;
			skip++;
		} while(isgraph(*str) || *str == ' ');
	}
	else
		while(*str == '!' || *str == '"' || *str == '#' || *str == '$' ||
		*str == '%' || *str == '&' || *str == '\'' || *str == '(' ||
		*str == ')' || *str == '*' || *str == '+' || *str == ',' ||
		*str == '-' || *str == '.' || *str == '/' || *str == ' ') {
		str++;
		skip++;
	}
    
	return(!*str ? skip : skip+1);
	//return((!*str||(*str=='}')) ? skip : skip+1);
}

/* Strip the ansi code sequences from a string. */

char *strip_ansi(const char *str, char *buffer)
{
	int i = 0, j = 0, k;
	
	while(str[i])
		if(!(k = skip_ansi(&str[i])))
		buffer[j++] = str[i++];
	else
		i += k;
	buffer[j] = '\0';
	
	return(buffer);
}
