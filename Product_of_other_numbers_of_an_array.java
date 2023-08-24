import java.util.*;

class Arrayproduct {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int row = 0; row < arr.length; row++)
            arr[row] = in.nextInt();
        int[] arr1 = findProduct(arr, n);
        System.out.println("The product array is: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr1[i] + " ");
    }

    public static int[] findProduct(int[] arr, int n) {
        int[] product = new int[n];
        // Calculate the product of all elements to the left of each element
        int leftProduct = 1;
        for (int i = 0; i < n; i++) {
            product[i] = leftProduct;
            leftProduct *= arr[i];
        }

        // Calculate the product of all elements to the right of each element and
        // multiply with the left product
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            product[i] *= rightProduct;
            rightProduct *= arr[i];
        }
        return product;
    }
}
