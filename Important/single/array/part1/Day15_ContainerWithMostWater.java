package single.array.part1;
//package leetcode.medium;
import java.util.Arrays;

public class Day15_ContainerWithMostWater {

	public static int maxArea(int[] height) {

		int left = 0;
		int right = height.length - 1;
		int maxArea = 0;

		while (left < right) {

			int width = right - left;
			int minHeight = Math.min(height[left], height[right]);
			int area = minHeight * width;

			maxArea = Math.max(maxArea, area);

			// Move pointer with smaller height
			if (height[left] < height[right]) {
				left++;
			} else {
				right--;
			}
		}

		return maxArea;
	}

	public static void main(String[] args) {

		int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };

		int result = maxArea(height);

		System.out.println("Heights: " + Arrays.toString(height));
		System.out.println("Maximum Water Container Area: " + result);
	}
}
