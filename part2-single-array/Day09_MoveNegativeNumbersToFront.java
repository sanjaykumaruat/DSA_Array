package sinlge.array.part2;


import java.util.Arrays;

public class Day09_MoveNegativeNumbersToFront {
    public static void moveNegativesToFront(int arr[]) {
        int n = arr.length;
        int temp[] = new int[n];
        int index = 0;

        // First store all negative numbers
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                temp[index++] = arr[i];
            }
        }

        // Then store all positive numbers
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                temp[index++] = arr[i];
            }
        }

        // Copy temp array back to arr
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int arr[] = { -1, 3, -7, 4 };

        System.out.println("Original Array: " + Arrays.toString(arr));

        moveNegativesToFront(arr);

        System.out.println("Rearranged Array: " + Arrays.toString(arr));
    }
}
