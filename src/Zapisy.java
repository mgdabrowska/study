import java.util.Scanner;

public class Zapisy {
	public static void main(String[] args) {

		System.out
				.println("Witamy w naszym programie. W celu dalszego dzia³ania wybierz jedn¹ z poni¿szych opcji: ");
		System.out.println("");
		System.out.println("1 - Dodaj studenta");
		System.out.println("2 - Dodaj przedmiot");
		System.out.println("3 - Zapisz studenta na przedmiot");
		System.out.println("4 - Wpisz ocenê studentowi");
		System.out.println("5 - Zakoñcz");

		Scanner sc = new Scanner(System.in);
		String liczba = sc.nextLine();

		if ("1".equals(liczba)) {
			System.out.println("Podaj imiê ");
			String name = sc.nextLine();
			System.out.println("Podaj nazwisko ");
			String surname = sc.nextLine();
			System.out.println("Podaj numer pesel ");
			String pesel = sc.nextLine();
			System.out.println("numer indeksu studenta ");
			for (int i = 7; i < pesel.length(); i++) {
				char indeks = pesel.charAt(i);
				int a = indeks - '0';
				System.out.print("" + a);
				

			}
			ListTest wstaw = new ListTest ();

		} else if ("2".equals(liczba)) {

		} else if ("3".equals(liczba)) {

		} else if ("4".equals(liczba)) {

		} else if ("5".equals(liczba)) {

		}

	}
}
