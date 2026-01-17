// Merge two arrays into a third array.
class MergeArrays {
    public static void main(String[] args) {

        // First array
        int[] arr1 = {10, 20, 30};

        // Second array
        int[] arr2 = {40, 50, 60};

        // Third array to store merged elements
        int[] arr3 = new int[arr1.length + arr2.length];

        // Copy elements of first array
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }

        // Copy elements of second array
        for (int i = 0; i < arr2.length; i++) {
            arr3[arr1.length + i] = arr2[i];
        }

        // Print merged array
        System.out.println("Merged Array:");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}