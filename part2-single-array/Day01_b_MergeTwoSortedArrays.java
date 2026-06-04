package sinlge.array.part2;

//Time Complexity	O(n1 + n2)
//Space Complexity	O(n1 + n2)
import java.util.Arrays;

public class Day01_b_MergeTwoSortedArrays {

    public static int[] merge(int[] arr1, int[] arr2) {

        int n1 = arr1.length;
        int n2 = arr2.length;

        int[] result = new int[n1 + n2];

        int i = 0, j = 0, k = 0;

        // Compare and merge
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                result[k++] = arr1[i++];
            } else {
                result[k++] = arr2[j++];
            }
        }

        // Copy remaining elements
        while (i < n1) {
            result[k++] = arr1[i++];
        }

        while (j < n2) {
            result[k++] = arr2[j++];
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 4};
        int[] arr2 = {1, 3, 4};

        int[] merged = merge(arr1, arr2);

        System.out.println("Merged Array: " + Arrays.toString(merged));
    }
}
