import java.util.*;

public class DesiredInteger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for (int row = 0; row < arr.length; row++)
            arr[row] = in.nextInt();
        int k;
        System.out.println("Enter value of k: ");
        k = in.nextInt();
        int sum = desiredInt(arr, n, k);
        System.out.println("The desired sum is: ");
        System.out.print(sum + " ");
    }

    static int desiredInt(int[] arr, int n, int k) {
        Arrays.sort(arr); // Sort the array in ascending order
        int sum = 0;
        int count = 0;

        for (int i = 1; count < k; i++) {
            boolean isDivisible = false;
            for (int j = 0; j < n; j++) {
                if (i % arr[j] == 0) {
                    isDivisible = true;
                    break;
                }
            }
            if (!isDivisible) {
                sum += i;
                count++;
            }
        }
        return sum;
    }
}
