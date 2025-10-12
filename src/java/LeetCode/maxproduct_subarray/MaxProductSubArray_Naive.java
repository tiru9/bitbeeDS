package LeetCode.maxproduct_subarray;

public class MaxProductSubArray_Naive {
    public static int maxProductNaive(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        int maxProduct = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            long prod = 1;
            for (int j = i; j < n; j++) {
                prod *= nums[j];
                if (prod > maxProduct) maxProduct = (int) prod;
            }
        }
        return maxProduct;
    }

    public static void main(String args[]){
        int nums[] = new int[]{1,-2,-3,4};
        System.out.println("Max product subarray is : "+maxProductNaive(nums));
    }
}
