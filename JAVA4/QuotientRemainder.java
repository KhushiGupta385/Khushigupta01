// Input two integers and print quotient and Remainder
import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking inputs
        System.out.print("Enter dividend: ");
        int dividend = sc.nextInt();

        System.out.print("Enter divisor: ");
        int divisor = sc.nextInt();

        // Calculating quotient and remainder
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        // Displaying results
        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);

        sc.close();
    }
}
