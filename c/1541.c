#include <stdio.h>
#include <math.h>

void main()
{
    int medidaA_casa, medidaB_casa, porcentagem;
    
    while (1){
        scanf("%d", &medidaA_casa);
        
        if (medidaA_casa == 0) break;
        
        scanf("%d %d", &medidaB_casa, &porcentagem);
        int area_casa = medidaA_casa*medidaB_casa;
        int tamanho_terreno = (area_casa*100)/porcentagem;
        printf("%d\n", (int)sqrt(tamanho_terreno));
        
    }
    
}