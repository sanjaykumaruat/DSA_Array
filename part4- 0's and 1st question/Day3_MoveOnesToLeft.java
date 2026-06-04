package interview_0_and_1;

import java.util.*;

public class Day3_MoveOnesToLeft {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 1, 3 };

		int n = arr.length;
		int[] result = new int[n];
		int index = 0;

		// Step 1: First, add all 1s to result array
		for (int i = 0; i < n; i++) {
			if (arr[i] == 1) {
				result[index++] = 1;
			}
		}

		// Step 2: Then, add all other elements
		for (int i = 0; i < n; i++) {
			if (arr[i] != 1) {
				result[index++] = arr[i];
			}
		}

		// Output result
		System.out.println("Modified array (1s moved to left): " + Arrays.toString(result));
	}
}
