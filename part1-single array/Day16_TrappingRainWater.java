package single.array.part1;

//package leetcode.hard;
import java.util.Arrays;

public class Day16_TrappingRainWater {

	public static int trap(int[] height) {

		if (height == null || height.length == 0)
			return 0;

		int totalWater = 0;
		int n = height.length;

		int[] leftMax = new int[n];
		int[] rightMax = new int[n];

		// Build leftMax array
		leftMax[0] = height[0];
		for (int i = 1; i < n; i++) {
			leftMax[i] = Math.max(leftMax[i - 1], height[i]);
		}

		// Build rightMax array
		rightMax[n - 1] = height[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			rightMax[i] = Math.max(rightMax[i + 1], height[i]);
		}

		// Calculate trapped water
		for (int i = 0; i < n; i++) {
			totalWater += Math.min(leftMax[i], rightMax[i]) - height[i];
		}

		return totalWater;
	}

	public static void main(String[] args) {

		int[] height = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };

		int result = trap(height);

		System.out.println("Heights: " + Arrays.toString(height));
		System.out.println("Trapped Water: " + result);
	}
}
