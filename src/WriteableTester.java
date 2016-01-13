import java.io.File;

public class WriteableTester implements Tester {
	String writeable = null;

	@Override
	public boolean accept(String[] args) {
		for (int i = 0; i < args.length; i++) {
			if (args[i].equals("-writeable"))
				return true;
		}
		return false;
	}

	@Override
	public boolean test(File f) {
		return f.canWrite();

	}
}
