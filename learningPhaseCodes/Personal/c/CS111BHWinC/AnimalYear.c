#include <stdio.h>
#include <stdlib.h>

#define MAX_NAME_LENGTH 100

int main(void) {
    // variable declaration
    char* humanName = malloc(MAX_NAME_LENGTH * sizeof(char));
    char* dogName = malloc(MAX_NAME_LENGTH * sizeof(char));
    char* rabbitName = malloc(MAX_NAME_LENGTH * sizeof(char));
    int humanAge;
    int dogAge;
    int rabbitAge;

    printf("Please enter your name: ");
    scanf("%s", humanName);

    printf("Please enter your dog's name: ");
    scanf("%s", dogName);

    printf("Please enter your rabbit's name: ");
    scanf("%s", rabbitName);

    printf("Please enter your age: ");
    scanf("%i", &humanAge);

    dogAge = humanAge * 7;
    rabbitAge = humanAge * 10;

    printf("Hello my name is %s and I am %i years old.\nThat is %i in dog years and %i in rabbit years!!!\n Neither %s nor %s can count that high :)", humanName, humanAge, dogAge, rabbitAge, dogName, rabbitName);
}