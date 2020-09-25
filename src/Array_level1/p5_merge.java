//WAP to assign values in two array and merge them in third array.

package Array_level1;
import java.util.Scanner;

public class p5_merge {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("Enter the length of 1st array: ");
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];
        System.out.println("Enter the values of 1st array: ");
        for(i=0; i<n1; i++)
            arr1[i] = sc.nextInt();
        
        System.out.println("Enter the length of 2nd array: ");
        int n2 = sc.nextInt();
        int arr2[] = new int[n2];
        System.out.println("Enter the values of 2nd array: ");
        for(i=0; i<n2; i++)
            arr2[i] = sc.nextInt();
        
        System.out.println("3rd array: ");
        for(i=0; i<n1; i++)
            System.out.print(arr1[i]+"\t");
        for(i=0; i<n2; i++)
            System.out.print(arr2[i]+"\t");
    }
}
