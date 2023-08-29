import java.util.*;

public class k_size {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int row = 0; row < arr.length; row++)
            arr[row] = in.nextInt();
        System.out.println("Enter k: ");
        int k = in.nextInt();
        int len = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            len=0;
            while (arr[i] > 0) {
                arr[i] /= 10;
                len++;
            }
            if (len == k)
                count++;

        }
        System.out.print(count);

    }
}
