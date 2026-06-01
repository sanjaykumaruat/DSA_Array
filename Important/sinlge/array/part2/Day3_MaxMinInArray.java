package sinlge.array.part2;

public class Day3_MaxMinInArray {

	public static void main(String[] args) {
		 int[] arr = {4, 8, 1, 9, 5, 3, 2, 7, 6};

		    int min = arr[0];
		    int max = arr[0];

		    for (int i = 1; i < arr.length; i++) {
		      if (arr[i] < min) {
		        min = arr[i];
		      }
		      if (arr[i] > max) {
		        max = arr[i];
		      }
		    }

		    System.out.println("Minimum number: " + min);
		    System.out.println("Maximum number: " + max);
	}

	
}
