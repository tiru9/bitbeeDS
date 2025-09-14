import java.util.*;

class ThreeSum_Hashmap {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums); // Sort to handle duplicates easily
        Set<List<Integer>> triplets = new HashSet<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int target = -nums[i];
            Set<Integer> seen = new HashSet<>();

            for (int j = i + 1; j < n; j++) {
                int complement = target - nums[j];
                if (seen.contains(complement)) {
                    triplets.add(Arrays.asList(nums[i], nums[j], complement));
                }
                seen.add(nums[j]);
            }
        }

        return new ArrayList<>(triplets);
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(nums));
    }
}
