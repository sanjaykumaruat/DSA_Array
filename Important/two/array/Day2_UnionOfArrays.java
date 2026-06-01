package two.array;


import java.util.HashSet;

public class Day2_UnionOfArrays {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5}; // First array
        int[] b = {1, 2, 3};       // Second array

        HashSet<Integer> set = new HashSet<>();

        // Add all elements from the first array
        for (int num : a) {
            set.add(num);
        }

        // Add all elements from the second array
        for (int num : b) {
            set.add(num);
        }

        // Print the union elements
        System.out.println("Union of Arrays: " + set);
    }
}
