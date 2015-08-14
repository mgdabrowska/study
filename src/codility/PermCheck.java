package codility;

public class PermCheck {

	public static void main(String[] args) {
		PermCheck sc = new PermCheck();
		System.out.println(sc.solution(new int[]{4,1,2,3})==1);
		System.out.println(sc.solution(new int[]{4,1,3})==0);
		

	}
	public int solution(int[] A){
		int total = A.length *(A.length +1)/2;
		for (int i = 0; i < A.length; i++) {
			total=total - A[i]; 
			
		}
		if(total == 0){
			return 1;
		}
		return 0;
	}
}
