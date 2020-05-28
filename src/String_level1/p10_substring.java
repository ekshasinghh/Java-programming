//WAP of substring

package String_level1;
import java.util.Scanner;

public class p10_substring
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string");
        String str = sc.nextLine();
        String ls,fs;
        int len = str.length();
        fs = str.substring(0,4);
        ls = str.substring(len-5, len);
        System.out.println(fs + " " + ls);
    }
}
