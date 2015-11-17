package codility;

import java.util.Arrays;

public class Triangle {

	public static void main(String[] args) {
		Triangle sc = new Triangle();
		System.out.println(sc.solution(new int[] { 10,2,5,1,8,20 }, 6) == 1);
		System.out.println(sc.solution(new int[] { 10,50,5,1 }, 4) == 0);
		System.out.println(sc.solution(new int[] { 1,2 }, 2) == 0);
		System.out.println(sc.solution(new int[] { 10,50,5,1,3,4,5,6,3,21,1,3 }, 12) == 1);
		System.out.println(sc.solution(new int[] { 10 }, 1) == 0);

	}
	int solution(int A[], int N){
	
		Arrays.sort(A);
		for (int i = 0; i < A.length-2; i++) {
			if(A[i]>=0 && A[i]>A[i+2]-A[i+1]) 
				return 1;
			
		}
		return 0;
	}

}
