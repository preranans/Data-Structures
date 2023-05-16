#include <stdio.h>
int partition(int a[], int first, int last, int index[])
{
    int pivot = a[first]; // Choose the first element as the pivot
    int count = 0;
    for (int i = first + 1; i <= last; i++)
    {
        if (a[i] < pivot)
            count++;
    }
    int pivotpos = first + count;          // Position of the pivot after rematrixangement
    swap(&a[pivotpos], &a[first]);         // Swap the pivot with its final position
    swap(&index[pivotpos], &index[first]); // Swap the corresponding index

    int i = first, j = last;
    while (i < pivotpos && j > pivotpos)
    {
        while (a[i] < pivot)
            i++;
        while (a[j] >= pivot)
            j--;
        if (i < pivotpos && j > pivotpos)
        {
            swap(&a[i], &a[j]);         // Swap elements if needed
            swap(&index[i], &index[j]); // Swap corresponding indices
        }
    }
    return pivotpos; // Return the final position of the pivot
}

void quickSort(int a[], int first, int last, int index[])
{
    int pivpos;
    if (first < last)
    {
        pivpos = partition(a, first, last, index);
        quickSort(a, first, p - 1, index);
        quickSort(a, p + 1, last, index);
    }
}
void swap(int *a, int *b)
{
    int temp = *a;
    *a = *b;
    *b = temp;
}
int main()
{
    int m, n;
    printf("Enter the order of the matrix: ");
    scanf("%d %d", &m, &n);
    int matrix[10][10];
    printf("Enter the matrix elements (1s and 0s only, representing soldiers and civilians respectively. The soldiers are followed by civilians in each row):\n");
    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < n; j++)
        {
            scanf("%d", &matrix[i][j]);
        }
    }
    int sol[m];   // to store the number of soldiers in each row
    int index[m]; // to keep track of the original indices of the rows before sorting
    for (int i = 0; i < m; i++)
    {
        int count = 0; // Separate variable to store the count
        for (int j = 0; j < n; j++)
            count += matrix[i][j]; // count used to count the number of soldiers
        sol[i] = count;
        index[i] = i;
    }

    quickSort(sol, 0, m - 1, index); // Sort the rows based on the number of soldiers in each row
    printf("Indices of the weakest rows (ordered from weakest to strongest):\n");
    for (int i = 0; i < m; i++)
        printf("row %d\n", index[i] + 1);
    return 0;
}
