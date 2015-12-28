import java.io.File;
import java.time.temporal.IsoFields;

public class Find {

	public static void main(String[] args) {
		File current = new File(".");
		Find f = new Find();
		f.PrintFile(new File("."));
		//f.PrintFile(new File(Directory));
		System.out.println("tablica args"+args);
	}

	public static void PrintFile(File current) {
		File[] filesList = current.listFiles();
		if(filesList == null){
			return;
		}
		for (File f : filesList) {
			if (f.isDirectory()){
				System.out.println(f.getPath());
			PrintFile(f);
			}
			if (f.isFile()) {
				System.out.println(f.getPath());
			}
			
			
		}

	}
}
