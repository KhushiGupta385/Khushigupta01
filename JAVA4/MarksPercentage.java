// Input marks of 5 subject and calculate percentage
import java.util.Scanner;

public class MarksPercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object

        System.out.println("Enter marks of 5 subjects:");

        System.out.print("Subject 1: ");
        double s1 = sc.nextDouble();

        System.out.print("Subject 2: ");
        double s2 = sc.nextDouble();

        System.out.print("Subject 3: ");
        double s3 = sc.nextDouble();

        System.out.print("Subject 4: ");
        double s4 = sc.nextDouble();

        System.out.print("Subject 5: ");
        double s5 = sc.nextDouble();

        double total = s1 + s2 + s3 + s4 + s5;
        double percentage = (total / 500) * 100;  // Assuming each subject is out of 100

        System.out.println("\nTotal Marks = " + total);
        System.out.println("Percentage = " + percentage + "%");

        sc.close(); // Close scanner
    }
}
