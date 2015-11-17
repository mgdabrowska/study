package codility;

import java.util.Arrays;

public class MaxProductOfThree {

	public static void main(String[] args) {
		MaxProductOfThree sc = new MaxProductOfThree();
		System.out
				.println(sc.solution(new int[] { -3, 1, 2, -2, 5, 6 }, 6) == 60);

	}

	int solution(int A[], int N) {
		Arrays.sort(A);
		int result;
		if ((A[A.length - 1] * A[A.length - 2] * A[A.length - 3]) > A[0] * A[1]
				* A[A.length - 1]) {
			result = A[A.length - 1] * A[A.length - 2] * A[A.length - 3];
		} else {
			result = A[0] * A[1] * A[A.length - 1];
		}
		return result;
	}

}
