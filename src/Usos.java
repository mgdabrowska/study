import java.util.Scanner;

public class Usos {
	public static void main(String[] args) {
		List<Student> list = new List();
		List<Subject> subject = new List();
		List<Marks> marks = new List();
		;
		while (true) {

			System.out.println("");
			System.out.println("1 - Dodaj studenta");
			System.out.println("2 - Wy�wietl wszystkich student�w");
			System.out.println("3 - Dodaj przedmiot");
			System.out.println("4 - Zapisz studenta na przedmiot");
			System.out.println("5 - Wpisz ocen� studentowi");
			System.out.println("6 - Zako�cz");

			Scanner sc = new Scanner(System.in);
			String liczba = sc.nextLine();

			if (("1".equals(liczba))) {

				System.out.print("Podaj imi�  ");
				String imie = sc.nextLine();
				System.out.print("Podaj nazwisko  ");
				String nazwisko = sc.nextLine();
				System.out.println("Podaj pesel studenta   ");
				String pesel1 = sc.nextLine();
				System.out.println();

				list.add( new Student(imie + " ", nazwisko + " ", pesel1 + " ",
						"", new List<Subject>() , new List<Marks>()));

			} else if ("2".equals(liczba)) {
				// for (int i = 0; i < list.size(); i++) {
				// Student st = list.get(i);
				// }
				System.out.print("  " + list + " ");
				System.out.println(" ");

			} else if ("3".equals(liczba)) {
				System.out.print("Podaj nazw�  ");
				String przedmiot = sc.nextLine();

				subject.add( new Subject(przedmiot + " "));
				System.out.println(subject + ",");
				// for (int i = 0; i < subject.size(); i++) {
				// System.out.print("  " + subject.get(i) + " ");
				// }
			} else if ("4".equals(liczba)) {
				System.out.print("Podaj numer studenta  ");
				int nrStudenta = sc.nextInt();
				System.out.print("Podaj numer przedmiotu  ");
				int nrPrzedmiotu = sc.nextInt();

				System.out.println(" " + list.get(nrStudenta) + " "
						+ subject.get(nrPrzedmiotu) + "");
				 List<Subject> przedmiotyStudenta = list.get(nrStudenta).mySubjects;
				 przedmiotyStudenta.add( subject.get(nrPrzedmiotu));
				System.out.println("");

			} else if ("5".equals(liczba)) {
				System.out.print("Podaj ocen�  ");
				int ocena1 = sc.nextInt();

				marks.add( new Marks( ocena1 ));
				
				System.out.println("Podaj numer studenta  ");
				int nrStudenta = sc.nextInt();
				System.out.println(marks + ",");
				
				System.out.println(" "+ list.get(nrStudenta) + " "+ new Marks( ocena1 ) + " ");
				List<Marks> ocenyStudenta = list.get(nrStudenta).myMarks;
				ocenyStudenta.add( new Marks( ocena1 ));
				System.out.println(" ");
				
				
				

			} else if ("6".equals(liczba)) {
				break;

			}

		}

	}
}
