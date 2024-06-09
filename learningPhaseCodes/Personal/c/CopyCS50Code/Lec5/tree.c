#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

typedef struct node {
    int number;
    struct node* left;
    struct node* right;
} node;

bool search(node* tree, int number) {
    if (tree == NULL) {
        return false;
    } else if (tree->number < number) {
        return search(tree->left, number);
    } else if (tree->number > number) {
        return search(tree->right, number);
    } else {
        return true;
    }
}