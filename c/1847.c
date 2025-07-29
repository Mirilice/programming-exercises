#include <stdio.h>
#include <stdlib.h>

int main()
{
    int A, B, C, PS, ST;
    scanf("%d %d %d", &A, &B, &C);
    PS = abs(A - B);
    ST = abs(B - C);
    if ((A > B && B <= C) ||
        (A < B && B < C && ST >= PS) ||
        (A > B && B > C && ST < PS) ||
        (A == B && B < C)){
            printf(":)\n");
        } else printf(":(\n");
    

    return 0;
}