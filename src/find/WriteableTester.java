package find;
import java.io.File;

public class WriteableTester extends AbstractTest implements Tester {
	public WriteableTester(){
		super("-writeable");
	}

	@Override
	public boolean test(File f) {
		return f.canWrite();

	}
}
