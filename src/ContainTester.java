import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ContainTester implements Tester {
	String contain = null;

	@Override
	public boolean accept(String[] args) {
		for (int i = 0; i < args.length; i++) {
			if (args[i].equals("-contain"))
				contain = args[i + 1];
			return true;
		}
		return false;
	}

	@Override
	public boolean test(File f) {
		if (contain == null)
			return true;
		try {
			Scanner scanner = new Scanner(f);
			while (scanner.hasNext()) {
				if (scanner.nextLine().contains(contain)) {
					return true;
				}
			}
		} catch (FileNotFoundException fnfe) {
			System.err.println("nie znaleziono pliku " + f);
		}
		return false;
	}

}
