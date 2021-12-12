import java.net.*;
import java.io.*;
class Clientchat
{
  public static void main(String args[])throws Exception
  {
    Socket s=new Socket("localhost",2222);
	DataInputStream dins=new DataInputStream(s.getInputStream());
	DataOutputStream dos=new DataOutputStream(s.getOutputStream());
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String msg="";
	while(!msg.equals("bye"))
	{
	   msg=br.readLine();
	   dos.writeUTF(msg);
	   msg=dins.readUTF();
	   System.out.println("Server Says:"+msg);
     }
	 s.close();
   }
 }