import java.util.Scanner;

public class Zapisy {
	public static void main(String[] args) {
		for (int j = 0; j < ; j++) {

			System.out.println("");
			System.out.println("1 - Dodaj studenta");
			System.out.println("2 - Dodaj przedmiot");
			System.out.println("3 - Zapisz studenta na przedmiot");
			System.out.println("4 - Wpisz ocenê studentowi");
			System.out.println("5 - Zakoñcz");

			Scanner sc = new Scanner(System.in);
			String liczba = sc.nextLine();

			if(("1".equals(liczba))){

				List list = new List();
				System.out.print("Podaj imiê  ");
				String imie = sc.nextLine();
				System.out.print("Podaj nazwisko  ");
				String nazwisko = sc.nextLine();
				System.out.println("Podaj pesel studenta   ");
				String pesel1 = sc.nextLine();
				System.out.println();

				list.add(new Student(imie + " ", nazwisko + " ", " ", pesel1
						+ " "));

				for (int i = 0; i < list.size(); i++) {
					System.out.println("  " + list.get(i) + " ");
				}
		

			} else if ("2".equals(liczba)) {
			  
			  } else if ("3".equals(liczba)) {
			  
			  } else if ("4".equals(liczba)) {
			 
			  } else if ("5".equals(liczba)) {
			  
			 }
			 

		}
	}
}
