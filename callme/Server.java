import java.net.*;
import java.io.*;
public class Server {
public static void main(String args[]) throws IOException{
	ServerSocket ser=new ServerSocket(80);
	Socket sock=ser.accept();
	BufferedReader in=new BufferedReader(new InputStreamReader(sock.getInputStream()));
	String msg=in.readLine();
	if(msg!=null)
		System.out.println("msg received "+msg);
}
}
