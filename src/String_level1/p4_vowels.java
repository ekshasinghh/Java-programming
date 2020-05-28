// WAP to accept a string and count number of Vowels present in it

package String_level1;
import java.util.Scanner;

public class p4_vowels
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string: ");
        String str;
        int len, count =0;
        char c,ch;
        str = sc.nextLine();
        len = str.length();
        for(int x=0; x<len; x++)
        {
            c = str.charAt(x);
            ch =  Character.toLowerCase(c);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                count++;
        }
        System.out.println("Number of vowels present are: " + count);
        
    }
}
