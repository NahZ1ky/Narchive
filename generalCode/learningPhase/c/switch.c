#include <stdio.h>

int main(){
    int score;
    scanf("%d", &score);

    switch(score) {
        case 90 ... 100:
            printf("Great job\n");
            break;
        case 80 ... 89:
            printf("Good job\n");
            break;
        case 70 ... 79:
            printf("Not bad\n");
            break;
        case 60 ... 69:
            printf("At least you didn't fail :)\n");
            break;
        case 0 ... 59:
            printf("No comments...\n");
            break;

        default:
            printf("Invalid input\n");
            break;
    }

    return 0;
}