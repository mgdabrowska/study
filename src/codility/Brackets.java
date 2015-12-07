package codility;

import java.util.ArrayDeque;

public class Brackets {

	public static void main(String[] args) {
		Brackets sc = new Brackets();
		System.out.println(sc.solution("{[()()]}") == 1);
		System.out.println(sc.solution("([)()]") == 0);

	}

	public int solution(String S) {
		ArrayDeque<Character> stack = new ArrayDeque<Character>();
		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) == '[' || S.charAt(i) == '{' || S.charAt(i) == '(') {
				stack.push(S.charAt(i));
			} else if (stack.isEmpty()) {
				return 0;
			}
			if (S.charAt(i) == ']' && stack.peek() != '[') {
				return 0;
			}
			if (S.charAt(i) == '}' && stack.peek() != '{') {
				return 0;
			}
			if (S.charAt(i) == ')' && stack.peek() != '(') {
				return 0;
			}
		}

		return stack.isEmpty() ? 1 : 0;
	}
}
