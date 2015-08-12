package codility;

public class FrogJump {
	public static void main(String[] args) {
		FrogJump sc = new FrogJump();
		System.out.println(sc.solution(10, 85, 30) == 3);
	}

	public int solution(int X, int Y, int D) {
		int diff = Y-X;
		int count = 0;
		int wynik = diff/D;
		int reszta = diff%D;
		if(reszta == 0){
			count=wynik;
		}else
		{
			count= wynik+1;
		}

		return count;
	}
}
