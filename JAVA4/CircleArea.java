// Input radius of a circle and calculate area
import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object

        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble(); // Read radius

        double area = 3.14159 * radius * radius; // Formula: πr²

        System.out.println("\nArea of the circle = " + area);

        sc.close(); // Close scanner
    }
}