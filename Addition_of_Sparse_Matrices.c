#include <stdio.h>
#include <stdlib.h>
typedef struct
{
    int row;
    int col;
    int val;
} TERM;

TERM ta[51], tb[51], ts[51];

void triple(int sm[10][10], int m, int n, TERM tsm[])
// convert sparse matrix in array sm to triple matrix in array tsm
{
    int i, j, k, item;
    tsm[0].row = m, tsm[0].col = n;
    k = 1;
    for (i = 0; i < m; i++)
    {
        for (j = 0; j < n; j++)
        {
            item = sm[i][j];
            if (item == 0)
                continue;
            tsm[k].row = i, tsm[k].col = j;
            tsm[k].val = item;
            k++;
        }
    }
    tsm[0].val = k - 1;
}

void main()
{
    int a[10][10], b[10][10];
    int i, j, m, n, p, q, k = 0;
    int count = 0;

    printf("Enter the order of the first matix (should be <10) \n");
    scanf("%d %d", &m, &n);
    printf("Enter the elements of the matrix \n");
    for (i = 0; i < m; ++i)
    {
        for (j = 0; j < n; ++j)
        {
            scanf("%d", &a[i][j]);
            if (a[i][j] == 0)
            {
                count++;
            }
        }
    }
    if (count < ((m * n) / 2)) // check if sparse matrix
    {
        printf("The first matrix is not a Sparse Matrix \n");
        exit(0);
    }
    else
        triple(a, m, n, ta); // convert sparse matrix (a) to array of triples (ta)

    count = 0;
    printf("Enter the elements of the second matrix (same dimension as first matrix\n");
    for (i = 0; i < m; ++i)
    {
        for (j = 0; j < n; ++j)
        {
            scanf("%d", &b[i][j]);
            if (b[i][j] == 0)
            {
                count++;
            }
        }
    }
    if (count < ((m * n) / 2)) // check if sparse matrix
    {

        printf("The sceond matrix is not a Sparse Matrix \n");
        exit(0);
    }
    else
        triple(b, m, n, tb); // convert sparse matrix (b) to array of triples (tb)

    // Display triple matrices ta and tb

    printf("First matrix in triple form: ");
    for (i = 0; i <= ta[0].val; i++)
    {
        printf(" \n %d \t %d \t %d \n", ta[i].row, ta[i].col, ta[i].val);
    }
    printf("Second matrix in triple form: ");
    for (i = 0; i <= tb[0].val; i++)
    {
        printf("\n %d \t %d \t %d \n", tb[i].row, tb[i].col, tb[i].val);
    }
    ts[0].row = m, ts[0].col = n;
    k = 1;
    for (i = 1; i <= ta[0].val; i++)
    {
        for (j = 1; j <= tb[0].val; j++)
        {
            if ((ta[i].row == tb[j].row) && (ta[i].col == tb[j].col))
            {
                ts[k].val = ta[i].val + tb[j].val;
                ts[k].row = ta[i].row;
                ts[k].col = ta[i].col;
                ta[i].val = 0; // values already checked
                tb[j].val = 0;
                k++;
            }
        }
    }
    for (i = 1; i <= ta[0].val; i++)
    {
        if (ta[i].val != 0)
        {
            ts[k].row = ta[i].row;
            ts[k].col = ta[i].col;
            ts[k].val = ta[i].val;
            k++;
        }
    }
    for (i = 1; i <= tb[0].val; i++)
    {
        if (tb[i].val != 0)
        {
            ts[k].row = tb[i].row;
            ts[k].col = tb[i].col;
            ts[k].val = tb[i].val;
            k++;
        }
    }
    ts[0].val = k - 1;
    printf("Sum matrix in triple form: ");
    for (i = 0; i <= ts[0].val; i++)
    {
        printf(" \n %d \t %d \t %d \n", ts[i].row, ts[i].col, ts[i].val);
    }
}