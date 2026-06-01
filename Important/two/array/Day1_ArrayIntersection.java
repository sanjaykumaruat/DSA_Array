package two.array;
//349. Intersection of Two Arrays : https://leetcode.com/problems/intersection-of-two-arrays/description/
import java.util.*;

	public class Day1_ArrayIntersection {
	    public static void main(String[] args) {
	        int[] a = {1, 2, 3, 4, 5}; // First array
	        int[] b = {1, 2, 3};       // Second array

	        HashSet<Integer> set = new HashSet<>();
	        HashSet<Integer> intersection = new HashSet<>();

	        // Add all elements from first array to the set
	        for (int num : a) {
	            set.add(num);
	        }

	        // Check which elements in second array exist in the set
	        for (int num : b) {
	            if (set.contains(num)) {
	                intersection.add(num);
	            }
	        }

	        // Print the intersection elements
	        System.out.println("Intersection of Arrays: " + intersection);
	    }
	}


