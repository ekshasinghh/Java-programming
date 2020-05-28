//WAP to accept a string and count number of Words Present in it.

package String_level1;
import java.util.Scanner;

public class p5_words
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string: ");
        String str;
        int len, count =0;
        char c;
        str = sc.nextLine();
        len = str.length();
        for(int x=0; x<len; x++)
        {
            c = str.charAt(x);
            if(c == ' ')
                count++;
        }
        System.out.println("Number of words present are: " + (count+1));
        
    }
}
