package LeetCode.remove_duplicates;

public class RemoveDuplicatesOptimal {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int slow = 0;
        for (int fast = 1; fast < nums.length; fast++) {
            if (nums[fast] != nums[slow]) {
                slow++;
                nums[slow] = nums[fast];
            }
        }
        return slow + 1;
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
