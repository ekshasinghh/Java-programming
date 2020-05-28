//WAP to accept a String and Display it in Title Case.(eq- My name is covid----- My Name Is Covid)

package String_level1;
import java.util.Scanner;

public class p19_TitleCase {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string");
        String str, s= "";
        char ch;
        int len;
        str = sc.nextLine();
        str = str.toLowerCase();
        len = str.length();
        ch = Character.toUpperCase(str.charAt(0));
        s = s + ch;
        for(int i=1; i<len; i++)
        {
          ch = str.charAt(i);
          if(ch == ' ')
          {
             s = s + ch;
             i++;
             ch = Character.toUpperCase(str.charAt(i));
          }
          else
              ch = Character.toLowerCase(str.charAt(i));
          s = s + ch;
        }
        System.out.println(s);
        
    }
}
