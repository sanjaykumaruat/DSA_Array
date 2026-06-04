package single.array.part1;

import java.util.HashMap;
import java.util.Map;

public class Day10_LongestConsecutiveSequence {

    static int longestConsecutive(int[] nums) {

        int longestLength = 0;
        Map<Integer, Boolean> numberTravelledMap = new HashMap<>();

        // Initialize map
        for (int num : nums) {
            numberTravelledMap.put(num, Boolean.FALSE);
        }

        for (int num : nums) {

            // Skip if already processed
            if (Boolean.TRUE.equals(numberTravelledMap.get(num))) {
                continue;
            }

            int currentLength = 1;
            numberTravelledMap.put(num, Boolean.TRUE);

            // Check forward
            int nextNum = num + 1;
            while (numberTravelledMap.containsKey(nextNum)
                    && Boolean.FALSE.equals(numberTravelledMap.get(nextNum))) {

                currentLength++;
                numberTravelledMap.put(nextNum, Boolean.TRUE);
                nextNum++;
            }

            // Check backward
            int prevNum = num - 1;
            while (numberTravelledMap.containsKey(prevNum)
                    && Boolean.FALSE.equals(numberTravelledMap.get(prevNum))) {

                currentLength++;
                numberTravelledMap.put(prevNum, Boolean.TRUE);
                prevNum--;
            }

            longestLength = Math.max(longestLength, currentLength);
        }

        return longestLength;
    }

    public static void main(String[] args) {
        int[] nums = {100, 200, 1, 3, 6, 5, 8, 7};
        int result = longestConsecutive(nums);
        System.out.println("Longest Consecutive Sequence Length: " + result);
    }
}
