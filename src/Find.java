import java.io.File;

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
		boolean read = acceptOfWriteable("-writeable",current, args);
		printFile(current, name, size, read,args);

	}
	

	private static String readValue(String key, String[] args) {
		for (int i = 0; i < args.length; i++) {
			if(args[i].equals(key)) {
				return args[i+1];
			}
		}
		return null;
	}

	
	public static void printFile(File current, String name, String size, boolean write, String[] args) {
		File[] filesList = current.listFiles();
		if (filesList == null) {
			return;
		}
		for (File f : filesList) {
			if (acceptByName(name, f) && acceptBySize(size, f) && acceptOfWriteable("-writeable", f, args)) {
				System.out.println(f.getPath() + " " + f.length());
			}
			if (f.isDirectory()) {
				printFile(f, name, size,write, args);
			}
		}
	}

	private static boolean acceptByName(String name, File f) {
		if (name == null)
			return true;
		return f.getName().contains(name);

	}

	private static boolean acceptBySize(String size, File f) {
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
		return false;
	}
	private static boolean acceptOfWriteable(String key, File f, String args[]){
		System.out.print("dostaje argument "+ f.getAbsolutePath());
		for (int i = 0; i < args.length; i++) {
			if(args[i].equals(key)){
				System.out.println("zwracamy "+ f.canWrite());
				return f.canWrite();
			}
		}
		 System.out.println("zwracam false");
		return false;	
		
	}
}
