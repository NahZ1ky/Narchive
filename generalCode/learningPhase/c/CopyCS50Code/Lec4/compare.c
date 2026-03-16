#include <cs50.h>
#include <stdio.h>

int main(void) {
    string s = get_string("s: ");
    string t = get_string("t: ");

    if (s == t) {
        printf("Smae\n");
    } else {
        printf("Different\n");
    }
    printf("%p\n", s); // debug
    printf("%p\n", t);
    printf("%s\n", s);
    printf("%s\n", t);
    // ^ is not going to work well, when comparing string(char*), c compares the memory location of the string. so it will always appears different in this program.

#include <string.h>
    char* st = get_string("st: ");
    char* ri = get_string("ri: ");

    if (strcmp(st, ri) == 0) {
        printf("Same\n");
    } else {
        printf("Different\n");
    }
    printf("%p\n", st); // debug
    printf("%p\n", ri);
    printf("%s\n", st);
    printf("%s\n", ri);
    // by using the method strcmp from <string.h>, we can finally compare the content of two strings.

}