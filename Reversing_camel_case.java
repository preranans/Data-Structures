import java.util.*;

public class camelCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter string: ");
        String input = in.nextLine();
        int length = input.length();
        for (int i = 0; i < length; i++) {
            char currentChar = input.charAt(i);
            if (Character.isUpperCase(currentChar)) {
                System.out.println();
                System.out.print(Character.toLowerCase(currentChar));
            } else {
                System.out.print(Character.toUpperCase(currentChar));
            }
        }
    }
}
