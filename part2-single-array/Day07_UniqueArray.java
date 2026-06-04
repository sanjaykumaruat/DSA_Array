package sinlge.array.part2;

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class Day07_UniqueArray {
    public static void findUniqueElements(int[] arr) {
        Map<Integer, Integer> elementCountMap = new HashMap<>();

        // Count occurrences of each element
        for (int num : arr) {
            elementCountMap.put(num, elementCountMap.getOrDefault(num, 0) + 1);
        }

        System.out.println("Unique Elements:");
        for (Map.Entry<Integer, Integer> entry : elementCountMap.entrySet()) {
            if (entry.getValue() == 1) {  // Print only elements that appear once
                System.out.println(entry.getKey());
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {-1, 2, 3, 4, 2, 5, 6, 1, 3};
        System.out.println("Input Array: " + Arrays.toString(arr));
        findUniqueElements(arr);
    }
}
