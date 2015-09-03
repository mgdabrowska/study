package codility;

public class PassingCars {

	public static void main(String[] args) {
		PassingCars sc = new PassingCars();
		System.out.println(sc.solution(new int[] { 0,1,0,1,1},5) == 5);
	

	}
	int solution(int A[], int N) {
		long count = 0;
		for (int i = 0; i < N; i++) {
			if(A[i]==1){
				count ++;
			}
		}
		int results = 0;
		for (int i = 0; i < N; i++) {
			if(A[i]==0){
				results+=count;
			}if(A[i]==1){
				count--;
			}if(results > 1000000000){
				return -1;
			}
		}
		return results;
	}
}
