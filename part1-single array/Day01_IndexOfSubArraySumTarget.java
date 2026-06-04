package single.array.part1;

import java.util.ArrayList;
import java.util.List;

class IndexOfSubArraySumTarget_Brute {
	 List<Integer> subarraySum(int[] arr, int target) {
		List<Integer> al = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = i; j < arr.length; j++) {
				sum = sum + arr[j];
				if (sum == target) {
					al.add(i); // 0-based index
					al.add(j); // 0-based index
					return al;
				}
			}
		}

		al.add(-1);
		return al;
	}
}

class IndexOfSubArraySumTarget_Optimize {
	List<Integer> subarraySum(int[] arr, int target) {
		List<Integer> al = new ArrayList<>();
		int start = 0;
		int sum = 0;

		for (int end = 0; end < arr.length; end++) {
			sum =sum+ arr[end];

			while (sum > target && start <= end) {
				sum =sum- arr[start];
				start++;
			}

			if (sum == target) {
				al.add(start); // 0-based index
				al.add(end); // 0-based index
		
				return al;
			}
		}

		al.add(-1);
		return al;
	}
}

public class Day01_IndexOfSubArraySumTarget {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 7, 5 };
		int target = 6;

		// Brute-force
//		IndexOfSubArraySumTarget_Brute brute = new IndexOfSubArraySumTarget_Brute();
//		List<Integer> bruteResult = brute.subarraySum(arr, target);
//		System.out.println("Brute-force result: " + bruteResult);

		// Optimized
		IndexOfSubArraySumTarget_Optimize optimized = new IndexOfSubArraySumTarget_Optimize();
		List<Integer> optimizedResult = optimized.subarraySum(arr, target);
		System.out.println("Optimized result: " + optimizedResult);
	}
}
