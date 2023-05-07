#include <stdio.h>
#include <stdlib.h>
#include <string.h>
int len;
typedef struct node
{
    char data;
    struct node *link;
} NODE;
NODE *first = NULL;
void insertnode(char character)
{
    NODE *newnode = NULL;
    NODE *temp;
    newnode = (NODE *)malloc(sizeof(NODE));
    newnode->data = character;
    newnode->link = NULL;
    if (first == NULL)
        first = newnode;
    else
    {
        temp = first;
        while (temp->link != NULL)
            temp = temp->link;
        temp->link = newnode;
    }
}
NODE *reverse()
{
    NODE *current = first;
    NODE *prev = NULL, *next = NULL;
    while (current != NULL)
    {
        next = current->link;
        current->link = prev;
        prev = current;
        current = next;
    }
    first = prev;
    return first;
}
int main()
{
    char string[10];
    printf("Enter your string: ");
    scanf("%s", string);
    len = strlen(string);
    for (int i = 0; i < len; i++)
        insertnode(string[i]);
    NODE *rev = reverse();
    for (int j = 0; j < len; j++)
    {
        if (string[j] != rev->data)
        {
            printf("It is not a palindrome!");
            exit(0);
        }
        rev = rev->link;
    }

    printf("It is a palindrome!");
    return 0;
}
