
public class ForgetfulAddition {

	public static void main(String[] args) {
		System.out.println(minNumber( "22") == 4);
		System.out.println(minNumber( "123") == 15);
		System.out.println(minNumber( "1289") == 101);
		System.out.println(minNumber( "31415926") == 9067);
		System.out.println(minNumber( "98765") == 863);
	}


	public static int minNumber(String expression) {
		int Min = 1000000;
				//(int) (Math.pow(2, 31)-1);
		for (int i=0; i<= expression.length(); i++){
			String liczba1 = expression.substring(0,i);
			String liczba2 = expression.substring(i+1);
			int liczba3 = Integer.parseInt(liczba1);  
			int liczba4 = Integer.parseInt(liczba2);
			int suma = liczba3 +liczba4;
			System.out.println(suma);
			if(Min>suma){
				Min = suma;
			}
			
			
		}
		return Min;
		}
}
