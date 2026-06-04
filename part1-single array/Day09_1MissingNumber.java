package single.array.part1;

// this is bit manupulations based
public class Day09_1MissingNumber {

    public static int missingNumber(int[] nums) {

        int allXOR = 0;

        // XOR all numbers from 0 to n
        for (int i = 0; i <= nums.length; i++) {
            allXOR ^= i;
        }

        // XOR all elements of the array
        for (int num : nums) {
            allXOR ^= num;
        }

        return allXOR;
    }

    public static void main(String[] args) {

        int[] nums = {3, 0, 1,2,6};   // Missing number is 2

        int result = missingNumber(nums);
        System.out.println("Missing Number: " + result);
    }
}


//Correct Test Cases (All Scenarios)
//Case 1: Missing in middle
//int[] nums = {3, 0, 1};
//Output → 2
//
//Case 2: Missing 0
//int[] nums = {1, 2, 3};
//Output → 0
//
//Case 3: Missing n
//int[] nums = {0, 1, 2, 3};
//Output → 4
//
//Case 4: Single element
//int[] nums = {0};
//Output → 1
//
//Case 5: Unsorted
//int[] nums = {4, 2, 1, 0};
//Output → 3
//✔ Works in ALL valid scenarios
