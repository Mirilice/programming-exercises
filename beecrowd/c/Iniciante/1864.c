#include <stdio.h>

int main()
{
    const char *s = "LIFE IS NOT A PROBLEM TO BE SOLVED ";
    
    int precisao;
    scanf("%d", &precisao);
    printf("%.*s\n", precisao, s);
    return 0;
}