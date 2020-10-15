//Program to check if the parenthesis in an expression is balanced or not.
/*
Example:
Input: exp = “[()]{}{[()()]()}”
Output: Balanced

Input: exp = “[(])”
Output: Not Balanced
*/
import java.util.*;
import java.lang.*;
import java.io.*;

public class BalancedParan {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of test cases..");
		int t = sc.nextInt();
		sc.nextLine();
		while (t-- != 0) {
			System.out.println("Enter string: ");
			String s = sc.nextLine();
			Stack<Character> stack = new Stack<>();
			boolean isbalanced = true;
			for (int i = 0; i < s.length(); i++) {
				char ch = s.charAt(i);
				if (ch == '(' || ch == '{' || ch == '[') {
					stack.push(ch);
					continue;
				}

				if (stack.isEmpty()) {
					isbalanced = false;
					break;
				}
				if (ch == ')') {
					if (stack.peek() == '(') {
						stack.pop();

					} else {
						isbalanced = false;
						break;

					}

				}

				if (ch == '}') {
					if (stack.peek() == '{') {
						stack.pop();

					} else {
						isbalanced = false;
						break;

					}

				}

				if (ch == ']') {
					if (stack.peek() == '[') {
						stack.pop();

					} else {
						isbalanced = false;
						break;

					}

				}

			}

			if (!stack.isEmpty()) {
				isbalanced = false;
			}
			if (isbalanced) {
				System.out.println("balanced");

			} else {
				System.out.println("not balanced");
			}
		}

	}

}

