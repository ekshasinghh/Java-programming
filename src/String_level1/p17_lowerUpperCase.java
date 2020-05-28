//WAP to accept  String and Convert its individual characters to capital and Small alternately.(Amar----- aMaR)

package String_level1;
import java.util.Scanner;

public class p17_lowerUpperCase {
    public static void main(String[] args)
   {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter any String: ");
     String str;
     int len;
     char ch,c;
     String  s = "";
     str = sc.nextLine();
     len = str.length();
     for(int i =0 ;i<len; i++)
     {
        ch = str.charAt(i);
        if(i%2==0)
        {
          c= Character.toUpperCase(ch);
        }
        else
        {
          c = Character.toLowerCase(ch);
        }
         s = s + c;
     }
       System.out.println("Resulting String is " + s);
     
   }
   
}
