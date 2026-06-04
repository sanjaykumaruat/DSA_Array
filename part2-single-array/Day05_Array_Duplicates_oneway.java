package sinlge.array.part2;

import java.util.*;

public class Day05_Array_Duplicates_oneway {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 2, 3, 0, 0}; // Given array
        HashSet<Integer> uniqueSet = new HashSet<>();
        HashSet<Integer> duplicateSet = new HashSet<>();
        
        for (int num : arr) {
            if (!uniqueSet.add(num)) { // If adding fails, it's a duplicate
                duplicateSet.add(num);
            }
        }
        System.out.println("Duplicates: " + duplicateSet);
    }
}
