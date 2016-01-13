import java.io.File;

public class SizeTester implements Tester {

	String size = null;

	@Override
	public boolean accept(String[] args) {
		for (int i = 0; i < args.length; i++) {
			if (args[i].equals("-size"))
				size = args[i + 1];
			return true;
		}
		return false;

	}

	@Override
	public boolean test(File f) {
		if (size == null)
			return true;
		if (size.charAt(0) == '-'
				&& Integer.parseInt(size.substring(1)) > f.length())
			return true;
		if (size.charAt(0) == '+'
				&& Integer.parseInt(size.substring(1)) < f.length())
			return true;
		if (Integer.parseInt(size.substring(0)) == f.length())
			return true;
		System.out.println("zwracam false");
		return false;
	}

}
