#include <iostream>
using namespace std;
int countNegativeNumbers(int a[][10], int m, int n)
{
    int count = 0;
    int i = 0, j = n - 1;   // start from top-right corner as it is largest negative element
    while (i < m && j >= 0) // traversing towards the first element in each row
    {
        if (a[i][j] < 0) // if number is negative
        {
            count += (j + 1); // add number of negative elements in current row (elements prior to the negative element in the row are also negative)
            i++;              // move to next row
        }
        else
        {
            j--; // we decrement the column index j by 1 after adding the number of negative elements in the current row to the count to move left to the next element in the same column and continue our search for negative elements.
        }
    }
    return count;
}

void main()
{
    int a[10][10];
    int m, n;
    cout << "Enter the order of the matrix: ";
    cin >> m >> n;
    cout << "Enter the elements of the matrix in row-wise and column-wise sorted order: " << endl;
    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < n; j++)
        {
            cin >> a[i][j];
        }
    }
    int count = countNegativeNumbers(a, m, n);
    cout << "Total number of negative elements in the matrix: " << count << endl;
}
