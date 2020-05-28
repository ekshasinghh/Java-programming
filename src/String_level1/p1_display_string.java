//WAP to accept a String from User and Display it Back on Screen

package String_level1;
import java.util.Scanner;

public class p1_display_string
{
    public static void main(String[] args)
    {
        Scanner sc =  new Scanner(System.in);
        
        String name;
        System.out.println("Enter ur name");
        
        name = sc.nextLine();
        System.out.println("Your name is " + name);
    }
}
