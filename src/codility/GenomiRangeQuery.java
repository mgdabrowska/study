package codility;

import java.util.Arrays;

public class GenomiRangeQuery {

	public static void main(String[] args) {
		GenomiRangeQuery sc = new GenomiRangeQuery();
		System.out.println(Arrays.equals(sc.solution('GACACCATA', new int[] { 2, 5, 0}, new int[] { 4, 5, 6 } ));

	}

	public int[] solution(String S, int[] P, int[] Q) {
		  int M = P.length;
			int[] tab = new int[S.length()];
			int[] result = new int[M];
			for (int i = 0; i < S.length(); i++) {
				if (S.charAt(i) == 'A') {
					tab[i] = 1;
				}
				if (S.charAt(i) == 'C') {
					tab[i] = 2;
				}
				if (S.charAt(i) == 'G') {
					tab[i] = 3;
				}
				if (S.charAt(i) == 'T') {
					tab[i] = 4;
				}
			}
			for (int i = 0; i < result.length; i++) {
			int min = 4 ;
				for (int j = P[i]; j <= Q[i]; j++) {
					if(tab[j]< min){
						min=tab[j];
					}
				}
				result[i]= min;
			}
			return result;
		
	}
}
