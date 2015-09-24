import java.util.*;
import java.io.*;
import java.net.*;
public class Clientcalci {
public static void main(String args[]){
	Scanner in=new Scanner(System.in);
	try {
		Socket s=new Socket("localhost",200);
		String str=in.nextLine();
		DataInputStream din=new DataInputStream(s.getInputStream());
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());
		dout.writeUTF(str);
		dout.flush();
		dout.close();
		System.out.println(din.readUTF());
		din.close();
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
