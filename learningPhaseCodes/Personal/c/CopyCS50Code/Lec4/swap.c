#include <stdio.h>

void swap(int a, int b);

int main(void) {
    int x = 1;
    int y = 2;

    printf("x is %i, y is %i\n", x, y);
    swap(x, y);
    printf("x is %i, y is %i\n", x, y);
}

// this block of code will occupy a block of memory on the stack memory
void swap (int a, int b) { // this line of code is passing in value, take ups three memory slots in stack
    int tmp = a;
    a = b;
    b = tmp;
}

void swapEnhance (int* a, int* b) { // but method passes in reference, only take ups one memory slot in stack
    int tmp = *a;
    *a = *b;
    *b = tmp;
}