import java.util.Arrays;
import java.util.Scanner;
class BinarySearch{  
    public static void main(String args[]){  
        //Scanner sc = new Scanner(System.in);
        //int arr[] = {10,20,30,40,50}; 
        //int n = sc.nextInt();
        //int arr[] = new int[n];
        //int key = 30;  
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
        int key = sc.nextInt();
        int result = Arrays.binarySearch(arr,key);  
        if (result < 0)  
            System.out.println("Element is not found!");  
        else  
            System.out.println("Element is found at index: "+result);  
    }  
}  