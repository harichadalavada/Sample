import java.util.*;
import java.io.*;
import java.net.*;
public class ServerDownload {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket s=new ServerSocket(126);
		Socket ob=s.accept();
		DataOutputStream dout=new DataOutputStream(ob.getOutputStream());
		List<File> f=listf("D:/Sample");
		String res="";
		for(int i=0;i<f.size();i++)
			res=res+(i+1)+"."+f.get(i)+'\n';
		dout.writeUTF(res);
		DataInputStream din=new DataInputStream(ob.getInputStream());
		int index=Integer.parseInt(din.readUTF());
		File inf=f.get(index-1);
		String infile=inf+"";
		infile.replace('\\', '/');
		readfileWrite("D:/Sample/hari.txt","E:/file");

	}
	public static List<File> listf(String directoryName) {
        File directory = new File(directoryName);

        List<File> resultList = new ArrayList<File>();

        // get all the files from a directory
        File[] fList = directory.listFiles();
        resultList.addAll(Arrays.asList(fList));
        for (File file : fList) {
            if (file.isFile()) {
                System.out.println(file.getAbsolutePath());
            } else if (file.isDirectory()) {
                resultList.addAll(listf(file.getAbsolutePath()));
            }
        }
        //System.out.println(fList);
        return resultList;
    } 
	public static void readfileWrite(String inputfile, String outputfile) {        
	    try {
	        File input = new File(inputfile);
	        File output = new File(outputfile);
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

