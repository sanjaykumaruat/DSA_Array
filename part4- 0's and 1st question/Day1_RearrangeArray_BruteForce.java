package interview_0_and_1;


import java.util.Arrays;

public class Day1_RearrangeArray_BruteForce {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 0};  // Input array
        int[] result = new int[arr.length]; // Extra array

        int index = 0;

        // Step 1: Copy all 0s to result array
        for (int num : arr) {
            if (num == 0) {
                result[index++] = 0;
            }
        }

        // Step 2: Copy all 1s to result array
        for (int num : arr) {
            if (num == 1) {
                result[index++] = 1;
            }
        }

        System.out.println("Rearranged array (Brute Force): " + Arrays.toString(result));
    }
}
