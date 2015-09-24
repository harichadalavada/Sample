import java.util.*;
import java.io.*;
import java.net.*;
public class ClientDownload {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
Socket p=new Socket("localhost",126);
DataInputStream din=new DataInputStream(p.getInputStream());
System.out.println(din.readUTF());
System.out.println("Which file you want download Enter that number:");
String str=in.nextLine();
DataOutputStream dout=new DataOutputStream(p.getOutputStream());
dout.writeUTF(str);
din.close();
	}
	
}
