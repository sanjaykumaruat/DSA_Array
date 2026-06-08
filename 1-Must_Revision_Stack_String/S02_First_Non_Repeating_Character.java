package com.questions.important;

import java.util.HashMap;
import java.util.Map;

public class S02_First_Non_Repeating_Character {

	public static void main(String[] args) {

		String str = "sanjay";

		Map<Character, Integer> map = new HashMap<>();

		for (char ch : str.toCharArray()) {

			map.put(ch, map.getOrDefault(ch, 0) + 1);

			if (map.get(ch) == 1) {
				System.out.println("first non repeating character:  " + ch);
				break;
			}

		}

	}

}
// first non repeating character:  s