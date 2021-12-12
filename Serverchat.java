import java.net.*;
import java.io.*;
import java.util.*;
class Serverchat
{
  public static void main(String args[])throws Exception
  {
    ServerSocket ss=new ServerSocket(2222);
	Socket s=ss.accept();
	DataInputStream dins=new DataInputStream(s.getInputStream());
	DataOutputStream dos=new DataOutputStream(s.getOutputStream());
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String msg="";
	while(!msg.equals("bye"))
	{
	   
	   msg=dins.readUTF();
	   System.out.println("Client Says:"+msg);
	   msg=br.readLine();
	   dos.writeUTF(msg);
     }
	 s.close();
   }
 }