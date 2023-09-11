#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <math.h>
#include <ctype.h>

char* torles(char* sor)
{
    char* result = (char*)calloc(strlen(sor)+1,sizeof(char));
    int pos = 0;

    for (int i = 0; i < strlen(sor); i++)
    {
        if (isdigit(sor[i]) && (int)sor[i] % 2 == 0)
        {
            continue;
        }
        else
        {
            result[pos++] = sor[i];
        }
        
    }
    
    return result;
}


int main()
{
    char line[30];

    while (gets(line))
    {
        if (strcmp(line, "END") == 0)
        {
            break;
            char* r=torles(line);
            puts(r);
            free(r);
        }
        else
        {
            char* r=torles(line);
            puts(r);
            free(r);
        }
        
    }
    

    return 0;
}