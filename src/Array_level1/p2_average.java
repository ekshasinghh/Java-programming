//WAP to input an array from the user and find the average of the number of array.

package Array_level1;
import java.util.Scanner;

public class p2_average {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int i, sum=0, avg;
        System.out.println("Enter the length of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the values in the array: ");
        for(i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
        avg = sum / n;
        System.out.println("Average is: "+avg);
    }
    
}
