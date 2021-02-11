
/**
 * Write a description of class Craps here.
 *
 * @author Alessia Checcone
 * @version 2021-6-2
 */
import java.util.Scanner;
public class Craps
{
    public static void main(String[] args)
    {
        Die d1 = new Die();
        Die d2 = new Die();
        Scanner in = new Scanner(System.in);
        System.out.println("Would you like to play Craps (Y/n)?");
        String playAgain = in.nextLine();
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
        while (playAgain.substring(0,1).equalsIgnoreCase("y"))
        {
            System.out.println("Press <Enter> to roll the dice...");
            String pause = in.nextLine();
            int total = d1.roll() + d2.roll();
            if (total == 7 || total == 11)
            {
                System.out.println("You rolled a " + total + "! You won! :D");
                System.out.println("Play again (Y/n)?");
                playAgain = in.nextLine();
            }
            else if (total == 2 || total == 3 || total == 12)
            {
                System.out.println("Oh no! You rolled a " + total + ". You lost. :(");
                System.out.println("Play again (Y/n)?");
                playAgain = in.nextLine();
            }
            else 
            {
                // didn't win or lose 
                System.out.println("You've rolled a " + total + ". This is now your point.");
                int point = total; // roll is now set as the point
                total = d1.roll() + d2.roll();
                System.out.println("Press <Enter> to roll the dice...");
                String rollASecondTime = in.nextLine();
                total = d1.roll() + d2.roll();
                while (total != 7 && total != point)
                {
                    // haven't won or lost yet--need to roll again
                    System.out.println("You've rolled a " + total + ". Roll again.");
                    String rollAThirdTime = in.nextLine();
                    total = d1.roll() + d2.roll();
                }
                if (total == point)
                {
                    System.out.println("You rolled a " + point + ". You won! :D");
                    System.out.println("Play again (Y/n)?");
                    playAgain = in.nextLine();
                }
                else
                {
                    System.out.println("Oops! You rolled a 7. You lost. :("); 
                    System.out.println("Play again (Y/n)?");
                    playAgain = in.nextLine();
                }

            }

        }
        System.out.println("Goodbye!");
    }
}

