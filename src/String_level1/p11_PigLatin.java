//WAP to accept a word and convert it to piglatin form(trouble --- oubletray)

package String_level1;
import java.util.Scanner;

public class p11_PigLatin
{
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter any string");
      String str, s1, s2, s3 = "";
      char ch;
      int i;
      str = sc.nextLine();
      str = str.toLowerCase();
      int len = str.length();
      for(i=0; i<len; i++)
      {
        ch = str.charAt(i);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            break;
      }
      s1 = str.substring(0,i);
      s2 = str.substring(i);
      s3 = s2 + s1 + "ay";
      System.out.println("Pig Latin form is:  " + s3);
    }
}
