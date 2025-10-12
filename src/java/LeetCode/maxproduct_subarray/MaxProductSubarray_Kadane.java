package LeetCode.maxproduct_subarray;

public class MaxProductSubarray_Kadane {
    public static int maxProductKadane(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int maxSoFar = nums[0];
        int minSoFar = nums[0];
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            if (num < 0) {
                int tmp = maxSoFar;
                maxSoFar = minSoFar;
                minSoFar = tmp;
            }
            maxSoFar = Math.max(num, maxSoFar * num);
            minSoFar = Math.min(num, minSoFar * num);
            result = Math.max(result, maxSoFar);
        }
        return result;
    }

    public static void main(String args[]){
        int nums[] = new int[]{1,-2,-3,4};
        System.out.println("Max product subarray is : "+maxProductKadane(nums));
    }
}
