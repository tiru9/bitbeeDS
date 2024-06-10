public class QuickSort {

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Find the pivot index
            int pivotIndex = partition(arr, low, high);

            // Recursively sort the elements before and after the partition
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        // Choose the rightmost element as the pivot
        int pivot = arr[high];
        int i = (low - 1); // Index of the smaller element

        for (int j = low; j < high; j++) {
            // If the current element is less than or equal to the pivot
            if (arr[j] <= pivot) {
                i++;

                // Swap arr[i] with arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap the pivot element with the element at i+1
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        // Return the partition index
        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        int n = arr.length;

        // Call quickSort on the entire array
        quickSort(arr, 0, n - 1);

        // Print the sorted array
        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
