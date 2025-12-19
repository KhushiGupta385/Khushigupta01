// Take a string input and print its first character.
import java.util.Scanner;

public class FirstCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking string input
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Checking if string is not empty
        if (str.length() > 0) {
            char firstChar = str.charAt(0);
            System.out.println("First character = " + firstChar);
        } else {
            System.out.println("String is empty!");
        }

        sc.close();
    }
}
