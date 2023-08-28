import java.util.*;

public class duplicate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter string: ");
        String input = in.nextLine();
        int length = input.length();
        char current;
        int i = 0;
        while (i < length-1) {
            current = input.charAt(i);
            if (current != input.charAt(i + 1)) {
                System.out.print(current);
            } else
                while (current == input.charAt(i + 1)) {
                    i++;
                }
           i++; 
           if (i == length - 1 && input.charAt(i) != input.charAt(i - 1))
           System.out.print(input.charAt(i));
        }
    }
    
}
