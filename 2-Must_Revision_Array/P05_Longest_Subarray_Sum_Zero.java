package com.question.array;
public class P05_Longest_Subarray_Sum_Zero {

    public static void findLongestZeroSumSubarray(int[] arr) {

        int maxLength = 0;
        int start = -1;
        int end = -1;

        for (int i = 0; i < arr.length; i++) {

            int sum = 0;

            for (int j = i; j < arr.length; j++) {

                sum = sum + arr[j];

                if (sum == 0) {

                    int length = j - i + 1;

                    if (length > maxLength) {
                        maxLength = length;
                        start = i;
                        end = j;
                    }
                }
            }
        }

        if (maxLength > 0) {

            System.out.println("Longest Zero Sum Subarray:");
            System.out.println("Start Index : " + start);
            System.out.println("End Index   : " + end);
            System.out.println("Length      : " + maxLength);

            System.out.print("Elements     : ");

            for (int i = start; i <= end; i++) {
                System.out.print(arr[i] + " ");
            }

        } else {
            System.out.println("No Zero Sum Subarray Found");
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, -2, 2, 3, -3, 7, -5};

        findLongestZeroSumSubarray(arr);
    }
}