import java.util.Scanner;

public class ListTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List list = new List();
		System.out.print("Podaj imiê  ");
		String imie = sc.nextLine();
		System.out.print("Podaj nazwisko  ");
		String nazwisko = sc.nextLine();
		System.out.println("Podaj pesel studenta   ");
		String pesel1 = sc.nextLine();
		System.out.println();

		list.add(new Student(imie + " ", nazwisko + " ", " ", pesel1 + " ",
				new ListSubject()));
		

		for (int i = 0; i < list.size(); i++) {
			System.out.println("  " + list.get(i) + " ");
		}
	}

	
}
