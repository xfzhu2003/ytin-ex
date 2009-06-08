/* New for v2.0: readline support -- daw */

/* i put the logging crap in it's own file, in case we wanna change it later */

#include <config.h>
#include "tintin.h"

#include "log.proto"

void logit(struct session* &s, const char *b)
{
	static char bb[BUFFER_SIZE+1];
	int i, j;
	
	if(!s->logfile)
		return;
	
#if OLD_LOG
	fputs(b, s->logfile);
#else
	/* new logging behavior: ignore control-m's */
	for(i = j = 0; b[i]; i++)
		if(b[i] != '\r')
		bb[j++] = b[i];
	bb[j] = '\0';
	fputs(bb, s->logfile);
#endif
}

void lograw(struct session* &s, const char *b, int l)
{
	if(!s->logfile) return;
	fwrite(b, sizeof(char), l, s->logfile);
}
