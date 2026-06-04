package single.array.part1;

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class Day1_TwoSum {

    // ✅ Brute Force: O(n^2)
//    public static int[] twoSumBruteForce(int[] arr, int target) {
//        int n = arr.length;
//        int[] ans = {-1, -1};
//
//        for (int i = 0; i < n; i++) {              // ✅ fixed condition
//            for (int j = i + 1; j < n; j++) {
//                if (arr[i] + arr[j] == target) {
//                    ans[0] = i;
//                    ans[1] = j;
//                    return ans;
//                }
//            }
//        }
//        return ans;
//    }

    // ✅ Optimized: O(n)
    public static int[] twoSumOptimized(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            map.put(nums[i], i);
        }

        return new int[] { -1, -1 };
    }
    public static void main(String[] args) {

        int[] nums1 = {2, 7, 11, 15,9};
        int target1 = 9;
//        System.out.println("Brute Force: " +
//                Arrays.toString(twoSumBruteForce(nums1, target1)));
        System.out.println("Optimized: " +
                Arrays.toString(twoSumOptimized(nums1, target1)));
        int[] nums2 = {-3, 4, 1, 2, -1};
        int target2 = 1;
        System.out.println("Optimized: " + Arrays.toString(twoSumOptimized(nums2, target2)));
    }
}
