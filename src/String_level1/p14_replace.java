//WAP to replace “15 august” with “26 january” and  “independence” with “republic” in the string “15 august is independence day”

package String_level1;
import java.util.Scanner;

public class p14_replace {
     public static void main(String[] args)
    {
        String s1 = "15 august is independence day";
        String s2 = s1.replace("15 august", "26 january");
        String s3 = s2.replace("independence", "republic");
        System.out.println(s3);
    }
}
