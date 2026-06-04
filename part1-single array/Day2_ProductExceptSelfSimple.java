package single.array.part1;

import java.util.Arrays;

public class Day2_ProductExceptSelfSimple {

	public static int[] productExceptSelf(int[] nums) {
		int n = nums.length;
		int[] left = new int[n]; // Product of all elements to the left of i
		int[] right = new int[n]; // Product of all elements to the right of i
		int[] result = new int[n]; // Final result

		// Fill left array
		left[0] = 1; // Nothing to the left of first element
		for (int i = 1; i < n; i++) {
			left[i] = nums[i - 1] * left[i - 1];
		}

		// Fill right array
		right[n - 1] = 1; // Nothing to the right of last element
		for (int i = n - 2; i >= 0; i--) {
			right[i] = nums[i + 1] * right[i + 1];
		}

		// Multiply left and right for final result

		for (int i = 0; i < n; i++) {
			result[i] = left[i] * right[i];
		}

		return result;
	}

	public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] output = productExceptSelf(nums);
        System.out.println("Product Except Self: " + Arrays.toString(output));
    }
}

