package com.questions.important;

import java.util.Arrays;

public class Day02_DailyTemperatures_BruteForce {

	public static void main(String[] args) {

		int[] temp = { 73, 74, 75, 71, 69, 72, 76, 73 };
		System.out.println("Input  : " + Arrays.toString(temp));
		int n = temp.length;
		int[] result = new int[n];

		for (int i = 0; i < n; i++) {

			for (int j = i + 1; j < n; j++) {

				if (temp[j] > temp[i]) {
					result[i] = j - i;
					break;
				}
			}
		}

		System.out.println("Output : " + Arrays.toString(result));
	}
}
//Input  : [73, 74, 75, 71, 69, 72, 76, 73]
//Output : [1, 1, 4, 2, 1, 1, 0, 0]