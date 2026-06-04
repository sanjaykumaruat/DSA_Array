package sinlge.array.part2;

import java.util.Arrays;

class Day04_Smallest_Positive_Missing {
    // Function to find the smallest positive number missing from the array.
    public int missingNumber(int[] arr) {
        // Sort the array
        Arrays.sort(arr);
        int small = 1;

        // Iterate through the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == small) {
                small++;
            }
        }
        return small;
    }


    public static void main(String[] args) {
    	Day04_Smallest_Positive_Missing obj = new Day04_Smallest_Positive_Missing(); // Create an instance of the Solution class
        
        int[] arr = {2, -3, 4, 1, 1, 7}; 
        
        int result = obj.missingNumber(arr); 
        
        System.out.println("Smallest positive missing number: " + result);
        // Expected Output: 3
    }
}
