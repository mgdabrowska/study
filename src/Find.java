import java.io.File;

public class Find {

	public static void main(String[] args) {
		File current = new File(".");
		Find f = new Find();
		f.PrintFile(new File("."));
	}

	public static void PrintFile(File current) {
		File[] filesList = current.listFiles();
		for (File f : filesList) {
			if (f.isDirectory())
				System.out.println(f.getName());
			if (f.isFile()) {
				System.out.println(f.getName());
			}
		}

	}
}
