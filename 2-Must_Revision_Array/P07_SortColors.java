package com.question.array;
//Dutch National Flag algorithm
public class P07_SortColors {

	public static void sortColors(int[] nums) {

		int start = 0;
		int mid = 0;
		int end = nums.length - 1;

		while (mid <= end) {
			switch (nums[mid]) {

			case 0:
				swap(nums, start, mid);
				mid++;
				start++;
				break;

			case 1:
				mid++;
				break;

			case 2:
				swap(nums, mid, end);
				end--;
				break;
			}
		}
	}

	private static void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

	public static void main(String[] args) {
		int[] nums = { 2, 0, 2, 1, 1, 0 };

		sortColors(nums);

		for (int n : nums) {
			System.out.print(n + " ");
		}
	}
}
