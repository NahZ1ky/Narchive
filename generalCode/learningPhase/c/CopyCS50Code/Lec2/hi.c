#include <cs50.h>
#include <stdio.h>

int main(void) {
    // HIs
    char c1 = 'H';
    char c2 = 'I';
    char c3 = '!';
    string s = "HI!";

    printf("%c%c%c\n", c1, c2, c3);
    printf("%i %i %i\n", c1, c2, c3);
    printf("%s\n", s);
    printf("%c%c%c\n", s[0], s[1], s[2]);
    printf("%i %i %i %i\n", s[0], s[1], s[2], s[3]);
    printf("\n\n\n");



    // WORDs
    string s = "HI!";
    string t = "BYE!";

    printf("%s\n", s);
    printf("%s\n", t);

    // 2D array
    string words[2];

    words[0] = "HI!";
    words[1] = "BYE!";

    printf("%s\n", words[0]);
    printf("%s\n", words[1]);

    printf("%c%c%c\n", words[0][0], words[0][1], words[0][2]);
    printf("%c%c%c%c\n", words[1][0], words[1][1], words[1][2], words[1][3]);

    // poke around
    printf("%c%c%c%c\n", words[0][0], words[0][1], words[0][2], words[0][4]);
    printf("%i %i %i %i %i\n", words[0][0], words[0][1], words[0][2], words[0][3], words[0][4]);
}