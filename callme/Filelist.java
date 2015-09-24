import java.io.File;


public class Filelist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("I" + '\n' + "am" + '\n' + "a" + '\n' + "boy");
		listf("D:/Sample");
	}
	public static File[] listf(String directoryName) {

	    // .............list file
	    File directory = new File(directoryName);

	    // get all the files from a directory
	    File[] fList = directory.listFiles();

	    for (File file : fList) {
	        if (file.isFile()) {
	            System.out.println(file.getAbsolutePath());
	        } else if (file.isDirectory()) {
	            listf(file.getAbsolutePath());
	        }
	    }
	    //System.out.println(fList);
	    return fList;
	}  

}
