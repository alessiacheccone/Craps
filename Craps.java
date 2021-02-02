
/**
 * Write a description of class Craps here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Craps
{
    // instance variables - replace the example below with your own
    private int x;
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("LET'S PLAY CRAPS!");
        System.out.println("Do you need instructions (Y/n)?");
        String instructions = in.nextLine();
        if (instructions.substring(0,1).equalsIgnoreCase("y"))
        {
            System.out.println("Roll two six-sided dice.");
            System.out.println("On first roll, if you get a 7 or 11 you win!");
            System.out.println("On first roll, if you get a 2, 3, or 12 you lose!");
            System.out.println("Any other number you don't win or lose. The die roll becomes your 'point.'");
            System.out.println("Keep rolling the dice again until:");
            System.out.println("You roll the point again and win!");
            System.out.println("or you roll a 7 and lose.");
            System.out.println("Good luck!");
        }
        else
        {
            System.out.println("Good luck!"); 
        }
        System.out.println("Press <Enter> to roll the dice...");

    }
}
