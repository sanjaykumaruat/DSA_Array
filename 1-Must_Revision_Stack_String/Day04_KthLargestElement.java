package com.questions.important;

import java.util.PriorityQueue;

public class Day04_KthLargestElement {

	public static void main(String[] args) {
		int[] arr = { 3, 2, 1, 5, 6, 4 };

		PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
		int k = 2;

		for (int num : arr) {
			minHeap.add(num);

			if (minHeap.size() > k) {
				minHeap.poll();
			}

		}

		System.out.println(" kth element is : " + minHeap.peek());

	}
}
// kth element is : 5