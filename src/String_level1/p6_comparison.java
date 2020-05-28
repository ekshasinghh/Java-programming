//WAP of Java String Comparison 2 String

package String_level1;
import java.util.Scanner;

public class p6_comparison
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string: ");
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
    }
}
