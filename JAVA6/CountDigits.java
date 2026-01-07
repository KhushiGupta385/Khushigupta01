// Count digits of a number.
import java.util.*;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int count = 0;

        // If number is 0, digits = 1
        if (n == 0) {
            count = 1;
        } else {
            while (n != 0) {
                n = n / 10;   // remove last digit
                count++;      // increase counter
            }
        }

        System.out.println("Number of digits = " + count);
    }
}