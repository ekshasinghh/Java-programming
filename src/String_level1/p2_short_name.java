//WAP to accept the First name , Middle Name and Last Name of a person and display full name  and Short Name

package String_level1;
import java.util.Scanner;

public class p2_short_name
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String fname, mname, lname, shortname;
        
        System.out.println("Enter your first name: ");
        fname = sc.nextLine();
        System.out.println("Enter your middle name: ");
        mname = sc.nextLine();
        System.out.println("Enter your last name: ");
        lname = sc.nextLine();
        
        System.out.println("Your full name is: " + fname +" " + mname + " " + lname );
        
        shortname = fname.charAt(0) + "." + mname.charAt(0) + "." + lname.charAt(0);
        
        System.out.println("Your short name is:  " + shortname);
    }
    
}
