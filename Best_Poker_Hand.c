#include <stdio.h>
void main() 
{
    int i;
    int ranks[5];
    char suits[5];

    for (i = 0; i < 5; i++)
    {
        printf("Enter rank %d: ", i + 1);
        scanf("%d", &ranks[i]);
    }

    for (i = 0; i < 5; i++) 
    {
        printf("Enter suit %d: ", i + 1);
        scanf(" %c", &suits[i]);
    }
    printf("The ranks are as follows: { ");
    for (i = 0; i < 5; i++) 
        printf("%d ", ranks[i]);
    printf("}\n");
    printf("The suits are as follows: { ");
    for (i = 0; i < 5; i++) 
    {
        printf("%c ", suits[i]);
    }
    printf("}\n");
    int flush = 1;
    int threeOfAKind = 0;
    int pair = 0;
  
    // Check for Flush
    for (i = 1; i < 5; i++)
    {
        if (suits[i] != suits[0])
        {
            flush = 0;
            break;
        }
    }
    // Count ranks frequency
    int ranksFrequency[20] = {0};
    for (i = 0; i < 5; i++) 
      ranksFrequency[ranks[i]]++;
    // Check for Three of a Kind and Pair
    for (i = 0; i < 20; i++)
    {
        if (ranksFrequency[i] == 3)
            threeOfAKind = 1;
        else if (ranksFrequency[i] == 2)
            pair = 1;
    }
    printf("Poker Hand Type: ");
    // Determine the best type of poker hand
    if (flush)
        printf("Flush\n");
    else if (threeOfAKind)
        printf("Three of a Kind\n");
    else if (pair)
        printf("Pair\n");
    else
        printf("High Card\n");
}
