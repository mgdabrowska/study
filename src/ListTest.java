public class ListTest {

	public static void main(String[] args) {
		List list = new List();
		list.add(new Student("Gosia", "Dabrowska", "13 marca 1990r",
				"90031307568"));
		list.add(new Student("Adam", "Stawicki", "8 marca 1991r", "91039198346"));
		// list.add(student1);
		list.addAt(1, new Student("Jan", "Kowalski", "15 maja 1989r",
				"89051576893"));
		list.change(0, new Student("Maciej", "Kwiatkowski",
				"12 czerwiec 1898r", "98061209456"));
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i) + " ");
		}
		System.out.println("--------");
		list.remove(2);
		list.remove(0);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i) + " ");
		}
		// w tym miejscu powinna wypisac 2 3
		System.out.println("---------");
		list.remove(0);
		list.remove(0);
		System.out.println(list.size());
		// w tym miejscu powinno wypisaæ
	}
}
