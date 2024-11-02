import java.util.Arrays;
import java.util.Comparator;

public class TwoSumSolution2 {
    public static int[] twoSum(int[] nums, int target) {
        // Create an array of pairs (element, index)
        int[][] pairs = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            pairs[i][0] = nums[i];
            pairs[i][1] = i;
        }

        // Sort the array of pairs based on the elements
        Arrays.sort(pairs, Comparator.comparingInt(a -> a[0]));

        // Initialize two pointers
        int left = 0;
        int right = nums.length - 1;

        // Iterate and find the pair
        while (left < right) {
            int currentSum = pairs[left][0] + pairs[right][0];
            if (currentSum == target) {
                // Return the indices of the original elements
                return new int[]{pairs[left][1], pairs[right][1]};
            } else if (currentSum < target) {
                left++;
            } else {
                right--;
            }
        }

        // No solution found
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));  // Output: [0, 1]
    }
}