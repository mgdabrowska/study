
public class WritingWords {

	public static void main(String[] args) {
		System.out.println(write("A") == 1);
		System.out.println(write("ABC") == 6);
		System.out.println(write("VAMOSGIMNASIA") == 143);
		System.out.println(write("TOPCODER") == 96);
		System.out.println(write("SINGLEROUNDMATCH") == 183);
		System.out.println(write("ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ") == 1300);
	}

	public static int write(String word) {
		int suma = 0;
		for (int i=0; i<word.length(); i++){
			char znak = word.charAt(i);
			int liczba = znak - 'A' +1;
			suma = suma + liczba;
			//System.out.println(suma);
		}
		
		return suma;
	}
}
