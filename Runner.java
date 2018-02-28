
/**
 * Allows user to run the game
 *
 * @author Beth Fineberg
 * @version 1.0
 */
public class Runner
{
    public static void main(String[] args)
    {
        //welcome message
        Util.show("Hello! Welcome to Not Hangman.");
        //instructions
        Util.show("You will try to guess a word using my clues.");
        //executes game
        NotHangman.playGame(true);
    }
}
