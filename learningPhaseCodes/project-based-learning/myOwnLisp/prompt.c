#include <stdio.h>

static char input[2048];

int main(int argc, char **argv) {
  // Print Version and Exit Information
  puts("Lispy Version 0.0.0.0.1");
  puts("Press Ctrl+c to Exit\n");

  while (1) {
    fputs("Lispy> ", stdout); // prompt for user input
    fgets(input, 2048, stdin); // intake user input

    printf("No, you are a %s", input); // echo user input out
  }

  return 0;
  
}
