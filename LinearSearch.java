import java.util.Scanner;
public class LinearSearch 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n,x;  
        System.out.print("Enter no. of elements you want in array:");
        n = sc.nextInt();
        System.out.println("Enter Elements ="); 
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Searching Elements ="); 
        x = sc.nextInt();
        int result = search(arr, x); 
        if(result == -1) 
            System.out.println("Element is not present in array"); 
        else
            System.out.println("Element is present at index " + result);
    }
    public static int search(int arr[], int x) 
    { 
        int n = arr.length; 
        for(int i = 0; i < n; i++) 
        { 
            if(arr[i] == x) 
                return i; 
        } 
        return -1; 
    }    
}