package LeetCode.productarray_exceptself;

public class ProductArrayExceptSelf_BruteForce {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        // Iterate over each element in the array
        for (int i = 0; i < n; i++) {
            int product = 1; // Initialize product for the current element

            // Calculate the product of all elements except the one at index i
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    product *= nums[j];
                }
            }

            result[i] = product; // Store the product in the result array
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] result = productExceptSelf(nums);

        System.out.print("Product of array except self (Brute Force): ");
        for (int value : result) {
            System.out.print(value + " ");
        }
    }
}
