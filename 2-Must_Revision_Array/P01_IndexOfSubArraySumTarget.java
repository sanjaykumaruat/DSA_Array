package com.question.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P01_IndexOfSubArraySumTarget {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 7, 5};
        System.out.println("Input Array : " + Arrays.toString(arr));
        int target = 6;

        List<Integer> result = subArray(arr, target);
        System.out.println("Output Indexes : " + result);
    }

    public static List<Integer> subArray(int[] arr, int target) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {

                sum = sum + arr[j];

                if (sum == target) {

                    list.add(i);
                    list.add(j);

                    return list;
                }
            }
        }

        list.add(-1);
        return list;
    }
}