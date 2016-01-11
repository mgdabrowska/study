import java.io.File;

public class NameTester implements Tester {
	String name = null;

	@Override
	public boolean accept(String[] args) {
		for (int i = 0; i < args.length; i++) {
			if (args[i].equals("-name"))
				name = args[i + 1];
			return true;
		}
		return false;
	}

	@Override
	public boolean test(File f) {
		// TODO Auto-generated method stub
		return false;
	}

}
