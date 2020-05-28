//WAP to accept a day name and display the Day number.(eq- Monday --1)

package String_level1;
import java.util.Scanner;

public class p7_day
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String day;
        System.out.println("Enter any day: ");
        day = sc.nextLine();
        if(day.equalsIgnoreCase("Monday"))
            System.out.println("1st day of week");
        else if(day.equalsIgnoreCase("Tuesday"))
            System.out.println("2nd day of week");
        else if(day.equalsIgnoreCase("Wednesday"))
            System.out.println("3rd day of week");
        else if(day.equalsIgnoreCase("Thursday"))
            System.out.println("4th day of week");
        else if(day.equalsIgnoreCase("Friday"))
            System.out.println("5th day of week");
        else if(day.equalsIgnoreCase("Saturday"))
            System.out.println("6th day of week");
        else if(day.equalsIgnoreCase("Sunday"))
            System.out.println("7th day of week");
        else
            System.out.println("Wrong Input");
        
    }
}
