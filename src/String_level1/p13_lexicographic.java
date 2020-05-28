//WAP to accept two strings and tell which comes later in lexicographics order(dictionary order). If equal how appropriate message.

package String_level1;
import java.util.Scanner;

public class p13_lexicographic {
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter two strings");
       int n;
       String str, s;
       str = sc.nextLine();
       s = sc.nextLine();
       
       n = str.compareToIgnoreCase(s);
       if(n == 0)
           System.out.println("Same strings");
       else if(n>0)
           System.out.println("Order is: "+s+ "\t"+str);
       else
           System.out.println("Order is: "+str + "\t"+s);
    }
}
