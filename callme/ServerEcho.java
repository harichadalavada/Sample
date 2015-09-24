import java.net.*;
import java.io.*;
public class ServerEcho {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket s2=new ServerSocket(250);
		Socket ob=s2.accept();
		DataInputStream ip=new DataInputStream(ob.getInputStream());
		String x=ip.readUTF()+"";
		System.out.println("msg received:"+x);
		String res="";
		for(int i=0;i<x.length();i++){
			if(x.charAt(i)=='a')
				res=res+"A";
			else if(x.charAt(i)=='e')
				res=res+"E";
			else if(x.charAt(i)=='i')
				res=res+"I";
			else if(x.charAt(i)=='o')
				res=res+"O";
			else if(x.charAt(i)=='u')
				res=res+"U";
			else
				res=res+x.charAt(i);
			
		}
		DataOutputStream op=new DataOutputStream(ob.getOutputStream());
		op.writeUTF(res);
		op.flush();
		
	}

}
