package com.question.array;

//Boyer–Moore Majority Vote Algorithm
public class P09_MajorityElement {
	public static void main(String[] args) {

		int[] nums = { 2, 2, 1, 1, 1, 2, 2 };

		int result = majorityElement(nums);
		System.out.println("Majority Element: " + result);
	}

	public static int majorityElement(int[] nums) {

		int majority = nums[0];
		int votes = 1;

		for (int i = 1; i < nums.length; i++) {

			if (votes == 0) {
				majority = nums[i];
				votes = 1;
			} else if (majority == nums[i]) {
				votes++;
			} else {
				votes--;
			}
		}
		return majority;
	}
	
}
