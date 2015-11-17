package codility;

import java.util.Arrays;

public class Distinct {

	public static void main(String[] args) {
		Distinct sc = new Distinct();
		System.out.println(sc.solution(new int[] { 2, 1, 1, 2, 3, 1 }, 6) == 3);
		System.out
				.println(sc.solution(new int[] { 1, 1, 1, 1, 1, 1, }, 6) == 1);
		System.out.println(sc.solution(new int[] {}, 0) == 0);

	}

	int solution(int A[], int N) {
		if (A.length == 0)
			return 0;
		Arrays.sort(A);
		int ile = 1;
		for (int i = 0; i < A.length - 1; i++) {
			if (A[i] != A[i + 1]) {
				ile++;
			}
		}
		return ile;
	}
}
