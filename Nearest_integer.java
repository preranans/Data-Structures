import java.util.*;

public class Nearest_integer {
    public static void main(String[] args) {
        System.out.println("Enter num");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        System.out.println("Enter n:");
        int n = sc.nextInt();
        int ni = NearestInteger(m, n);
        System.out.print(ni);
    }

    public static int NearestInteger(int m, int n) {
        int ans = 0;
        int mid = n / 2;
        for (int i = m - mid; i <= m + mid; i++)
            if (i % n == 0)
                ans = i;
        return ans;
    }
}
