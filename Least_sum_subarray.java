import java.util.*;

public class subarray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int row = 0; row < arr.length; row++)
            arr[row] = in.nextInt();
        System.out.println("Enter the value of k: ");
        int k = in.nextInt();
        int[] result = SubArray(arr, n, k);
        for (int i = 0; i < k; i++)
            System.out.print(result[i] + " ");
    }

    public static int[] SubArray(int[] arr, int n, int k) {
        if (n <= 0 || k <= 0 || n < k) {
            return null; // Invalid input, return null
        }

        int[] subarray = new int[k];

        int minSum = 0;
        int currentSum = 0;
        int startIndex = 0;

        // Calculate the initial sum of the first 'k' elements
        for (int i = 0; i < k; i++) {
            currentSum += arr[i];
        }

        minSum = currentSum;

        for (int i = k; i < n; i++) {
            currentSum += arr[i] - arr[i - k];

            if (currentSum < minSum) {
                minSum = currentSum;
                startIndex = i - k + 1; // Update the start index of the minimum sum subarray
            }
        }
        // Copy the minimum sum subarray into the result array
        for (int i = 0; i < k; i++) {
            subarray[i] = arr[startIndex + i];
        }
        return subarray;
    }
}
