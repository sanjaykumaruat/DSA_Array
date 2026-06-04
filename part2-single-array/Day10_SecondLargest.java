package sinlge.array.part2;

import java.util.Arrays;
public class Day10_SecondLargest {
	public static void main(String[] args) {
		int[] arr = { 12, 35, 1, 10, 34, 1 };
		System.out.println("Second Largest Element: " + findSecondLargest(arr));
	}

	static int findSecondLargest(int[] arr) {
		Arrays.sort(arr);
		for (int i = arr.length - 2; i >= 0; i--) {
			if (arr[i] < arr[arr.length - 1])
				return arr[i];
		}
		return -1; // No second largest element found
	}
}
