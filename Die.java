
/**
 * Write a description of class Die here.
 *
 * @author Alessia Checcone
 * @version 2021-4-2
 */
public class Die
{
    // instance variables - replace the example below with your own
    private int roll;

    /**
     * Constructor for objects of class Die
     */
    public Die()
    {
        // initialise instance variables
        roll = this.roll();
    }

    /**
     * The roll method rolls a number between 1-6 randomly
     * @return roll
     */
    public int roll()
    {
        // put your code here
        roll = (int) (Math.random() * 6 + 1);
        return roll;
    }

    /**
     * The getResult method returns the roll from the roll() method 
     * @return roll
     */
    public int getResult()
    {
        return roll;   
    }
}
