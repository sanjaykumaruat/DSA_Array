package com.questions.important;

public class S04_LongestUniformSubstring {

    public static void main(String[] args) {

        String str = "aaabbccccd";

        int count = 1;
        int maxCount = 1;
        char maxChar = str.charAt(0);

        for (int i = 1; i < str.length(); i++) {

            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                count = 1;
            }

            if (count > maxCount) {
                maxCount = count;
                maxChar = str.charAt(i);
            }
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < maxCount; i++) {
            result.append(maxChar);
        }

        System.out.println("Longest Uniform Substring: " + result);
    }
}
//Longest Uniform Substring: cccc