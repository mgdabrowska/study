import java.io.File;




public class Find {

	public static void main(String[] args) {
		File current = new File(".");
		File[] filesList = current.listFiles();
        for(File f : filesList){
            if(f.isDirectory())
                System.out.println(f.getName());
            if(f.isFile()){
                System.out.println(f.getName());
            }
        }

	    
	}
}
