package find;
import java.io.File;

public class NameTester extends AbstractTest implements Tester {
	public NameTester(){
		super("-name");
	}

	@Override
	public boolean test(File f) {
		if (parameterName == null)
			return true;
		return f.getName().contains(parameterValue);
	}

}
