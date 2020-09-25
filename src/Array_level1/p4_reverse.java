//WAP to assign a set of numbers in an array and display it in reverse.

package Array_level1;
import java.util.Scanner;

public class p4_reverse {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("Enter the length of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the values in the array: ");
        for(i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Reverse array: ");
        for(i=n-1; i>=0; i--)
        {
            System.out.print(arr[i]+"\t");
        }
    }    
}
