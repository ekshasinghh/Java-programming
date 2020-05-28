//WAP to accept a String and Convert the case of each alphabet present in it.(eq- JaVa---jAvA)

package String_level1;
import java.util.Scanner;

public class p8_case_conversion
{
    public static void main(String[] args)
   {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter any String");
     String s, str = "";
     int len;
     char ch,c;
     s = sc.nextLine();
     len = s.length();
     for(int x=0; x<len; x++)
     {
        ch = s.charAt(x);
        if(ch>=65 && ch<=90)
          c = Character.toLowerCase(ch);
        else
          c = Character.toUpperCase(ch);
         str = str + c;
     }
       System.out.println("Case converted string is " + str);
     
   }
}
