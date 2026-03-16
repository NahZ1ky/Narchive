#include <cs50.h>
#include <stdio.h>

int main(void) {
    int n = 50;
    int *p = &n; // "*" here-> to declare a pointer // "&" is a reference operator
    printf("%p\n", *p); // "*" here-> go to that memory location

    string st = "HI!"; // value type "string" don't need to cast to pointer address because it is one.
    // "string" is just "char*"
    printf("%s\n", st);
    printf("%p\n", st);
    printf("%p\n", &st[0]);
    printf("%p\n", &st[1]);
    printf("%p\n", &st[2]);
    printf("%p\n", &st[3]);

    char* str = "BYE";
    printf("%s\n", str);
    printf("%p\n", str);
    printf("%p\n", &str[0]);
    printf("%p\n", &str[1]);
    printf("%p\n", &str[2]);
    printf("%p\n", &str[3]);
    printf("%p\n", &str[4]);
}