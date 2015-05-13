
public class ListTest {

	public static void main(String[] args) {
			List list = new List();
			list.add(1);
			list.add(3);
			list.add(6);
			list.addAt(1, 2);
			list.change(3, 4);
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i) + " ");
			}
			System.out.println("--------");
			list.remove(3);
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

