package codility;

public class MaxCounter {

	public static void main(String[] args) {
		MaxCounter sc = new MaxCounter();
		System.out
				.println(sc.solution(5, new int[] { 3, 4, 4, 6, 1, 4, 4 }) == new int[] {
						3, 2, 2, 4, 2 });

	}

	public int[] solution(int N, int[] A) {
		int[] B = new int[N];
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < A.length; i++) {
			if (A[i] > 1 && A[i] <= N) {
				B[A[i]]++;
				if (max < B[A[i]]) {
					max = B[A[i]];
				}
			}
			if (A[i] == N + 1) {
				for (int j = 0; j < A.length; j++) {
					B[A[j]] = max;

				}
			}
		}

		return B;
	}
}
