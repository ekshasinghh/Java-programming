// WAP to accept  word and check if it is palindrome

package String_level1;
import java.util.Scanner;

public class p9_palindrome
{
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any word");
    String S, str = "";
    int len;
    char ch;
    S = sc.nextLine();
    len = S.length();
    for(int x=0; x<len; x++)
    {
       ch = S.charAt(x);
       str = ch + str;
    }
     if(S.equals(str))
         System.out.println("Palindrome");
     else
         System.out.println("Not a palindrome ");
 }
}
