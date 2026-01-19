//Search for an element in an array
class SearchArray {
    public static void main(String[] args) {

        // Declare and initialize array
        int[] arr = {10, 20, 30, 40, 50};

        int key = 30;   // element to search
        boolean found = false;

        // Search element
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at position: " + (i + 1));
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element not found in the array");
        }
    }
}