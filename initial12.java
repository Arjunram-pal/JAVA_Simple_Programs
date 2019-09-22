import java.util.Scanner;
 
public class initial12
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Full name:" );
        String name=sc.nextLine();
        int l=name.length();
        int pos=0;
        for(int i=l-1;i>=0;i--)
        {
            char ch=name.charAt(i);
            if(ch==' ')
            {
                pos=i;
                break;
            }
        }
        System.out.print("The initials are: ");
        System.out.print(name.charAt(0)+".");
        for(int x=1;x<=pos;x++)
        {
            char ch=name.charAt(x);
                  if(ch==' ')
                  {
                                
                        System.out.println(name.charAt(x+1)+".");
                   }
        }
    }   
}
