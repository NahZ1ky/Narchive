#include <stdio.h>
#include <stdlib.h>
#include <editline/readline.h>

int main(int argc, char **argv) {
  // Print Version and Exit Information
  puts("Lispy Version 0.0.0.0.1");
  puts("Press Ctrl+c to Exit\n");

  while (1) {
    /* version one
    fputs("Lispy> ", stdout); // prompt for user input
    fgets(input, 2048, stdin); // intake user input

    printf("No, you are a %s\n", input); // echo user input
    */

    char* input = readline("lispy> "); // output prompt and get input in one line
    add_history(input); // add input to history

    printf("No you're a %s\n", input); // echo user input
    free(input); // free retrieved input
    
  }
  return 0;
}
