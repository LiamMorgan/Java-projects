import java.util.*;

public class main
{
    static int times, fib = 1, fibb = 0, fibonacci;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter number of times to Fibonacci");        
        try{ 
            times = scan.nextInt();
        } catch(InputMismatchException e) {
            System.out.println("Invalid type: " +times+"\n"+e);
        }
        
        for(int i=1;i<=times;i++){
            fibonacci = fib + fibb;
            fibb = fib;
            fib = fibonacci;
            System.out.println(fibonacci);
        }
    }
}
