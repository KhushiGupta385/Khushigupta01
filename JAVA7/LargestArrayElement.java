// Find largest number in an array
class LargestArrayElement {
    public static void main(String[] args) {
        int[] arr = {25, 48, 12, 67, 34};

        int largest = arr[0];   // assume first element is largest

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.println("Largest number in the array is: " + largest);
    }
}
