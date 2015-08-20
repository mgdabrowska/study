package codility;

public class MissingInteger {

	public static void main(String[] args) {
		MissingInteger sc = new MissingInteger();
		System.out.println(sc.solution(new int[] { 1, 3, 6, 4, 1, 2 }) == 5);

	}

	public int solution(int[] A) {
		boolean[] B = new boolean[120000];
		for (int i = 0; i < A.length; i++) {
			if (A[i] > 0 && A[i] <= A.length) {
				B[A[i]] = true;
			}
		}
		for (int i = 1; i < B.length; i++) {
			if(!B[i]){
				return i;
			}
		}
		return 0;
	}

}
