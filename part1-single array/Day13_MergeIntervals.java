package single.array.part1;

import java.util.*;

public class Day13_MergeIntervals {

    public static int[][] merge(int[][] intervals) {

        if (intervals.length <= 1)
            return intervals;

        // Sort intervals by starting point
        Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]));

        List<int[]> result = new ArrayList<>();

        int[] newInterval = intervals[0];
        result.add(newInterval);

        for (int i = 1; i < intervals.length; i++) {
            int[] interval = intervals[i];

            if (interval[0] <= newInterval[1]) {
                // Overlapping intervals → merge
                newInterval[1] = Math.max(newInterval[1], interval[1]);
            } else {
                // Non-overlapping interval
                newInterval = interval;
                result.add(newInterval);
            }
        }

        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {

        int[][] intervals = {
            {1, 3},
            {2, 6},
            {8, 10},
            {15, 18}
        };

        int[][] merged = merge(intervals);

        System.out.println("Merged Intervals:");
        for (int[] interval : merged) {
            System.out.println(Arrays.toString(interval));
        }
    }
}
