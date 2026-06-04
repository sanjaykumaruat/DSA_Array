package single.array.part1;

public class Day12_MaximumProductSubarray {

    public static int maxProduct(int[] nums) {

        int n = nums.length;

        long leftProduct = 1;
        long rightProduct = 1;
        long ans = nums[0];

        for (int i = 0; i < n; i++) {

            // Reset product if it becomes zero
            if (leftProduct == 0) leftProduct = 1;
            if (rightProduct == 0) rightProduct = 1;

            // Prefix product
            leftProduct = leftProduct * nums[i];

            // Suffix product
            rightProduct = rightProduct * nums[n - 1 - i];

            ans = Math.max(ans, Math.max(leftProduct, rightProduct));
        }

        return (int) ans;
    }

    public static void main(String[] args) {

        int[] nums1 = {2, 3, -2, 4};
        int[] nums2 = {-2, 0, -1};
        int[] nums3 = {-2, 3, -4};

        System.out.println("Max Product 1: " + maxProduct(nums1)); // 6
        System.out.println("Max Product 2: " + maxProduct(nums2)); // 0
        System.out.println("Max Product 3: " + maxProduct(nums3)); // 24
    }
}
