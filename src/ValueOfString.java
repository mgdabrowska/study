public class ValueOfString {

	public static void main(String[] args) {
		System.out.println(findValue("babca") == 35);
		System.out.println(findValue("zz") == 104);
		System.out.println(findValue("y") == 25);
		System.out.println(findValue("aaabbc") == 47);
		System.out.println(findValue("topcoder") == 558);
		System.out
				.println(findValue("thequickbrownfoxjumpsoverthelazydog") == 11187);
		System.out.println(findValue("zyxwvutsrqponmlkjihgfedcba") == 6201);
	}

	public static int findValue(String s) {
		int suma = 0;
		for (int i = 0; i < s.length(); i++) {
			int liczba = 0;
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(i) >= s.charAt(j)) {
					// System.out.println(j);
					liczba = liczba + 1;
				}

			}
			// System.out.println("obrotów by³"+liczba);
			char litera = s.charAt(i);
			int liczba1 = litera - 'a' + 1;
			// System.out.println("litera to"+ liczba1);
			int razem = liczba * liczba1;
			// System.out.println(razem);
			suma = suma + razem;

			// System.out.println(liczba);

		}
		return suma;
	}
}
