package com.question.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P02_TwoSum {

	public static void main(String[] args) {
		int[] arr = { 2, 11, 15, 9, 7 };
		int target = 9;
		System.out.println("input array" + Arrays.toString(arr));
		int[] result = TwoSum(arr, target);
		System.out.println("output array" + Arrays.toString(result));

	}

	private static int[] TwoSum(int[] arr, int target) {

		// <Integer> list= new ArrayList<>();
		int n = arr.length;
		int[] ans = { -1, -1 };

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {

				if (arr[i] + arr[j] == target) {

					ans[0] = i;
					ans[1] = j;
					return ans;
				}

			}
		}
		return ans;

	}

}
