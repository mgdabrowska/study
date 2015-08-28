package codility;

import java.util.Arrays;

public class MaxCounter {

	public static void main(String[] args) {
		MaxCounter sc = new MaxCounter();
		System.out.println(Arrays.equals(
				sc.solution(5, new int[] { 3, 4, 4, 6, 1, 4, 4 }), new int[] {
						3, 2, 2, 4, 2 }));
		System.out.println(Arrays.equals(
				sc.solution(5, new int[] { 6, 6, 6, 6, 6 }), new int[] { 0, 0,
						0, 0, 0 }));

	}

	public int[] solution(int N, int[] A) {
		int[] B = new int[N];
		int max = 0;
		int max_King = 0;
		for (int i = 0; i < A.length; i++) {
			if ( A[i] <= N) {
				if(B[A[i]-1]< max_King){
					B[A[i]-1] = max_King+1;
				}else{
					B[A[i]-1]++;
				}
				if(max < B[A[i]-1]){ 
				max = B[A[i]-1];
				}
			}else
			max_King = max;
		}
		for (int i = 0; i < N; i++) {
			if(B[i]<max_King){
				B[i]= max_King;
			}
			
		}

		return B;
	}
}
