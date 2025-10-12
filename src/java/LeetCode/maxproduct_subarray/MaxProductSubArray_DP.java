package LeetCode.maxproduct_subarray;

public class MaxProductSubArray_DP {
    public static int maxProductDP(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int maxSoFar = nums[0];
        int minSoFar = nums[0];
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            long a = (long) maxSoFar * num;
            long b = (long) minSoFar * num;
            int newMax = (int) Math.max(num, Math.max(a, b));
            int newMin = (int) Math.min(num, Math.min(a, b));
            maxSoFar = newMax;
            minSoFar = newMin;
            result = Math.max(result, maxSoFar);
        }
        return result;
    }

    public static void main(String args[]){
        int nums[] = new int[]{1,-2,-3,4};
        System.out.println("Max product subarray is : "+maxProductDP(nums));
    }
}
