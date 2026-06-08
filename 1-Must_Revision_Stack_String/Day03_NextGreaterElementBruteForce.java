package com.questions.important;

import java.util.Arrays;

public class Day03_NextGreaterElementBruteForce {

	public static void main(String[] args) {

		int[] arr = { 4, 5, 2, 10 };
		System.out.println("given array" + Arrays.toString(arr));
		int[] result = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {

			int nextGreater = -1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] > arr[i]) {
					nextGreater = arr[j];
					break;
				}
			}
			result[i] = nextGreater;

		}
		System.out.println("result array" + Arrays.toString(result));

	}
}
//given array[4, 5, 2, 10]
//result array[5, 10, 10, -1]