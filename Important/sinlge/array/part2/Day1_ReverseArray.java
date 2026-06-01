package sinlge.array.part2;

import java.util.Arrays;

class Day1_ReverseArray {
	public static void main(String[] args) {
		// Day12_ReverseArray obj = new Day12_ReverseArray(); // Create an object
		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println("original array" + Arrays.toString(arr));
		reversearray(arr);
		System.out.println("After revese" + Arrays.toString(arr));
	}
	private static void reversearray(int[] arr) {
		int n = arr.length;
		int i = 0;
		int j = n - 1;
		while (i < j) {

			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;

		}
	}
}