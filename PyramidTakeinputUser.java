import java.util.Scanner;
public class PyramidTakeinputUser 
{
    public static void main(String arr[])
    {
        System.out.print("Enter the size of Triangle:");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        for(int i=1;i<=a;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
            
            
    
    
}
