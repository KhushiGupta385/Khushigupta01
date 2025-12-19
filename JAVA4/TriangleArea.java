// Input base and height of a triangle, calculate area
import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking inputs
        System.out.print("Enter Base of the triangle: ");
        double base = sc.nextDouble();

        System.out.print("Enter Height of the triangle: ");
        double height = sc.nextDouble();

        // Calculating area
        double area = 0.5 * base * height;

        // Displaying result
        System.out.println("Area of Triangle = " + area);

        sc.close();
    }
}