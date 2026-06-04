package single.array.part1;

public class Day09_2MissingNumber_SecApproach {

    public static int missingNumber(int[] nums) {

        int n = nums.length;

        // Expected sum of numbers from 0 to n
        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {

        int[] nums = {3, 0, 1, 2, 6};   // Missing number is 4 (⚠ invalid input per LeetCode)

        int result = missingNumber(nums);
        System.out.println("Missing Number: " + result);
    }
}
