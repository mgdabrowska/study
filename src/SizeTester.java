import java.io.File;

public class SizeTester extends AbstractTest implements Tester {
	public  SizeTester(){
		super("-size");
	}

	/*String size = null;

	@Override
	
	public boolean accept(String[] args) {
		for (int i = 0; i < args.length; i++) {
			if (args[i].equals("-size"))
				size = args[i + 1];
			return true;
		}
		return false;

	}*/

	@Override
	public boolean test(File f) {
		if (parameterValue == null)
			return true;
		if (parameterValue.charAt(0) == '-'
				&& Integer.parseInt(parameterValue.substring(1)) > f.length())
			return true;
		if (parameterValue.charAt(0) == '+'
				&& Integer.parseInt(parameterValue.substring(1)) < f.length())
			return true;
		if (Integer.parseInt(parameterValue.substring(0)) == f.length())
			return true;
		System.out.println("zwracam false");
		return false;
	}

}
