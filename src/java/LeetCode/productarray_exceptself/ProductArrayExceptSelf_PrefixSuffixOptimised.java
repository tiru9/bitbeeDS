package LeetCode.productarray_exceptself;

public class ProductArrayExceptSelf_PrefixSuffixOptimised {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        // Step 1: Compute the prefix products and store them in the result array
        result[0] = 1; // There are no elements to the left of the first element
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        // Step 2: Compute the suffix products on the fly and update the result array
        int suffix = 1; // Initialize suffix product to 1
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= suffix; // Multiply with the suffix product
            suffix *= nums[i]; // Update the suffix product
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] result = productExceptSelf(nums);

        System.out.print("Product of array except self: ");
        for (int value : result) {
            System.out.print(value + " ");
        }
    }
}
