// Input three numbers and find their sum
import java.util.Scanner;

public class SumOfThreeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // create Scanner object

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();

        int sum = num1 + num2 + num3; // calculate sum

        System.out.println("\nThe sum of the three numbers is: " + sum);

        sc.close(); // close scanner
    }
}