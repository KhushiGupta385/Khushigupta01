public class CelsiusTofahrenheit {
    public static void main(String[]args) {
        double Celsius = 37;
        
        //Conversion formula: f=(c*9/5)+32
        double fahrenheit = (Celsius *9/5)+32;

        //Print result
        System.out.println(Celsius + "C=" + fahrenheit + "f");
    }
}
