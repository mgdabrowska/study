import java.io.File;


public class SizeTester implements Tester {
	
	String size = null;

	@Override
	public boolean accept(String[] args) {
		for (int i = 0; i < args.length; i++) {
			if(args[i].equals("-size"))
				size=args[i+1];
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
