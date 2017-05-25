import java.util.*;
import java.text.SimpleDateFormat;
/**
 * Write a description of class main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class main
{
    private static Date dob;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);          
        Date date = new Date();
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        while(true) {
            System.out.println("Enter your DOB in the format DD/MM/YYYY");     
            try {
                dob = df.parse(scan.next()); 
            } catch(java.text.ParseException e) {
                System.out.println(e);
            }
            long diff = date.getTime() - dob.getTime();
            System.out.println("\n" + dob);
            System.out.println(date);
            System.out.println("\nYou have lived " + diff*0.00000001157407 + " days");
            System.out.println("and " +diff+ " seconds\n");
        }
    }
}
//              01/08/1997