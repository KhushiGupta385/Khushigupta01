// copy elements from one array to another.
class CopyArray {
    public static void main(String[] args) {

        // Original array
        int[] arr1 = {10, 20, 30, 40, 50};

        // New array with same size
        int[] arr2 = new int[arr1.length];

        // Copy elements
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }

        // Print original array
        System.out.println("Original Array:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

        // Print copied array
        System.out.println("\nCopied Array:");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
