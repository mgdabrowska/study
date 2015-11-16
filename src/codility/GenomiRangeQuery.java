package codility;

import java.util.Arrays;

public class GenomiRangeQuery {

	public static void main(String[] args) {
		GenomiRangeQuery sc = new GenomiRangeQuery();
		System.out.println(Arrays.equals(
				sc.solution("CAGCCTA", new int[] { 2, 5, 0 }, new int[] { 4, 5,
						6 }), new int[] { 2, 4, 1 }));

	}

	public int[] solution(String S, int[] P, int[] Q) {
		int M = P.length;
		int[] tab = new int[S.length()];
		int[] result = new int[M];
		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) == 'A') {
				tab[i] = 1;
			}
			if (S.charAt(i) == 'C') {
				tab[i] = 2;
			}
			if (S.charAt(i) == 'G') {
				tab[i] = 3;
			}
			if (S.charAt(i) == 'T') {
				tab[i] = 4;
			}
		}
		int[] ones = new int[S.length()];
		int[] duo = new int[S.length()];
		int[] trio = new int[S.length()];
		ones[0] = (tab[0] == 1) ? 0 : Integer.MAX_VALUE;
		duo[0] = (tab[0] == 2) ? 0 : Integer.MAX_VALUE;
		trio[0] = (tab[0] == 3) ? 0 : Integer.MAX_VALUE;
		for (int i = 1; i < tab.length; i++) {
			if (tab[i] == 1) {
				ones[i] = 0;
			} else {
				ones[i] = ones[i - 1] + 1;
			}
			if (tab[i] == 2) {
				duo[i] = 0;
			} else {
				duo[i] = duo[i - 1] + 1;
			}
			if (tab[i] == 3) {
				trio[i] = 0;
			} else {
				trio[i] = trio[i - 1] + 1;
			}
		}

		for (int i = 0; i < M; i++) {
			int interval = (Q[i] + 1) - P[i];
			if (interval - ones[Q[i]] > 0) {
				result[i] = 1;
			} else if (interval - duo[Q[i]] > 0) {
				result[i] = 2;
			} else if (interval - trio[Q[i]] > 0) {
				result[i] = 3;
			} else {
				result[i] = 4;
			}

		}

		return result;

	}
}
