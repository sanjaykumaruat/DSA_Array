package sinlge.array.part2;

import java.util.ArrayList;

public class Day8_Alternates_in_an_Array {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, -5, -6, 4 }; // Example input array
		System.out.println("Alternate elements: " + getAlternates(arr));
	}

	public static ArrayList<Integer> getAlternates(int[] arr) {
		ArrayList<Integer> result = new ArrayList<>();
		for (int i = 0; i < arr.length; i += 2) {
			result.add(arr[i]); // Add every alternate element (0, 2, 4, ...)
		}
		return result;
	}
}
