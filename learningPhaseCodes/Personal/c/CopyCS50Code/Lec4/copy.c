#include <cs50.h>
#include <ctype.h>
#include <stdio.h>
#include <string.h>

/*
int main(void) {
    char* s = get_string("s: ");
    char* t = s;

    if (strlen(t) > 0) {
        t[0] = toupper(t[0]);
    }
    printf("%s\n", s);
    printf("%s\n", t);
}
*/

#include <stdlib.h>

int main(void) {
    char* s = get_string("s: ");
    if (s == NULL) {// this block of code and the one looks similar not far down there both are used to prevent if nothing is being input and has a garbage value in it
        return 1;
    }

    char* t = malloc(strlen(s) + 1); // always free the memory after use
    if (t == NULL) {
        return 1;
    }

    /* copy the variable - reinventing the wheel
    for (int i = 0, n = strlen(s); i <= n; i++) { // "i<=n" to copy the "\0" into the new string as well
        t[i] = s[i];
    }
    */
   strcpy(t, s);

    if (strlen(t) > 0) {
        t[0] = toupper(t[0]);
    }
    printf("%s\n", s);
    printf("%s\n", t);

    free(t); // free memory slot after use
    return 0;
}