package com.question.array;

import java.util.Arrays;

public class P10_MissingNumber {

    public static void main(String[] args) {

    	int[] nums = {3, 0, 1, 2, 5}; // Missing number is 4

        System.out.println("Input Array: " + Arrays.toString(nums));

        int result = missingNumber(nums);

        System.out.println("Missing Number: " + result);
    }

    private static int missingNumber(int[] nums) {

        int xor = 0;
        int n = nums.length;

        // XOR numbers from 0 to n
        for (int i = 0; i <= n; i++) {
            xor ^= i;
        }

        // XOR array elements
        for (int num : nums) {
            xor ^= num;
        }

        return xor;
    }
}
