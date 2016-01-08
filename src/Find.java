import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Find {

	public static void main(String[] args) {
		if (args.length == 0) {
			System.err.println("Musisz podac conajmniej jeden argument!" + '\n'
					+ "Przyklad uzycia:" + '\n' + '\t'
					+ "java -cp {classpath} Find C:\\Users" + "");
			System.exit(1);
		}
		File current = new File(args[0]);
		String name = readValue("-name", args);
		String size = readValue("-size", args);
		String contain = readValue("-contain", args);
		boolean read = acceptOfWriteable("-writeable", current, args);
		printFile(current, name, size, read, args, contain);

	}

	private static String readValue(String key, String[] args) {
		if (key == null)
			return null;
		for (int i = 0; i < args.length; i++) {
			if (args[i].equals(key)) {
				return args[i + 1];
			}
		}
		return null;
	}

	public static void printFile(File current, String name, String size,
			boolean write, String[] args, String contain) {
		File[] filesList = current.listFiles();
		if (filesList == null) {
			return;
		}
		for (File f : filesList) {
			if (acceptByName(name, f) && acceptBySize(size, f)
					&& acceptOfWriteable("-writeable", f, args)
					&& acceptOfContain(contain, f)) {
				System.out.println(f.getPath() + " " + f.length());
			}
			if (f.isDirectory()) {
				printFile(f, name, size, write, args, contain);
			}
		}
	}

	private static boolean acceptByName(String name, File f) {
		// System.out.println(" dostajemy z Name " + f.getAbsolutePath());
		if (name == null)
			return true;
		return f.getName().contains(name);

	}

	private static boolean acceptBySize(String size, File f) {
		// System.out.println(" dostajemy z Size " + f.getAbsolutePath());
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

	private static boolean acceptOfWriteable(String key, File f, String args[]) {
		// System.out.println(" dostajemy z Write " + f.getAbsolutePath());
		for (int i = 0; i < args.length; i++) {
			if (args[i].equals(key)) {
				// System.out.println("zwracamy "+ f.canWrite());
				return f.canWrite();
			}
		}
		// System.out.println("zwracamy false");
		return true;

	}

	private static boolean acceptOfContain(String contain, File f) {
		//System.out.println(" dostajemy z Contain " + f.getAbsolutePath());
		if (contain == null)
			return true;
		try {
			Scanner scanner = new Scanner(f);
			while (scanner.hasNext()) {
				if (scanner.nextLine().contains(contain)) {
					//System.out.println("zwracam true");
					return true;
				}
			}
		} catch (FileNotFoundException fnfe) {
			System.err.println("nie znaleziono pliku " + f);
		}

		return false;
	}
}
