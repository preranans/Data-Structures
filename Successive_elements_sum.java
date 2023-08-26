import java.util.*;

public class Success {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int row = 0; row < arr.length; row++)
            arr[row] = in.nextInt();
        System.out.println("Enter the value of p: ");
        int p = in.nextInt();
        int result = SumSuccessiveElements(arr, p);
        System.out.print(result);
    }

    static int SumSuccessiveElements(int[] arr, int p) {
        if (arr == null)
            return -1;
        if (p > arr.length)
            return 0;
        int sum = 0;
        int q = p - 1;
        while (q < arr.length) {
            sum += arr[q];
            q += p;
        }
        return sum;
    }

}
