
/**
 * Write a description of class main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class main
{
    public static void main(String word) {
        System.out.println(word);              
        for(int i = word.length()-1;i>-1;i--) {
            System.out.print(word.substring(i,i+1));    
        }
        System.out.println();
    }
}
