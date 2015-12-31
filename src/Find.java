import java.io.File;

public class Find {

	public static void main(String[] args) {
		// File current = new File(args[0]);
		if (args.length == 0) {
			System.err.println("Musisz podaæ conajmniej jeden argument!" + '\n'
					+ "Przyklad uzycia:" + '\n' + '\t'
					+ "java -cp {classpath} Find C:\\Users" + "");
			System.exit(1);
		}
		Find f = new Find();
		if (args[1].equals("-name")) {
			f.PrintFile(new File(args[0]), args[2], null);

		} else
			f.PrintFile(new File(args[0]), null, null);

		// f.PrintFile(new File(args[1]));
		// f.PrintFile(new File(Directory));
		// System.out.println("tablica args");
		// for (int i = 0; i < args.length; i++) {
		// System.out.println(i + "  " + args[i]);
		// }

	}

	public static void PrintFile(File current, String name, String size) {
		File[] filesList = current.listFiles();
		if (filesList == null) {
			return;
		}
		for (File f : filesList) {
			if (name != null && size == null) {
				if (f.isDirectory()) {
					PrintFile(f, name, size);
				}
				if (f.isFile() && f.getName().contains(name)) {
					System.out.println(f.getPath()); 
				}
			}
			if (name == null && size != null) {
				if (f.isDirectory()) {
					PrintFile(f, name, size);
				}
				if (f.isFile()) {
					FileSize(size, f);
				}
			} else {
				if (f.isDirectory()) {
					PrintFile(f, name, size);
				}
				if (f.isFile() && f.getName().contains(name)) {
					FileSize(size,f);
					
				}
			}

		}
	}

	private static void FileSize(String size, File f) {
		if (size.charAt(0) == '-'
				&& Integer.parseInt(size.substring(1)) > f.length())
			System.out.println(f.getPath());
		if (size.charAt(0) == '+'
				&& Integer.parseInt(size.substring(1)) < f.length())
			System.out.println(f.getPath());
		if (Integer.parseInt(size.substring(0)) == f.length())
			System.out.println(f.getPath());
	}
}
