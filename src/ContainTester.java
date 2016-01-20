import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ContainTester extends AbstractTest implements Tester {
	public ContainTester(){
		super("-contain");
	}

	@Override
	public boolean test(File f) {
		if (parameterName == null)
			return true;
		try {
			Scanner scanner = new Scanner(f);
			while (scanner.hasNext()) {
				if (scanner.nextLine().contains(parameterValue)) {
					return true;
				}
			}
		} catch (FileNotFoundException fnfe) {
			System.err.println("nie znaleziono pliku " + f);
		}
		return false;
	}

}
