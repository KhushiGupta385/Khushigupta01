//Count even and odd number in an array.
class CountEvenOdd {
    public static void main(String[] args) {

        // Declare and initialize array
        int[] arr = {10, 15, 20, 25, 30, 35};

        int evenCount = 0;
        int oddCount = 0;

        // Count even and odd numbers
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // Output
        System.out.println("Number of Even elements = " + evenCount);
        System.out.println("Number of Odd elements = " + oddCount);
    }
}
