package codility;

public class NumberOfDiscIntersections {

	public static void main(String[] args) {
		NumberOfDiscIntersections sc = new NumberOfDiscIntersections();
		System.out
				.println(sc.solution(new int[] { 1, 5, 2, 1, 4, 0 }, 6) == 11);

	}

	int solution(int A[], int N) {
		int ile = 0;
		for (int i = 0; i < A.length; i++) {
			for (int j = i + 1; j < A.length; j++) {
				if(Math.abs(A[i]-A[j])< Math.abs(i-j)&& Math.abs(i-j)< Math.abs(A[i]+A[j])||Math.abs(i-j)== Math.abs(A[i]+A[j])||Math.abs(A[i]-A[j])== Math.abs(i-j) ){
				ile ++;	
				}
			}

		}
		return ile;
	}
}
