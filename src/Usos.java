import java.util.Scanner;

public class Usos {
	public static void main(String[] args) {
		List list = new List();
		ListSubject subject = new ListSubject();
		while (true) {

			System.out.println("");
			System.out.println("1 - Dodaj studenta");
			System.out.println("2 - Wyœwietl wszystkich studentów");
			System.out.println("3 - Dodaj przedmiot");
			System.out.println("4 - Zapisz studenta na przedmiot");
			System.out.println("5 - Wpisz ocenê studentowi");
			System.out.println("6 - Zakoñcz");

			Scanner sc = new Scanner(System.in);
			String liczba = sc.nextLine();

			if (("1".equals(liczba))) {

				System.out.print("Podaj imiê  ");
				String imie = sc.nextLine();
				System.out.print("Podaj nazwisko  ");
				String nazwisko = sc.nextLine();
				System.out.println("Podaj pesel studenta   ");
				String pesel1 = sc.nextLine();
				System.out.println();

				list.add(new Student(imie + " ", nazwisko + " ", pesel1+ " ", 
						new ListSubject()));

			} else if ("2".equals(liczba)) {
				for (int i = 0; i < list.size(); i++) {
					Student st = list.get(i);
					System.out.print("  " + st + " ");
				}
				System.out.println(" ");

			} else if ("3".equals(liczba)) {
				System.out.print("Podaj nazwê  ");
				String przedmiot = sc.nextLine();
				
				subject.add(new Subject(przedmiot + " "));
				for (int i = 0; i < subject.size(); i++) {
					
					System.out.print("  " + subject.get(i) + " ");
				
				}
			} else if ("4".equals(liczba)) {
				System.out.print("Podaj numer studenta  ");
				int nrStudenta = sc.nextInt();
				System.out.print("Podaj numer przedmiotu  ");
				int nrPrzedmiotu = sc.nextInt();
				
				 System.out.println(" "+ list.get(nrStudenta)+" "+ subject.get(nrPrzedmiotu)+""); 
				

			} else if ("5".equals(liczba)) {

			} else if ("6".equals(liczba)) {
				break;

			}

		}
		 
	}
}
