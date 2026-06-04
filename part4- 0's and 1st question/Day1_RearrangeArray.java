
package interview_0_and_1;

import java.util.Arrays;

public class Day1_RearrangeArray {
	public static void main(String[] args) {
		int[] arr = { 0, 1, 1, 0, 0};

		int index = 0;
		for (int num : arr) {
			if (num == 0)
				arr[index++] = 0;
		}
		while (index < arr.length)
			arr[index++] = 1;

		System.out.println("Rearranged array: " + Arrays.toString(arr));
	}
}





