package codility;

import java.util.Stack;

public class Nesting {

	public static void main(String[] args) {
		Nesting sc = new Nesting();
		System.out.println(sc.solution("(()(())())") == 1);
		System.out.println(sc.solution("((( ( ( (") == 0);
		System.out.println(sc.solution("(TTTT)") == 1);
		System.out.println(sc.solution(")))))") == 0);
	}

	public int solution(String S) {
		int element = 0;
		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) == '(') {
				element += 1;
			} else {
				if (element == 0) {
					return 0;
				}
				element -= 1;
			}
		}
		if (element < 0)
			return 0;
		if (element == 0)
			return 1;
		else
			return 0;

	}
}
