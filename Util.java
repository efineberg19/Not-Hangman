import javax.swing.JOptionPane;
import java.util.Arrays;
/**
 * Creates various methods to call and use for the game.
 *
 * @author Beth Fineberg
 * @version 1.0
 */
public class Util
{
    /*
     * Displays text in dialogue box 
     */
    public static void show (String text)
    {
        JOptionPane.showMessageDialog(null, text);
    }
    /*
     * Allows user to input words through the keyboard. Also returns the input.
     * I did not end up really use this
     */
    public static String input (String text)
    {
        String userInput = JOptionPane.showInputDialog(null, text);
        
        return userInput;
    }
    /*
     * Displays dialogue box with text and two buttons. Returns the user's selection.
     */
    public static int button (String optionOne, String optionTwo, String infoText)
    {    
        Object[] gameOptions = {optionOne,optionTwo};

        int gameChoice = JOptionPane.showOptionDialog(null, infoText, null, JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE, null, gameOptions, gameOptions[0]);
            
        if (gameChoice == JOptionPane.YES_OPTION)
        {
            return 1;
        }
        if (gameChoice == JOptionPane.NO_OPTION)
        {
           return 2; 
        }
        else
        {
            return 0; 
        }
    }
    /*
     * creates a dropdown menu. returns what the user picks
     */
    public static String dropDownPick(String text)
    {
        String[] choices = {"next word", "hint", "A", "B", "C", "D", "E", "F", 
            "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", 
            "U", "V", "W", "X", "Y", "Z"};
        
        String pick = (String) JOptionPane.showInputDialog(null, text, null, JOptionPane.QUESTION_MESSAGE, 
            null, choices, choices[0]); 
            
        return pick;
    }
}
