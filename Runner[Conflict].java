
/**
 * Runs the game.
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
        //executes the game
        NotHangman.playGame(true);
    }
}
