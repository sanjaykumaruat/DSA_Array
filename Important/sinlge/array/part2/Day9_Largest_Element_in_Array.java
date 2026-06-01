package sinlge.array.part2;

public class Day9_Largest_Element_in_Array {
	public static void main(String[] args) {
		int[] arr = { 1, 8, 7, 56, 90 }; // Given array
		int max = arr[0]; // Initialize max with the first element

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i]; // Update max if a larger element is found
			}
		}

		System.out.println("Largest Element: " + max);
	}

}
