// Input side of a square, calculate area and perimeter
import java.util.Scanner;

public class SquareAreaPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter side of the square: ");
        double side = sc.nextDouble();

        // Calculating area and perimeter
        double area = side * side;
        double perimeter = 4 * side;

        // Displaying results
        System.out.println("Area of Square = " + area);
        System.out.println("Perimeter of Square = " + perimeter);

        sc.close();
    }
}
