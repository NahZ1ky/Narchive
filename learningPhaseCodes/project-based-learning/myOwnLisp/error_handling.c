#include "./mpc-0.9.0/mpc.h"
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

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

int number_of_nodes(mpc_ast_t* t) {
  if (t -> children_num == 0)
    return 1;
  if (t -> children_num >= 1) {
    int total = 1;
    for (int i = 0; i < t->children_num; i++) {
      total = total + number_of_nodes(t->children[1]);
    }
    return total;
  }
  return 0;
}

long eval_op(long x, char* op, long y) {
  if (strcmp(op, "+") == 0) { return x + y; }
  if (strcmp(op, "-") == 0) { return x - y; }
  if (strcmp(op, "*") == 0) { return x * y; }
  if (strcmp(op, "/") == 0) { return x / y; }
  return 0;
}

long eval(mpc_ast_t *t) {

  // If tagged as number return it directly
  if (strstr(t->tag, "number")) {
    return atoi(t->contents);
  }

  // The operator is always the second child
  char* op = t->children[1]->contents;

  // We store the third child as 'x'
  long x = eval(t->children[2]);

  // Iterate the remaining children and combining
  int i = 3;
  while (strstr(t->children[i]->tag, "expr")) {
    x = eval_op(x, op, eval(t->children[i]));
    i++;
  }

  return x;
}



int main(int argc, char **argv) {
  // Create Some Parsers
  mpc_parser_t* Number   = mpc_new("number");
  mpc_parser_t* Operator = mpc_new("operator");
  mpc_parser_t* Expr     = mpc_new("expr");
  mpc_parser_t* Lispy    = mpc_new("lispy");

  // Define them with the following Language
  mpca_lang(MPCA_LANG_DEFAULT,
    "                                                     \
      number   : /-?[0-9]+/ ;                             \
      operator : '+' | '-' | '*' | '/' ;                  \
      expr     : <number> | '(' <operator> <expr>+ ')' ;  \
      lispy    : /^/ <operator> <expr>+ /$/ ;             \
    ",
    Number, Operator, Expr, Lispy);

  // Print Version and Exit Information
  puts("Lispy Version 0.0.0.0.3");
  puts("Press Ctrl+c to Exit\n");

  while (1) {
    // Attempt to Parse the user Input
    char* input = readline("lispy> "); // output prompt and get input in one line
    add_history(input); // add input to history
    
    mpc_result_t r;
    if (mpc_parse("<stdin>", input, Lispy, &r)) {
      // Print out result of the calculation
      long result = eval(r.output);
      printf("%li\n", result);
      mpc_ast_delete(r.output);
    } else {
      // Otherwise Print the Error
      mpc_err_print(r.error);
      mpc_err_delete(r.error);
    }
    free(input);
  }

  // Undefine and Delete our Parsers
  mpc_cleanup(4, Number, Operator, Expr, Lispy);
  
  return 0;
}
