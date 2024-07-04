#include "./mpc-0.9.0/mpc.h"

#ifdef _WIN32 // use following if compiling on windows

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
  /* Create Some Parsers */
  mpc_parser_t* Number   = mpc_new("number");
  mpc_parser_t* Operator = mpc_new("operator");
  mpc_parser_t* Expr     = mpc_new("expr");
  mpc_parser_t* Lispy    = mpc_new("lispy");

  /* Define them with the following Language */
  mpca_lang(MPCA_LANG_DEFAULT,
    "                                                     \
      number   : /-?[0-9]+/ ;                             \
      operator : '+' | '-' | '*' | '/' ;                  \
      expr     : <number> | '(' <operator> <expr>+ ')' ;  \
      lispy    : /^/ <operator> <expr>+ /$/ ;             \
    ",
    Number, Operator, Expr, Lispy);

  // Print Version and Exit Information
  puts("Lispy Version 0.0.0.0.2");
  puts("Press Ctrl+c to Exit\n");

  while (1) {
    /* version 1: only echos whatever user inputs
    fputs("Lispy> ", stdout); // prompt for user input
    fgets(input, 2048, stdin); // intake user input

    printf("No, you are a %s\n", input); // echo user input
    */

    /* version 2: echos userinput with newer, better method
    char* input = readline("lispy> "); // output prompt and get input in one line
    add_history(input); // add input to history

    printf("No you're a %s\n", input); // echo user input
    free(input); // free retrieved input
    */

    // version 3: parsing user input
    /* Attempt to Parse te user Input */
/* Attempt to Parse the user Input */
    char* input = readline("lispy> "); // output prompt and get input in one line
    add_history(input); // add input to history
    
    mpc_result_t r;
    if (mpc_parse("<stdin>", input, Lispy, &r)) {
      /* On Success Print the AST */
      mpc_ast_print(r.output);
      mpc_ast_delete(r.output);
    } else {
      /* Otherwise Print the Error */
      mpc_err_print(r.error);
      mpc_err_delete(r.error);
    }
    free(input);
  }

  /* Undefine and Delete our Parsers */
  mpc_cleanup(4, Number, Operator, Expr, Lispy);
  
  return 0;
}
