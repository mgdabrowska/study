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
        int total = suma;
        for(int i=1; i<A.length+2; i++){
        total-=i;
        }
        return Math.abs(total);
    
    }
}
