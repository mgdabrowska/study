package codility;

public class PermMissingElem {
	public static void main(String[] args) {
		PermMissingElem sc = new PermMissingElem ();
		System.out.println(sc.solution(new int[]{2,3,1,5}) == 4);
	
	}
	public int solution(int[] A) {
        // write your code in Java SE 8
        int suma = 0;
        for(int i = 0; i<A.length; i++){
        suma+=A[i];
        }
        suma= suma - (A.length+1)*(A.length+2)/2;;
        return Math.abs(suma);
    
    }
}
