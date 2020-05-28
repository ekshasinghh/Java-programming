//WAP to accept the name of a person and guess the gender.

package String_level1;
import java.util.Scanner;

public class p12_gender {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string");
        
        String str;
        str = sc.nextLine();
        str = str.toLowerCase();
        
        if(str.startsWith("mr "))
            System.out.println("Male");
        else if(str.startsWith("miss  "))
            System.out.println("Female");
        else if(str.startsWith("mrs"))
            System.out.println("Married Female");
        else if(str.startsWith("kumari "))
            System.out.println("Un-Married Female");
        else
            System.out.println("Cannot-determine");
    }
}
