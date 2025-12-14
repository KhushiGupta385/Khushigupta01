// Input length and breadth of a rectangle, calculate area and perimeter
import java.util.Scanner;

public class RectangleAreaPerimeter{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object

        System.out.print("Enter the length of the rectangle: ");
        double length = sc.nextDouble();

        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = sc.nextDouble();

        double area = length * breadth;               // Area = length × breadth
        double perimeter = 2 * (length + breadth);    // Perimeter = 2 × (length + breadth)

        System.out.println("\nArea of the rectangle = " + area);
        System.out.println("Perimeter of the rectangle = " + perimeter);

        sc.close(); // Close scanner
    }
}