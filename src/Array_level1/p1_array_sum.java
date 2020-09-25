//WAP to accept an array input from the user and find sum of numbers of the array.

package Array_level1;
import java.util.Scanner;

public class p1_array_sum {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int i, sum=0;
        System.out.println("Enter the length of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the values in the array: ");
        for(i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
        System.out.println("Sum of numbers are: "+sum);
    }
    
}
