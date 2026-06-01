package sinlge.array.part2;


import java.util.HashMap;
import java.util.Map;

public class Day5_ArrayDuplicate_Secondway {
	 public static void main(String[] args) {
		  int[] arr = { 2, 3, 4, 2, 5, 6, 1, 3};
		 
        Map<Integer, Integer> elementCountMap = new HashMap<>();

        // Count occurrences of each element
        for (int num : arr) {
            elementCountMap.put(num, elementCountMap.getOrDefault(num, 0) + 1);
        }

        // Print elements that appear more than once
        System.out.println("Duplicate Elements:");
        for (Map.Entry<Integer, Integer> entry : elementCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }
    
}
