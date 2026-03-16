#include <stdio.h>

int add_together(int x, int y); // 

int main(int argc, char** argv) {
  puts("Hello, world!");
  int added = add_together(10, 18);
  return 0;
}

int add_together(int x, int y) { // learn function
  int result = x + y;
  return result;
}

void number_size(int x) { // learn if & else statement and && operator
  if (x < 0) {
    puts("Number is less than 0");
  } else if (x >= 0 && x < 100) {
    puts("Number is greater than or equal to 0, less than 100");
  } else {
    puts("Number is Greater than or equal to 100");
  }
}

void number_loop(int x, int y) { // learn loop
  if (x < y) {
    for (x; x < y; x++) {
      printf("%s", x);
    }
  } else if (x > y) {
    for (x; x > y; x--) {
      printf("%s", x);
    }
  } else {
    puts("x is the same number as y");
  }
}

typedef struct { // learn struct
  float x;
  float y;
} point;
