//WAP to accept a sentence and display the words having length is greater than 5

package String_level1;
import java.util.Scanner;

public class p20_words_morethan5 {
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any string: ");
        int len;
        char ch;
        String wrd = " ";
        String str =sc.nextLine();
        str = str + " ";
        len= str.length();
        System.out.println("Words with more than 5 letters are: ");
        for(int i=0; i<len; i++)
        {
          ch = str.charAt(i);
          if(ch!= ' ')
              wrd = wrd + ch; 
          else
          {
              if(wrd.length()>=5)
                  System.out.println(wrd);   
              wrd = "";
          } 
        }   
    }
}
