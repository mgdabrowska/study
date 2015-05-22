import java.util.Scanner;

public class ListTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List list = new List();
		System.out.print("Podaj imiê  ");
		 String imie =sc.nextLine();
		 System.out.print("Podaj nazwisko  ");
		 String nazwisko = sc.nextLine();
		 System.out.println("Podaj pesel studenta   ");
		 String pesel1= sc.nextLine();
		 System.out.println();
		 
		list.add(new Student(imie+ " "  , nazwisko+" "  , " ",pesel1+" " ,"" ));
	//	list.add(new Student(imie+ " "  , nazwisko+" "  , " ",pesel1+" " ));

		// list.add(student1);
		//list.addAt(1, new Student("Jan ", "Kowalski ", "15 maja 1989r ",
			//	"89051576893 "));
		/*list.change(0, new Student("Maciej ", "Kwiatkowski ",
				"12 czerwiec 1898r ", "98061209456 "));*/
		for (int i = 0; i < list.size(); i++) {
			System.out.println("  "+ list.get(i) + " ");
		}
		/*System.out.println("--------");
		list.remove(2);
		list.remove(0);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i) + " ");
		}*/
		// w tym miejscu powinna wypisac 2 3
		//System.out.println("---------");
	//	list.remove(0);
		// list.remove(0);
		//System.out.println(list.size());
		// w tym miejscu powinno wypisaæ
	}
}
