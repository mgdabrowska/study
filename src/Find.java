import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Find {

	public static void main(String[] args) {
		if (args.length == 0) {
			System.err.println("Musisz podac conajmniej jeden argument!" + '\n'
					+ "Przyklad uzycia:" + '\n' + '\t'
					+ "java -cp {classpath} Find C:\\Users" + "");
			System.exit(1);
		}
		List<Tester> testers = new ArrayList<Tester>();
		Tester s = new SizeTester();
		if (s.accept(args)) {
			testers.add(s);
		}
		Tester a = new NameTester();
		if (a.accept(args)) {
			testers.add(a);
		}
		Tester b = new ContainTester();
		if (b.accept(args)) {
			testers.add(b);
		}
		Tester d = new WriteableTester();
		if (d.accept(args)) {
			testers.add(d);
		}

	}

	void printFile(List<Tester> testers, File f) {
		for (Tester test : testers) {
			if (test.test(f)) {
				System.out.println(f.getPath() + " " + f.length());
			}
			if (f.isDirectory()) {
				printFile(testers, f);
			}
		}
	}
}
