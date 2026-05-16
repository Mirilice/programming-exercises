#include <stdio.h>

int main()
{
    int cidade = 1;
    int N;
    int consumo;
    int X, Y;
    while (scanf("%d", &N) && N != 0) {
        long long pessoas = 0;
        long long consumo_total = 0;  
        int valores[201] = {0};
        
        for(int i=0; i<N; i++){
            scanf("%d %d", &X, &Y);
            pessoas+=X;
            consumo_total+=Y;
            consumo = Y/X;
            valores[consumo] += X;
        }
        long long medio_inteiro = ((long long)consumo_total * 100) / pessoas;
        printf("Cidade# %d:\n", cidade);
        for(int c = 0; c <= 200; c++){
            if (valores[c]>0){
                printf("%d-%d ", valores[c], c);
            }
        }
        printf("\n");
        printf("Consumo medio: %lld.%02lld m3.\n", medio_inteiro / 100, medio_inteiro % 100);
        printf("\n");
        cidade++;
    }
    return 0;
}