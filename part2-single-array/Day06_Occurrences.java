package sinlge.array.part2;

import java.util.*;

public class Day06_Occurrences {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 2, 3,-1}; // Given array
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        System.out.println("Integer Occurrences:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
