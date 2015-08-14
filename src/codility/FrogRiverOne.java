package codility;

public class FrogRiverOne {
	public static void main(String[] args) {
		FrogRiverOne sc = new FrogRiverOne();
		System.out
				.println(sc.solution(5, new int[] { 1, 3, 1, 4, 2, 3, 5, 4 }) == 6);

	}

	public int solution(int X, int[] A) {
		boolean[] B = new boolean[X];
		zewnêtrzna:for (int i = 0; i < A.length; i++) {
			if(A[i]<= X){
				B[A[i]]=true;
				for (int j = 0; j < B.length; j++) {
					if(B[j]==false){
						continue zewnêtrzna;
					}
					return i;
				}
				
				
			}
			
		}
		return -1;

	}

}
