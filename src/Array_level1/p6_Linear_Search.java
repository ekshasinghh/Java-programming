//WAP to accept 10 numbers in an array and search a given nymber, if the number exists display its position(index) else display a suitable message.

package Array_level1;
import java.util.Scanner;

public class p6_Linear_Search {
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
            {
                System.out.println("Number found at "+(i+1));
                break;
            }
            else
                count++;
        }
        if(count==10)
            System.out.println("Number not found");
    }
    
}
