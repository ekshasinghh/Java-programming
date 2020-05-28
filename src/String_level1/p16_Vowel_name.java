//WAP in java to accept 5 String/Name and Display the names that start with a Vowel

package String_level1;
import java.util.Scanner;

public class p16_Vowel_name {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 names in array:");
        String arr[] = new String[5];
        char ch, c;
        for(int i=0; i<5; i++)
            arr[i] = sc.nextLine();
        System.out.println("The names that start with vowels are: ");
         for(int i=0; i<5; i++)
        {
            c = arr[i].charAt(0);
           ch = Character.toLowerCase(c);
           if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
           {
               System.out.println(arr[i]); 
           }
           
        }
         
    }
}
