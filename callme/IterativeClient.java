import java.util.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.*;
public class IterativeClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String msg="";
		Socket s=new Socket("localhost",250);
		DataOutputStream op=new DataOutputStream(s.getOutputStream());
		DataInputStream ip=new DataInputStream(s.getInputStream());
		while(s!=null)
		{
			msg=in.nextLine()+"";
		
		op.writeUTF(msg);
		op.flush();
		if(msg.equals("QUIT"))
			break;
		System.out.println("The response from server:"+ip.readUTF());
		}
		
		//s.close();
	}

}
