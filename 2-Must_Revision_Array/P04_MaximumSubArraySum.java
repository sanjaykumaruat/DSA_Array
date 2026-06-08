package com.question.array;

public class P04_MaximumSubArraySum {

	public static void main(String[] args) {
		int[] arr = { 1, -2, 3, 4, -1 };
		
		int result= maxSubArray(arr);
		System.out.println("max sum array  -> " + result);

	}

	public  static int maxSubArray(int[] arr) {
		
		int start=0;
		int end=0;
		int maxSum=Integer.MIN_VALUE;  //smallest possible number, maxSum = -2147483648
		for( int i=0; i< arr.length ; i++) {
			int sum=0;
			
			for( int j=i; j< arr.length;j++) {
				sum= sum+arr[j];
				
				if(sum > maxSum) {
					maxSum=sum;
					start=i;
					end=j;
					
				}
			}
		}
      System.out.println(" maximun subarray sum: " + maxSum);	
      System.out.print("Subarray Elements: ");
		
		for (int i = start; i <= end; i++) {
			System.out.print(arr[i] + " ");
		}
		
   		
	return maxSum;
		
		
	}

}
