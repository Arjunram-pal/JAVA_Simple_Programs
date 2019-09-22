import java.util.Scanner;
public class InsertionSort {  
    public static void insertionSort(int array[]) {  
        int n = array.length;  
        for (int j = 1; j < n; j++) {  
            int key = array[j];  
            int i = j-1;  
            while ( (i > -1) && ( array [i] > key ) ) {  
                array [i+1] = array [i];  
                i--;  
            }  
            array[i+1] = key;  
        }  
    }  
       
    public static void main(String a[])
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
           
        //int[] arr1 = {9,14,3,2,43,11,58,22};    
        System.out.println("Before Insertion Sort");    
        for(int i:arr){    
            System.out.print(i+" ");    
        }    
        System.out.println();    
            
        insertionSort(arr);//sorting array using insertion sort    
           
        System.out.println("After Insertion Sort");    
        for(int i:arr){    
            System.out.print(i+" ");    
        }    
    }    
}