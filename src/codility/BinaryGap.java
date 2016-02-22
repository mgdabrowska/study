package codility;

public class BinaryGap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryGap sc = new BinaryGap();
		System.out.println(sc.solution(1041) == 5);
		System.out.println(sc.solution(15) == 0);
		System.out.println(sc.solution(20) == 1);

	}

	public int solution(int N) {
		String a = Integer.toBinaryString(N);
		System.out.println(a);
		char[] tab = a.toCharArray();
		System.out.println(tab);

		int maxgap = 0;
		int counter = 0;
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == '1') {
				if (counter > maxgap) {
					maxgap = counter;
					counter = 0;
				} else
					counter = 0;
			} else
				counter++;
		}
		return maxgap;

	}
}
