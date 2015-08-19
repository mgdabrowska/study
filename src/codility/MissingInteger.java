package codility;

public class MissingInteger {

	public static void main(String[] args) {
		MissingInteger sc = new MissingInteger();
		System.out.println(sc.solution( new int[] { 1,3,6,4,1,2 }) == 5);
		
	}
	 public int solution(int[] A){
		int min=Integer.MAX_VALUE;
		 boolean[] B = new boolean[120000];
		 for (int i = 0; i < B.length; i++) {
			if(!B[A[i]]){
				B[A[i]]=true;
			}if(B[A[i]]=false){
				if(i<min){
					min = i;
				}
			}
		}
		 return min;
	 }

}
