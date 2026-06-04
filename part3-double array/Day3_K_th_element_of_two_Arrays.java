package two.array;

public class Day3_K_th_element_of_two_Arrays {
    public static int findKthElement(int[] arr1, int[] arr2, int k) {
        int i = 0, j = 0, count = 0;
        
        while (i < arr1.length && j < arr2.length) {
            int val = (arr1[i] < arr2[j]) ? arr1[i++] : arr2[j++];
            count++;
            if (count == k) return val;
        }

        // If elements remain in arr1
        while (i < arr1.length) {
            count++;
            if (count == k) return arr1[i];
            i++;
        }

        // If elements remain in arr2
        while (j < arr2.length) {
            count++;
            if (count == k) return arr2[j];
            j++;
        }

        return -1; // If k is out of bounds
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 3, 6, 7, 9};
        int[] arr2 = {1, 4, 8, 10};
        int k = 5;

        System.out.println("The " + k + "-th element is: " + findKthElement(arr1, arr2, k));
    }
}
