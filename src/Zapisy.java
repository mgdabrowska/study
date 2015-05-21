import java.util.Scanner;

public class Zapisy {
	public static void main(String[] args) {
		while(true) {

			System.out.println("");
			System.out.println("1 - Dodaj studenta");
			System.out.println("2 - Wyœwietl wszystkich studentów");
			System.out.println("3 - Dodaj przedmiot");
			System.out.println("4 - Zapisz studenta na przedmiot");
			System.out.println("5 - Wpisz ocenê studentowi");
			System.out.println("6 - Zakoñcz");

			Scanner sc = new Scanner(System.in);
			String liczba = sc.nextLine();
			List list = new List();

			if(("1".equals(liczba))){

				System.out.print("Podaj imiê  ");
				String imie = sc.nextLine();
				System.out.print("Podaj nazwisko  ");
				String nazwisko = sc.nextLine();
				System.out.println("Podaj pesel studenta   ");
				String pesel1 = sc.nextLine();
				System.out.println();

				list.add(new Student(imie + " ", nazwisko + " ", " ", pesel1 + " "));

			} else if ("2".equals(liczba)) {
				
				for (int i = 0; i < list.size(); i++) {
					Student st =  list.get(i);
					System.out.print("  " + st + " ");
				}
			  
			  } else if ("3".equals(liczba)) {
			  
			  } else if ("4".equals(liczba)) {
			 
			  } else if ("5".equals(liczba)) {
			  
			 }else if("6".equals(liczba)){
				 break;
				 
			 }
			 

		}
	}
}
