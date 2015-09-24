import java.net.*;
import java.io.*;
public class Client {
public static void main(String args[]) throws UnknownHostException, IOException{
	Socket client=new Socket("localhost",80);
	String msg="hello world";
	PrintStream ps=new PrintStream(client.getOutputStream());
	ps.println(msg);
}
}
