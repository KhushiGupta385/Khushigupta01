// Find roots of a quadratic equation using if-else.
import java.util.*;

public class QuadraticRoots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = sc.nextDouble();

        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        
        System.out.print("Enter c: ");
        double c = sc.nextDouble();

        double D = b * b - 4 * a * c; // discriminant

        if (D > 0) {
            // Real and distinct roots
            double r1 = (-b + Math.sqrt(D)) / (2 * a);
            double r2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("Roots are real and distinct.");
            System.out.println("Root 1 = " + r1);
            System.out.println("Root 2 = " + r2);
        }
        else if (D == 0) {
            // Real and equal roots
            double r = -b / (2 * a);
            System.out.println("Roots are real and equal.");
            System.out.println("Root = " + r);
        }
        else {
            // Complex roots
            double real = -b / (2 * a);
            double imag = Math.sqrt(-D) / (2 * a);
            System.out.println("Roots are complex.");
            System.out.println("Root 1 = " + real + " + " + imag + "i");
            System.out.println("Root 2 = " + real + " - " + imag + "i");
        }
    }
}
