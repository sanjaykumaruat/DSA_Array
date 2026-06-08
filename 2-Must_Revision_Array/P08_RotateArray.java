package com.question.array;

import java.util.Arrays;
public class P08_RotateArray {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int d = 2;

		System.out.println("Given array is: " + Arrays.toString(arr));
		rotateArray(arr, d);
		System.out.println("Rotated array is: " + Arrays.toString(arr));
	}

	static void rotateArray(int[] arr, int d) {

		int n = arr.length;
		d = d % n;

		reverse(arr, 0, d - 1);
		reverse(arr, d, n - 1);
		reverse(arr, 0, n - 1);
	}

	static void reverse(int[] arr, int i, int j) {

		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;

			i++;
			j--;
		}
	}
}