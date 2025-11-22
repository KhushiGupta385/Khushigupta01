public class Rectangle {
    public static void main(String []args) {
        int length = 10;
        int breadth = 5;

        int area = length*breadth;
        int perimeter = 2*(length + breadth);

        System.out.println("Length:" + length);
        System.out.println("Breadth:" + breadth);
        System.out.println("Area of Rectangle:"+area);
        System.out.println("Perimeter of Rectangle:"+ perimeter);
    }
}
