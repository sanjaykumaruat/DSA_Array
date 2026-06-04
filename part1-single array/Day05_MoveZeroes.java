package single.array.part1;

import java.util.Arrays;

public class Day05_MoveZeroes {

    public static void moveZeroes(int[] nums) {

        int insertPosition = 0; // position to place next non-zero

        // Step 1: Move all non-zero elements forward
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[insertPosition++] = nums[i];
            }
        }

        // Step 2: Fill remaining positions with zero
        while (insertPosition < nums.length) {
            nums[insertPosition++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};

        moveZeroes(nums);

        System.out.print("Output: " + Arrays.toString(nums));
//        for (int n : nums) {
//            System.out.print(n + " ");
//        }
    }
}
