// Sort array elements in ascending order
class SortArrayAscending {
    public static void main(String[] args) {

        // Declare and initialize array
        int[] arr = {45, 12, 78, 34, 23};

        int n = arr.length;

        // Sorting logic (Bubble Sort)
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Output
        System.out.println("Array elements in ascending order:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}