package interview_0_and_1;


public class Day2_Count_the_Zeros {
	public static void main(String[] args) {
		int[] arr = { 1, 1, 0, 0, 0 }; // Input array
		int count = 0;

		for (int num : arr)
			if (num == 0)
				count=count+1;

		System.out.println("Number of zeroes: " + count);
	}
}


//| Iteration | `num` | `count` |
//| --------- | ----- | ------- |
//| 1         | 1     | 0       |
//| 2         | 1     | 0       |
//| 3         | 0     | 1       |
//| 4         | 0     | 2       |
//| 5         | 0     | 3       |
