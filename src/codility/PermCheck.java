package codility;

public class PermCheck {

	public static void main(String[] args) {
		PermCheck sc = new PermCheck();
		System.out.println(sc.solution(new int[]{4,1,2,3})==1);
		System.out.println(sc.solution(new int[]{4,1,3})==0);
		System.out.println(sc.solution(new int[]{2,3,2,3})==0);
		

	}
	public int solution(int[] A){
		boolean[] B = new boolean[A.length +1];
		for (int i = 0; i < A.length; i++) {
			if(A[i]<0 || A[i]>A.length||  B[A[i]]== true ){
				return 0;
			}else
				B[A[i]]=true;
		}
		return 1;
	}
}
