import java.util.*;

public class main
{
    private Scanner scan;    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number to factorial:");
        int fact = scan.nextInt();
        for(int i=fact;i>1;i--) {
            fact = fact * (i-1);           
        }
        System.out.println(fact);
    }
}
