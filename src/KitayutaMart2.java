public class KitayutaMart2 {

	public static void main(String[] args) {
		System.out.println(numBought(100, 100) == 1);
		System.out.println(numBought(100, 300) == 2);
		System.out.println(numBought(150, 1050) == 3);
		System.out.println(numBought(160, 163680) == 10);
	}

	public static int numBought(int K, int T) {

		int i;
		for (i = 1; (K * (1 - Math.pow(2, i)) / (-1)) < T; i++) {

		}
		return i;
	}

}
