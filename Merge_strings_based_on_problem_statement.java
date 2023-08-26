import java.util.*;

public class merge_string {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        char result[] = merge_string1(s1.toCharArray(), s2.toCharArray());
        System.out.print(result);
    }

    public static char[] merge_string1(char[] str1, char[] str2) {
        if (str1 == null && str2 == null)
            return null;
        int len1 = str1.length;
        int len2 = str2.length;
        int total = len1 + len2;
        char[] merged = new char[total];
        int i = 0, j = 0, k = 0;
        while (k < total) {
            if (i < len1 && j < len2) {
                if (str1[i] < str2[j]) {
                    merged[k] = str1[i++];
                    merged[total - k - 1] = str2[j++];
                } else {
                    merged[k] = str2[j++];
                    merged[total - k - 1] = str1[i++];
                }
            } else if (i < len1)
                merged[k] = str1[i++];
            else if (j < len2)
                merged[k] = str2[j++];
          k++;
        }
      
return merged;
        
    } 
}
