package com.question.array;

import java.util.Arrays;

public class P06_MoveZeroes {
	public static void moveZeroes(int[] nums) {

		int j = 0;

		// Move non-zero elements to front
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				nums[j++] = nums[i];
			}
		}

		// Fill remaining positions with 0
		while (j < nums.length) {
			nums[j++] = 0;
		}
	}

	public static void main(String[] args) {

		int[] nums = { 0, 1, 0, 3, 12 };

		moveZeroes(nums);

		System.out.println(Arrays.toString(nums));
	}
}