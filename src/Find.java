import java.io.File;
import java.time.temporal.IsoFields;

public class Find {

	public static void main(String[] args) {
		// File current = new File(args[0]);
		if(args.length == 0) {
            System.err.println("Musisz podaæ conajmniej jeden argument!" +'\n'+ "Przyklad uzycia:"+'\n'+'\t'+"java -cp {classpath} Find C:\\Users"+ "");
            System.exit(1);
        }
		Find f = new Find();

		f.PrintFile(new File(args[0]), null);
		f.PrintFile(new File(args[0]), "gosia");

		// f.PrintFile(new File(args[1]));
		// f.PrintFile(new File(Directory));
		System.out.println("tablica args");
		for (int i = 0; i < args.length; i++) {
			System.out.println(i + "  " + args[i]);
		}

	}

	public static void PrintFile(File current, String name) {
		File[] filesList = current.listFiles();
		if (filesList == null) {
			return;
		}
		for (File f : filesList) {
			if (name == null) {
				if (f.isDirectory()) {
					System.out.println(f.getPath());
					PrintFile(f, name);
				}
				if (f.isFile()) {
					System.out.println(f.getPath());
				}
			} else {
				if (f.isDirectory()) {
					PrintFile(f, name);
				}
				if (f.isFile() && f.getName().contains(name)) {
					System.out.println(f.getPath());
				}
			}

		}

	}
}
