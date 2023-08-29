import java.util.*;

public class anagram1 {
    public static void main(String[] args) {
        System.out.println("Enter string 1: ");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        int len1 = s1.length();
        System.out.println("Enter string 1: ");
        String s2 = sc.nextLine();
        int len2 = s2.length();
        int flag = 0;
        if (len1 != len2)
            flag = 0;
        else {
            char c1[] = s1.toCharArray();
            Arrays.sort(c1);
            char c2[] = s2.toCharArray();
            Arrays.sort(c2);
            for (int i = 0; i < len1; i++)
                if (c1[i] == c2[i])
                    flag = 1;
                else
                    flag = 0;

        }
        if(flag==0)
            System.out.println("Not anagrams");
        else
            System.out.print("Anagrams");

    }
}
