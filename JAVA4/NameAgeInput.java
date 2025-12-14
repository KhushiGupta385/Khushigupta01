// Take input for name and age, then print them
import java.util.Scanner;

public class NameAgeInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create Scanner object for input
        
        System.out.print("Enter your name: ");
        String name = sc.nextLine();  // Read a string (name)

        System.out.print("Enter your age: ");
        int age = sc.nextInt();  // Read an integer (age)

        System.out.println("\nYour name is " + name);
        System.out.println("Your age is " + age);

        sc.close(); // Close scanner
    }
}