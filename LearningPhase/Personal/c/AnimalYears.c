#include <stdio.h>

int main(){
    printf("What is your name? ");
    char *name;
    scanf("%s", name);
    printf("The name is: %s\n", name);
}
