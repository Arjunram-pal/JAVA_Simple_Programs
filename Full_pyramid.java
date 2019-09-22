import java.util.Scanner;
public class Full_pyramid 
{
    public static void main(String[] args) 
    {
        int k=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of pyramid:");
        int rows=s.nextInt()
        for(int i = 1; i <= rows; ++i, k = 0) 
        {
            for(int space = 1; space <= rows - i; ++space) 
            {
                System.out.print("  ");
            }
            while(k != 2 * i - 1) 
            {
                System.out.print("* ");
                ++k;
            }
            System.out.println();
        }
    }
}