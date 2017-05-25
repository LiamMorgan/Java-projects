import java.util.*;
public class main
{
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long baseTime = System.currentTimeMillis();
        System.out.println("The last two numbers are decimals, press a button and enter to guess ten seconds");
        while(true) {
            scan.next();
            long time = System.currentTimeMillis();
            long tf = ((time-baseTime)/10);
            System.out.println(tf);
        }
    }
}
