package sinlge.array.part2;

import java.util.Arrays;

	public class Day08_SeparatePositiveNegative {
	    public static void main(String[] args) {
	        int[] arr = {-1, 2, 5, 8, 10, -6, 0};
	        int left = 0;

	        for (int right = 0; right < arr.length; right++) {
	            if (arr[right] > 0) {
	                // Swap negative number to the left
	                int temp = arr[left];
	                arr[left] = arr[right];
	                arr[right] = temp;
	                left++;
	            }
	        }

	        System.out.println("Rearranged array: " + Arrays.toString(arr));
	    }
	}
