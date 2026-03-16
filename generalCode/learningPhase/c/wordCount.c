# include <stdio.h>
# define MAXLINE 1000
/*
main(){
    int character;
    int numChar = 0;
    int numWord = 0;
    int numLine = 0;
    int State;

    while (getchar() != EOF){
        numChar++;
        if (character == '\n'){
            numLine++;
        }
        if (character == (' ' || '\n' || '\t')){
            State = 0;
        } else if (State == 0){
            State = 1;
            numWord++;
        }
    }
    printf("%d %d %d\n", numLine, numWord, numChar);
} */


main(){
    int longest;
    char longestString;
    int currLength[MAXLINE];
    char currString[MAXLINE];

    longest = 0
    while (currLength = getline(line, MAXLINE) != EOF){
        if (currLength > longest){
            longest = currLength;
            longestString = currString;
        }
    }
    printf("the longest line has %d numbers, and this is the content inside:\n", longest)
    printf(longestString)
    return 0;
}

int getline(char s[], int limit){
    int c;
    int i;

    for (i = 0; (i < (limit - 1)) && ((c = getchar()) != EOF) && (c != '\n'); ++i){
        s[i] = c;
    }
    if (c == '\n'){
        s[i] = c;
        ++i;
    }
    s[i] = '\0';
    return i;
}

void copy(char to[], char from[]){
    int i = 0;

    while (from[i] != '\0'){
        to[i] = from[i];
        ++i;
    }
}



#include <stdio.h>
#define MAXLINE 1000 /* maximum input line length */

int getline(char line[], int maxline);
void copy(char to[], char from[]);

/* print the longest input line */
main()
{
    int len; /* current line length */
    int max; /* maximum length seen so far */
    char line[MAXLINE]; /* current input line */
    char longest[MAXLINE]; /* longest line saved here */

    max = 0;
    while ((len = getline(line, MAXLINE)) > 0)
        if (len > max) {
            max = len;
            copy(longest, line);
        }
        if (max > 0) /* there was a line */
            printf("%s", longest);
        return 0;
}

/* getline: read a line into s, return length */
int getline(char s[],int lim)
{
    int c, i;

    for (i=0; i < lim-1 && (c=getchar())!=EOF && c!='\n'; ++i)
        s[i] = c;
    if (c == '\n') {
        s[i] = c;
        ++i;
    }
    s[i] = '\0';
    return i;
}

/* copy: copy 'from' into 'to'; assume to is big enough */
void copy(char to[], char from[])
{
    int i;
    i = 0;
    while ((to[i] = from[i]) != '\0')
        ++i;
}