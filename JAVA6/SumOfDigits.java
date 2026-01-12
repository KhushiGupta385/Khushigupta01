// Print sum of digits of a number. 
import java.util.*;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0;

        while (n != 0) {
            int digit = n % 10;   // extract last digit
            sum = sum + digit;    // add to sum
            n = n / 10;           // remove last digit
        }

        System.out.println("Sum of digits = " + sum);
    }
}