package college_work;

import java.util.Scanner;
import java.lang.String;
public class Palindrones 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String st,rev = "";
        System.out.println("Enter a String:");
        st = sc.nextLine();
        System.out.println("Your String:"+st);
        for(int i = st.length() - 1; i >= 0; i--)
        {
            rev = rev + st.charAt(i);
        }
        System.out.println("Your Reversed string is:"+rev);
        if(st.equalsIgnoreCase(rev))
        {
            System.out.println("The String "+st+" is palindrome.");
        }
        else
        {
            System.out.println("The String "+st+" is not palindrome.");
        }
          
    }
    
}
