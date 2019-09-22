package college_work;

import java.io.*;
import java.net.*;
public class sever 
{
    public static void main(String[] args)
    {
        try
        {
            ServerSocket ss=new ServerSocket(6666);
            Socket s=ss.accept()
            DataInputStream dis=new DataInputStream(s.getInputStream());
            String str=(String)dis.readUTF();
            System.out.print("Message:"+str);
            ss.close();
        }
        catch(Exception e)
        {
            System.out.print(e);
        }
    } 
}
