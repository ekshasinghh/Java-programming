//WAP to accept a String count the frequency of each alphabet in the String.

package String_level1;
import java.util.Scanner;

public class p18_frequency {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter any string");
      String str;
      char ch;
      int len, count;
      str = sc.nextLine();
      str = str.toLowerCase();
      len = str.length();
      for(char i='a'; i<='z'; i++)
      {
          count=0;
         for(int j=0; j<len; j++)
         {
            ch = str.charAt(j);
            if(ch == i)
               count++;
         }
         if(count>0)
             System.out.println("Frequency of "+i+ " is: " + count);
      }
    }
}
