//WAP to accept 5 numbers in an array and search a given number. If the number exists display its frequency else display a suitable message.

package Array_level1;
import java.util.Scanner;

public class p7_frequency {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int i, count=0;
        int arr[] = new int[10];
        System.out.println("Enter the values in an array: ");
        for(i=0; i<10; i++)
            arr[i] = sc.nextInt();
        System.out.println("Enter the number to search: ");
        int n= sc.nextInt();
        for(i=0; i<10; i++)
        {
            if(n == arr[i])
            count++;
        }
        if(count >= 1)
            System.out.println("Frequency of number found = "+count);
        else
            System.out.println("Number not found");
    }
    
}
