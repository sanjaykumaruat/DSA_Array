package two.array;

import java.util.ArrayList;
import java.util.HashSet;

public class Day4_Find_missing_in_second_array {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 10 };
		int[] b = { 2, 3, 1, 0, 5 };

		ArrayList<Integer> missing = findMissing(a, b);
		System.out.println("Elements missing in second array: " + missing);
	}

	static ArrayList<Integer> findMissing(int[] a, int[] b) {
		ArrayList<Integer> result = new ArrayList<>();
		HashSet<Integer> set = new HashSet<>();

		for (int num : b) {
			set.add(num);
		}

		for (int num : a) {
			if (!set.contains(num)) {
				result.add(num);
			}
		}

		return result;
	}
}
