//WAP to accept a String and Count number of Capital letters present in it.(eq- ComPuter - 2)

package String_level1;
import java.util.Scanner;

public class p3_capital
{
    public static void main(String[] args)
    {   
        Scanner sc = new Scanner(System.in);
        int len, count=0;
        String str;
        char ch;
       System.out.println("Enter any string: ");
        str = sc.nextLine();
        len = str.length();
        for(int x=0 ; x< len ;x++)
        {
            ch = str.charAt(x);
            if(ch>=65 && ch<=90)
                count++;
      }
        System.out.println("Number of Capital Letters are: " + count);
        
    }
}
