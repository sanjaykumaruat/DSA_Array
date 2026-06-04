package sinlge.array.part2;

import java.util.Arrays;

public class Day02_ArraySum {

	public static void main(String[] args) {
		int[] arr = { 1,2,3,4};
		
		System.out.println("original array" + Arrays.toString(arr));
		arraySum(arr);
		System.out.println("After array" + Arrays.toString(arr));
		
	}

	private static int arraySum(int[] arr) {
		
		int sum=0;
		for(int i=0 ; i< arr.length; i++) {
			
			sum =sum + arr[i];
		}
		return sum;
	}
	
}
