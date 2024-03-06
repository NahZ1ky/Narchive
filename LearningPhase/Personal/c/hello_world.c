#include <stdio.h>

int main(int argc, char const *argv[]){
    // 1-3 & 1-4
    float fahr, cels;
    /*
    printf("Fahr to Cels\n");
    for (fahr = 0; fahr <= 300; fahr += 20){
        cels = 5 * (fahr - 32) / 9;
        printf("%6.2f%10.2f\n", fahr, cels);
    }
    printf("\n");

    printf("Cels to Fahr\n");
    for (cels = -10; cels <= 37; cels += 2){
        fahr = 9 * (cels + 32) / 5;
        printf("%6f%10.2f\n", cels, fahr);
    }
    printf("\n");
    */

    // 1-5
    /*
    printf("Fahr to Cels, reverse order\n");
    for (fahr = 300; fahr >= 0; fahr -= 20){
        cels = 5 * (fahr - 32) / 9;
        printf("%6.2f%10.2f\n", fahr, cels);
    }
    printf("\n");
    */

   // 1-8
    int c, nl, nt, ns;
    nl = 0;
    nt = 0;
    ns = 0;

    while ((c = getchar()) != EOF)
        if (c == '\n'){
            ++nl;
        }
        if (c == '\t'){
            ++nt;
        }
        if (c == ' '){
            ++ns;
        }
