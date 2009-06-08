#include <config.h>

#if defined(HAVE_STRING_H)
#include <string.h>
#elif defined(HAVE_STRINGS_H)
#include <strings.h>
#endif

static char* cdigit[] = { "��", "һ", "��", "��", "��", "��", "��", "��", "��",
	"��", "ʮ", "��", "ǧ", "��" };
static int nod = sizeof(cdigit)/sizeof(char*);

void ctoi(char* input)
{
	char result[BUFFER_SIZE];
	int i, j, k, num;
	int lastunit, lastdigit=0;
	char* tmp;
	j = 0; tmp = input;
	while (*tmp&&*(tmp+1)) {
		for (i=0;i<nod;i++)
			if (!strncmp(tmp, cdigit[i], 2)) {
			result[j]=i;
			break;
		}
		j++; tmp+=2;
	}
	result[j]=0; /*just sth != 10, chitchat*/
	num = j;
	lastunit = 0;
	for (i=0, j=0;i<num;i++) {
		if (result[i]==0){
			if(result[i+1]!=10) continue;
			else result[i]=1; /*for һǧ��ʮ, change to һǧһʮ, chitchat*/
		}
		if (i==0&&result[0]==10) {
			lastunit = 10; input[j] = '1'; j++; lastdigit = 0;
		} else if (result[i]<10) {
			if (lastunit<=10) {
				input[j] = '0' + result[i]; j++;
				lastunit = 0;
			} else {
				lastdigit = result[i];
			}
		} else if (result[i]<13) {
			if (lastunit>result[i]+1)
				for (k=0;k<lastunit-result[i]-1;k++) {
				input[j] = '0'; j++;
			}
			if (lastunit) {input[j] = '0' + lastdigit; j++;}
			lastunit = result[i]; lastdigit = 0;
		} else if (result[i]==13) {
			if (lastunit>=10)
				for (k=0;k<lastunit-9;k++) {
				input[j] = '0'; j++;
			}
			lastunit = 13; lastdigit = 0;
		}
	}
	if (lastunit>=10) {
		for (k=0;k<lastunit-9;k++) {
			input[j] = '0'; j++;
		}
		if (lastdigit) input[j-1]='0'+lastdigit;
	}
	if(j==0) input[j++]='0'; //handle #ctoi x {��}, chit, 7/10/2000
	input[j] = '\0';
}

static char* sym_dee[] = { "��","��","��","î","��","��","��","δ","��","��","��","��" };
static int n_dee = sizeof(sym_dee)/sizeof(char*);

void cttoi(char* input)
{
    int len,i,j=0;

    for(i=0;i<n_dee;i++)
    {
        if(strcmp(sym_dee[i],input) == 0)
            break;
    }
 
    /* i do not control when not found, */

    len = sprintf(input,"%d",i*2);
    input[len] = '\0';
}
