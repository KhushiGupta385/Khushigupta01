// Check whether a year is leap year or not.
import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Leap year conditions:
        // 1. Year divisible by 400 → Leap year
        // 2. Year divisible by 4 but not 100 → Leap year
        if (year % 400 == 0) {
            System.out.println(year + " is a leap year.");
        } 
        else if (year % 100 == 0) {
            System.out.println(year + " is NOT a leap year.");
        } 
        else if (year % 4 == 0) {
            System.out.println(year + " is a leap year.");
        } 
        else {
            System.out.println(year + " is NOT a leap year.");
        }
    }
}