package codility;

public class CountDiv {

	public static void main(String[] args) {
		CountDiv sc = new CountDiv();
		System.out.println(sc.solution(6,11,2) == 3);

	}
	public int solution(int A, int B, int K) {
		 if (A % K == 0){
		        return (B - A) / K + 1;
		    }

		    return (B - (A - A % K)) / K;
	}

}
