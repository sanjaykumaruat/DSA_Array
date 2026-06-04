package interview_0_and_1;


import java.util.Arrays;

class Day5_Segregate_0s_and_1s {
	  public static void main(String[] args) {
		  int[] arr = {0, 1, 1, 0, 1, 0, 1, 0}; // Input array
        int zero = 0;

        // Counting the number of zeroes
        for (int num : arr) {
            if (num == 0) {
                zero++;
            }
        }

        // Filling 0s on the left side
        for (int i = 0; i < zero; i++) {
            arr[i] = 0;
        }

        // Filling 1s on the right side
        for (int i = zero; i < arr.length; i++) {
            arr[i] = 1;
        }
        System.out.println("Segregated Array: " + Arrays.toString(arr));
    }
}
  
    
