package single.array.part1;


import java.util.HashSet;
import java.util.Set;

public class Day14_FindDuplicateHashSet {

    public static int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (!set.add(num)) {
                return num;   // duplicate found
            }
        }

        return -1; // should never reach here
    }
 
    public static void main(String[] args) {
        int[] nums = {1,5,3, 4,4,4, };

        int duplicate = findDuplicate(nums);
        System.out.println("Duplicate number: " + duplicate);
    }
}
