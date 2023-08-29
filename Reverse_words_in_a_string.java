
import java.util.Scanner;

public class reverse_string {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        String words[] = input.split(" ");
        for (int i = words.length - 1; i >= 0; i--)
            System.out.print(words[i] + " ");
        scanner.close();
    }
}
