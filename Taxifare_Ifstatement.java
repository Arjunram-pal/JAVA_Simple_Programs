import java.util.Scanner;
class FareCalculator
{
public static void main(String arr[])
{
    //Scanner sc = new Scanner(System.in);
    //System.out.println("Enter Your Name:");
    //char o = sc.next();
    Scanner s = new Scanner(System.in);
    System.out.print("Enter distance covered: ");
    int a = s.nextInt();
    int x=0,y=0;
    if(a>0&&a<=1)
    {
        System.out.println("fare for first 0.1KM to 1KM : 22Rs");
        System.out.println("total distance: " +a+ " fare:22" );
    }   
    else if(a>1&&a<=5)
    {
        System.out.println("first 1 km to 5km fare : 10Rs/KMs");
        x = a-1;
        y=x*10;
        //System.out.println("next " +x+ " KM fare @5 : " +y+ " Rs.");
        y=y+22;
        System.out.println("Total fare will be  : " +y+ " Rs.");
    }
    else if(a>5&&a<=10)
    {
        System.out.println("first 5 km to 10km fare : 7Rs/KMs");
        x=a-5;
        y=40;
        //System.out.println("next " +x+ " KM fare @12 : " +y+ " Rs.");
        int z = a-5;
        int b = z*7;
        //System.out.println("next " +z+ " km  fare @14: " +b+ " Rs.");
        int c=y+b+22;
        System.out.println("Total fare will be  : " +c+ " Rs.");
    }
    else if(a>10&&a<=40)
    {
        System.out.println("Second 10km to 15km (5km per KMs )");
        x=a-10;
        y=75;
        //System.out.println("next" +x+ "KM fare @5:"+y+"Rs.");
        int k=a-10;
        int l=k*5;
        //System.out.println("next " +k+ " km  fare @14: " +l+ " Rs.");
        int h=y+l+22;
        System.out.println("Total fare will be  : " +h+ " Rs.");
        
        
    }
    else
    {
        System.out.println("Invalid input!!!!Retry the code!!#");
    }
}   
}