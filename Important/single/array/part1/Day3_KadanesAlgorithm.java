package single.array.part1;

public class Day3_KadanesAlgorithm {
//
//    // Brute-force method: O(n^2)
//    public static void maxSubarraySumBruteForce(int[] arr) {
//        int maxSum = Integer.MIN_VALUE;
//        int start = 0, end = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            int currentSum = 0;
//            for (int j = i; j < arr.length; j++) {
//                currentSum += arr[j];
//
//                if (currentSum > maxSum) {
//                    maxSum = currentSum;
//                    start = i;
//                    end = j;
//                }
//            }
//        }
//
//        // Print result
//        System.out.println("Brute Force:");
//        System.out.println("Maximum Subarray Sum: " + maxSum);
//        System.out.print("Subarray Elements: ");
//        for (int i = start; i <= end; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println("\n");
//    }


	    // Kadane's Algorithm: O(n)
	    public static int maxSubarraySumKadane(int[] arr) {
	        int currentSum = 0;
	        int max = Integer.MIN_VALUE;

	        for (int i = 0; i < arr.length; i++) {
	            currentSum = currentSum + arr[i];

	            if (currentSum > max) {
	                max = currentSum;
	            }

	            if (currentSum < 0) {
	                currentSum = 0;
	            }
	        }

	        return max;
	    }

	    public static void main(String[] args) {

	        int[] arr = {1, -2, 3, 4, -1};

	        int result = maxSubarraySumKadane(arr);
	        System.out.println("Maximum Subarray Sum: " + result);
	    }
	}

