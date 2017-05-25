import java.util.*;
/**
 * Write a description of class main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class main
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            int random = (int)(Math.random() * 3 + 1);
            System.out.println("Enter 1 for rock,  2 for paper, 3 for scissors.\n");
            int player = scanner.nextInt();
                   if (player == 1 && random == 1) {
                System.out.println("You said rock, computer said rock. \n You drew.");
            } else if (player == 1 && random == 2) {
                System.out.println("You said rock, computer said paper. \n You lost.");
            } else if (player == 1 && random == 3) {
                System.out.println("You said rock, computer said scissors. \n You won.");
            } else if (player == 2 && random == 1) {
                System.out.println("You said paper, computer said rock. \n You won.");
            } else if (player == 2 && random == 2) {
                System.out.println("You said paper, computer said paper. \n You drew.");
            } else if (player == 2 && random == 3) {
                System.out.println("You said paper, computer said scissors. \n You lost.");
            } else if (player == 3 && random == 1) {
                System.out.println("You said scissors, computer said rock. \n You lost.");
            } else if (player == 3 && random == 2) {
                System.out.println("You said scissors, computer said paper. \n You won.");
            } else if (player == 3 && random == 3) {
                System.out.println("You said scissors, computer said scissors.  \n You drew.");
            }
        }
    }
}
