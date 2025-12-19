// Input principal, rate, and time, then calculate simple interest.
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking inputs
        System.out.print("Enter Principal: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time (in years): ");
        double time = sc.nextDouble();

        // Calculating simple interest
        double simpleInterest = (principal * rate * time) / 100;

        // Displaying result
        System.out.println("Simple Interest = " + simpleInterest);

        sc.close();
    }
}
