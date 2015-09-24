import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Fileex {
	public static void main(String args[]) {        
	    try {
	        File input = new File("D:/Sample/hari");
	        File output = new File("E:\file");
	        Scanner sc = new Scanner(input);
	        PrintWriter printer = new PrintWriter(output);
	        while(sc.hasNextLine()) {
	            String s = sc.nextLine();
	            printer.write(s);
	        }
	    }
	    catch(FileNotFoundException e) {
	        System.err.println("File not found. Please scan in new file.");
	    }
	}
	}