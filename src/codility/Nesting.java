package codility;

import java.util.ArrayDeque;


public class Nesting {

	public static void main(String[] args) {
		Nesting sc = new Nesting();
		System.out.println(sc.solution("(()(())())") == 1);
		System.out.println(sc.solution("((( ( ( (") == 0);
		System.out.println(sc.solution("(TTTT)") == 1);
		System.out.println(sc.solution(")))))") == 0);
	}

	public int solution(String S) {
		ArrayDeque<Character> element = new ArrayDeque<Character>();
		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) == '(') {
				element.push('(');
			} else {
				if (element.isEmpty()) {
					return 0;
				}
				element.pop();
			}
		}
		
		if (element.isEmpty())
			return 1;
		else
			return 0;

	}
}
