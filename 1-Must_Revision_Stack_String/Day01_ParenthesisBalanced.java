package com.questions.important;

import java.util.Stack;

public class Day01_ParenthesisBalanced {

	public static void main(String[] args) {
		String str = "[{()}]"; // Example input
		Boolean result = isParenthesisBalanced(str);
		System.out.println("is Parenthise balanced? " + result);

	}

	private static Boolean isParenthesisBalanced(String str) {

		Stack<Character> stack = new Stack<>();
		for (char ch : str.toCharArray()) {
			if (ch == '(' || ch == '{' || ch == '[') {
				stack.push(ch);
			} else {

				if (stack.empty()) {
					return false;
				}
				char top = stack.pop();
				if (ch == ')' && top != '(') {
					return false;
				}
				if (ch == '}' && top != '{') {
					return false;
				}
				if (ch == ']' && top != '[') {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}

}

//OUTPUT : is Parenthise balanced? true