import java.util.Scanner;
public class taxifare1 
{
    public static void main(String[] args)
    {
        detail();
    }
    public static void detail()
    {
        Scanner sc = new Scanner(System.in);
        String name;
        int km;
        System.out.println("Enter your name =");
        name = sc.next();
        System.out.println("Enter Kilometer =");
        km = sc.nextInt();
        int c = cal(km);
        System.out.println("Fare="+c);
    }
    public static int cal(int km)
    {
        int fare = 0;
        if(km>0 && km<=1)
            fare = 22;
        else if(km>1 && km<=5)
            fare = 22+(km-1)*10;
        else if(km>5 && km<=10)
            fare = 22+(4*10)+(km-5)*7;
        else if(km>10 && km<=100)
            fare = 22+(4*10)+(5*7)+(km-10)*5;
        else
        {
           System.out.println("Invalid Kilometer.");
           System.out.println("ReEnter Your detail.");
            detail(); 
        }
            
        return fare;
    }
}
