
public class ListTest {

	public static void main(String[] args) {
		List list = new List();
		list.add(1);
		list.add(3);
		list.add(6);
		for(int i=0; i<3; i++) {
		   System.out.println(list.get(i)+" ");
		}
	}
}
