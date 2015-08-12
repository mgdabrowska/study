package codility;

public class TapeEquilibrium {
	public static void main(int[] A) {
		System.out.println(minWartosc(3,1,2,4,3 ) == 1);
	}
	
	
		 public int minWartosc(int[] A) {
			 int sumLeft = 0;
		        int sumRight = 0;
		        int min = Integer.MAX_VALUE;
		        for(int i = 0; i<A.length;i++){
		         sumRight+=A[i];   
		        }
		        for(int P=0; P<A.length-1; P++){
		         sumLeft+=A[P];
		         sumRight-=A[P];
		         if(min>Math.abs(sumRight - sumLeft))
		         min = Math.abs(sumRight - sumLeft);
		        }
		        return min;
		        }
		}
			 
		 


