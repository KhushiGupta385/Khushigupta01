//Find the smallest number in an array
class SmallestArrayElement {
    public static void main(String[] args) {

        // Declare and initialize array
        int[] arr = {25, 48, 12, 67, 34};

        int smallest = arr[0];   // assume first element is smallest

        // Find smallest element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        // Output
        System.out.println("Smallest number in the array is: " + smallest);
    }
}
