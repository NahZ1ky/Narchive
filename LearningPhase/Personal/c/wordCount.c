# include <stdio.h>

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
}
