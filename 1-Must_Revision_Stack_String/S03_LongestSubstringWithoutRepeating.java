package com.questions.important;

import java.util.HashSet;
import java.util.Set;

public class S03_LongestSubstringWithoutRepeating {

	public static void main(String[] args) {
		String s = "pwwkewxpw";
		System.out.println("input string: " + s);
		int result = lengthoflongestSubString(s);
		System.out.println("output string : " + result);
	}

	private static int lengthoflongestSubString(String s) {

		Set<Character> set = new HashSet<>();
		int left = 0;
		int maxLen = 0;
		for (int right = 0; right < s.length(); right++) {

			// if duplicate found, move left pointer
			while (set.contains(s.charAt(right))) {
				set.remove(s.charAt(left));
				left++;
			}
			set.add(s.charAt(right));
			maxLen = Math.max(maxLen, right - left + 1);
		}
		return maxLen;
	}

}
//input string: pwwkewxpw
//output string : 5
