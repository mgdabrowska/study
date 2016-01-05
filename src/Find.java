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
		 String name = null;
		 String size = null;
		 int i = 1;
		 if(args.length > i) {
			 if(args[i].equals("-name")) {
				 name = args[i+1];
			 }
			 if(args[i].equals("-size")) {
				 size = args[i+1];
			 }
		 }
		  i =3;
		 if(args.length > i) {
			 if(args[i].equals("-name")) {
				 name = args[i+1];
			 }
			 if(args[i].equals("-size")) {
				 size = args[i+1];
			 }
		 }
		 
		 printFile(current, name, size);
		 
	}

	public static void printFile(File current, String name, String size) {
		File[] filesList = current.listFiles();
		if (filesList == null) {
			return;
		}
		for (File f : filesList) {
			if(acceptByName(name, f) && acceptBySize(size, f)) {
				System.out.println(f.getPath()+" "+f.length());
			}
			if(f.isDirectory()) {
				printFile(f, name, size);
			}
		}
	}

	private static boolean acceptByName(String name, File f) {
		if(name == null) return true;
		return f.getName().contains(name);
		
	}

	private static boolean acceptBySize(String size, File f) {
		if(size == null) return true;
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
}
