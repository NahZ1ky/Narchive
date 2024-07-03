#include <stdio.h>
#include <stdlib.h>

#ifdef _WIN32 // use following if compiling on windows
  #include <string.h>

  static char buffer[2048];

  char *readline(char *prompt) {
    fputs(prompt, stdout);
    fgets(buffer, 2048, stdin);
    char* cpy = malloc(strlen(buffer)+1);
    strcpy(coy, buffer);
   cpy[strlen(cpy)-1] = '\0';
    return cpy;
  }

  void add_history(char *unused) {}

#else // otherwise include the editline headers
  #include <editline/readline.h>
#endif



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
