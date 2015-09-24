import java.util.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.*;
public class ClientEcho {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		Socket s=new Socket("localhost",250);
		String msg="hari";
		DataOutputStream op=new DataOutputStream(s.getOutputStream());
		op.writeUTF(msg);
		op.flush();
		DataInputStream ip=new DataInputStream(s.getInputStream());
		System.out.println(ip.readUTF());
		s.close();
	}

}
