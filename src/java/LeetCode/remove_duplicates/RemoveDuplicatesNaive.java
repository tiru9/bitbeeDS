package LeetCode.remove_duplicates;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesNaive {
    public static int removeDuplicates(int[] nums) {
        List<Integer> uniqueNums = new ArrayList<>();
        for (int num : nums) {
            if (!uniqueNums.contains(num)) {
                uniqueNums.add(num);
            }
        }

        // Overwrite the input array in-place
        for (int i = 0; i < uniqueNums.size(); i++) {
            nums[i] = uniqueNums.get(i);
        }

        return uniqueNums.size();
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 2, 2, 3, 3, 4};
        int result = removeDuplicates(nums);
        System.out.println("Array after removing duplicates: ");
        for (int i = 0; i < result; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("\nLength: " + result);
    }
}
