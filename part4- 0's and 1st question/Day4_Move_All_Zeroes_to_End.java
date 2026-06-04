package interview_0_and_1;

import java.util.Arrays;

public class Day4_Move_All_Zeroes_to_End {
	public static void main(String[] args) {
		int[] arr1 = { 0, 4, 0, 5, 0 };
		

		System.out.println("\n--- Brute Force Approach ---");
		bruteForceMoveZeroes(arr1);

		System.out.println("\n--- Optimized In-place Approach ---");
		optimizedMoveZeroes(arr1);
	}

	// ✅ Brute-force using extra array
	public static void bruteForceMoveZeroes(int[] arr) {
		int n = arr.length;
		int[] result = new int[n];
		int index = 0;

		// Copy all non-zero elements
		for (int i = 0; i < n; i++) {
			if (arr[i] != 0) {
				result[index++] = arr[i];
			}
		}

		System.out.println("Modified array: " + Arrays.toString(result));
	}

	// ✅ Optimized in-place using two-pointer technique
	public static void optimizedMoveZeroes(int[] arr) {
		int count = 0; // Position to place the next non-zero

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				// Swap arr[i] and arr[count]
				int temp = arr[i];
				arr[i] = arr[count];
				arr[count] = temp;
				count++;
			}
		}

		System.out.println("Modified array: " + Arrays.toString(arr));
	}
}
