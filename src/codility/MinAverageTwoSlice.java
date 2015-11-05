package codility;

public class MinAverageTwoSlice {

	public static void main(String[] args) {
		MinAverageTwoSlice sc = new MinAverageTwoSlice();
		System.out.println(sc.solution (new int[] {4,2,2,5,1,5,8})==1);

	}
	 public int solution(int[] A) {
		 int N = A.length;
		 int tab[] = new int[N+1];
		 for (int i = 1; i < tab.length; i++) {
			tab[i]=tab[i-1]+A[i-1];
		}
		 double min = Double.MAX_VALUE;
		// int suma =0;
		 int wynik =0;
		 for (int i = 1; i < A.length; i++) {
			for (int j = i+1; j <= A.length; j++) {
				double suma = (double)(tab[j]-tab[i-1])/(double)(j-i+1);
				if(suma<min){
					min=suma;
					wynik = i-1;
				}
			}
		}
		return wynik;
	 }
}
