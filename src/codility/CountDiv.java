package codility;

public class CountDiv {

	public static void main(String[] args) {
		CountDiv sc = new CountDiv();
		System.out.println(sc.solution(6,11,2) == 3);

	}
	public int solution(int A, int B, int K) {
		int ile = 0;
		for (int i = A; i < B+1; i++) {
			if(i%K== 0){
				ile ++;
			}
			
		}
	    return ile;
	}

}
