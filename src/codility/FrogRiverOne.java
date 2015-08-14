package codility;

public class FrogRiverOne {
	public static void main(String[] args) {
		FrogRiverOne sc = new FrogRiverOne();
		System.out.println(sc.solution(5, new int[] { 1, 3, 1, 4, 2, 3, 5, 4 }) == 6);
		System.out.println(sc.solution(3, new int[] { 3,3,3,3,3,3,3,3 }) == -1);


	}

	public int solution(int X, int[] A) {
		boolean[] B = new boolean[X+1];
		int distinc =0;
		zewnêtrzna:for (int i = 0; i < A.length; i++) {
			if(!B[A[i]]){
				B[A[i]]=true;
				distinc++;
				//for (int j = 1; j < B.length; j++) {
					//if(B[j]==false){
						//continue zewnêtrzna;
					//}
				//}
				if(distinc == X)
				return i;
			}
			
		}
		return -1;

	}

}
