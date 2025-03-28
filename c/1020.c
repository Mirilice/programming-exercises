#include <stdio.h>
 
int main() {
 
    int idade, dias_restantes, anos, meses, dias;
    
    scanf("%d", &idade);
    
    anos = idade/365;
    dias_restantes = idade - (anos*365);
    meses = dias_restantes/30;
    dias = dias_restantes%30;

    printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n", anos, meses, dias);
    
    return 0;
}