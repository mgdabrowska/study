package codility;

import java.util.Arrays;

public class CyclicRotation {

	public static void main(String[] args) {
		CyclicRotation sc = new CyclicRotation();
		System.out.println(Arrays.equals(
				sc.solution(new int[] { 3, 8, 9, 7, 6 }, 3), new int[] { 9, 7,
						6, 3, 8 }));
	}

	public int[] solution(int[] A, int K) {
		int B[] = new int[A.length];
		for (int i = 0; i < A.length; i++) {

			B[((K + i)) % A.length] = A[i];
		}
		System.out.println(A.length);
		return B;
	}

}
