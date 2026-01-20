// Find sum and average of array elements.
class SumAndAverageArray {
    public static void main(String[] args) {

        // Declare and initialize array
        int[] arr = {10, 20, 30, 40, 50};

        int sum = 0;

        // Calculate sum
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        // Calculate average
        double average = (double) sum / arr.length;

        // Output
        System.out.println("Sum of array elements = " + sum);
        System.out.println("Average of array elements = " + average);
    }
}

