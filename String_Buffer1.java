import java.util.StringTokenizer;
import java.util.Scanner;
public class String_Buffer1
{
    public static void main (String[] args)
    {
        Scanner s=new Scanner(System.in);
        String v=s.nextLine();
        StringTokenizer str=new StringTokenizer(v)
                ;
        while(str.hasMoreTokens())
        {
            System.out.println("Next token is:"+str.nextToken());
        }
    }
}