import java.util.Scanner;
public class Taxifare_ifstatemen
{
public static void main(String arr[])
{
    Scanner sc = new Scanner(System.in);
    String name;
    int fare;
    System.out.print("Enter Your Name:");
    name = sc.next();
    System.out.print("Enter distance covered: ");
    int a = sc.nextInt();
    if(a>0&&a<=1)
    {
        System.out.println("fare:22");
    }   
    else if(a>1&&a<=5)
    {
        System.out.println("first 1 km to 5km fare : 10Rs/KMs");
	fare=22+(a-1)*10;
        System.out.println("Total fare will be  : " +fare+ " Rs.");
    }
    else if(a>5&&a<=10)
    {
        System.out.println("first 5 km to 10km fare : 7Rs/KMs");
	fare=22+(4*10)+(a-5)*7;
        System.out.println("Total fare will be  : " +fare+ " Rs.");
    }
    else if(a>10&&a<=40)
    {
        System.out.println("Second 10km to 15km (5km per KMs )");
	fare=22+40+(5*7)+(a-10)*5;
        System.out.println("Total fare will be  : " +fare+ " Rs.");
        
        
    }
    else
    {
        System.out.println("Invalid input!!!!Retry the code!!#");
    }
    System.out.println("Thank you!!"+name);
}   
}