import java.util.Scanner;
public class LogicFunc 
{
    public static void checkLogin(String un,String pw)
    {
        if (un.equals("admin")&&pw.equals("admin123"))
        {
            System.out.println("Valid credential.Login successfully!");
        }
        else
        {
            System.out.println("Wrong username and password");
        }
    }
    public static void main(String[] args) 
    {
       
        Scanner s=new Scanner(System.in);
        System.out.println("Enter username:");
        String un=s.next();
        System.out.println("Enter password:");
        String pw=s.next();
        LogicFunc.checkLogin(un,pw);
        
        
    }
    
}
