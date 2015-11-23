package codility;

import java.util.Arrays;



public class NumberOfDiscIntersections {

	public static void main(String[] args) {
		NumberOfDiscIntersections sc = new NumberOfDiscIntersections();
		System.out
				.println(sc.solution(new int[] { 1, 5, 2, 1, 4, 0 }, 6) == 11);

	}

	int solution(int A[], int N) {
		int tab_one[] = new int[A.length];
		int tab_two[] = new int[A.length];
		
		for (int i = 0; i < A.length; i++) {
			tab_one[i] = A[i]+i;
		}
		for (int j = 0; j < A.length; j++) {
			 tab_two[j] = -(A[j]-j);
		}
		
	Arrays.sort(tab_one);
	Arrays.sort(tab_two);
	
	int ile = 0;
		for (int i = 0; i < tab_one.length; i++) {
			for (int j = i+1; j < tab_two.length; j++) {
				if(tab_one[i]>=tab_two[j]){
					ile ++;
				}
			}
		}
		return ile;
	}
}
