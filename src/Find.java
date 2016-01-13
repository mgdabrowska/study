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
		File f = new File(args[0]);
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
		printFile(testers, f);

	}

	static void printFile(List<Tester> testers, File f) {
		File[] filesList = f.listFiles();
		//file f might be deleted
		if (filesList == null) {
			return;
		}
		for (File file : filesList) {
			boolean canBePrinted = true;
			for(int i = 0; i < testers.size(); i++) {
				canBePrinted |= testers.get(i).test(file);
				
				if(!canBePrinted) {
					break;
				}
			}
			
			if(canBePrinted) {
				System.out.println(file.getPath());
			}
			
			if(file.isDirectory()) {
				printFile(testers, file);
			}
		}
		
	}
}
