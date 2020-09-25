//WAP to assign 10 numbers in an array and sort it in ascending order using Bubble Sort Technique.

package Array_level1;
import java.util.Scanner;

public class p9_Bubble_Sort {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int i, count=0;
        int arr[] = new int[10];
        System.out.println("Enter the values in an array: ");
        for(i=0; i<10; i++)
            arr[i] = sc.nextInt();
        int mid = ;  
   while( first <= last ){  
      if ( arr[mid] < key ){  
        first = mid + 1;     
      }else if ( arr[mid] == key ){  
        System.out.println("Element is found at index: " + mid);  
        break;  
      }else{  
         last = mid - 1;  
      }  
      mid = (first + last)/2;  
   }  
   if ( first > last ){  
      System.out.println("Element is not found!");  
   }  
    }    
}
