import javax.swing.JOptionPane;
import java.util.Arrays;
/**
 * This game with show the user the definition, number of characters, and the first letter
 * with underscores (one per letter) of a word. User can use a drop down menu to pick guess
 * a letter, ask for a hint, or to go on to the next word. The user will be given a score
 * based on their guesses and hints.
 *
 * @author Beth Fineberg
 * @version 1.0
 */
public class NotHangman
{
    //sets initial score to zero
    public static int score = 0;
    
    //allows for there to be characters
    public static String[] characters = {"_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_"};
    
    public static void playGame (boolean play)
    {
        //allows user to pick between an animal or 
        int gameChoice = Util.button("Animal", "SAT Words", "What kind of word would you like to guess?");
        
        //if user picks SAT words
        while (gameChoice == 2)
        {
            //instructions
            Util.show("You have chosen SAT words. Rules: I will give you the definition, " 
                + "number \nof charaters, and the first letter of a word. You will try to " 
                + "guess \nthe letters of the word. Your score will start at 0. Each wrong " 
                + "letter \nguessed will subtract 1 point from your score. You will gain 1 "
                + "point \nfor each letter you guess correctly. Pick the word, hint, to get "
                + "a hint. I will give you 3 hints. You will be  given \nthe same hints if "
                + "you try more than three times. Your score \nis reduced by 1 point for each "
                + "hint you request. Pick the \nword, forfeit, to go on to the next word.");
            
        //creates choices for SAT words    
        String[] words = {"lackadaisical", "ebullient", "tangential", "vying"};
            
        //allows for "random" selection
        int selection = (int)(Math.random() * words.length);
            
        //stores "random" seletion as string
        String targetWord = words[selection];
            
        while (words[selection].equals("lackadaisical"))
        {
            String firstLetter = targetWord.charAt(0) + "";
            
            String underScores = Arrays.toString(characters).replace(",", "")
                    .replace("[", "").replace("]", "");
            
            //word is represented as first letter and underscores
            String userPick = Util.dropDownPick("Your score: " + NotHangman.score 
                + "\nDefinition: " + "lacking enthusiasm and determination; carelessly lazy" 
                + "\n" + "Word: " + firstLetter + underScores + "\nWord length: " + targetWord.length());
            
            boolean correct;
            
            /*
             * goes through the entire alphabet and determines if a letter is
             * part of the target word. if so, the underscore in place of the
             * letter is changed to the letter. i know this is way to long, but i didn't
             * know how to make it any shorter without showing errors for non-errors.
             */
            
            while (userPick == "A")
            {
                Util.show("There is an A at position(s) " + targetWord.indexOf("a")
                    + ", " + (targetWord.substring(2).indexOf("a") + 2) 
                    + (targetWord.substring(5).indexOf("a") + 5)
                    + (targetWord.substring(7).indexOf("a") + 7));
                
                correct = true;
                
                //changes the characters in the underscores to the desired letter
                NotHangman.characters[0] = "a";
                NotHangman.characters[3] = "a";
                NotHangman.characters[5] = "a";
                NotHangman.characters[10] = "a";
                
                break;
            }
            
            while (userPick == "B")
            { 
                Util.show("This letter is not in the word");
                
                //subtracting 1 didn't work properly, 2 did for some reason
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "C")
            {
                Util.show("There is a C at position(s) " + targetWord.indexOf("c"));
                
                correct = true;
                
                NotHangman.characters[1] = "c";
                
                break;
            }
            
            while (userPick == "D")
            {
                Util.show("There is a D at position(s) " + targetWord.indexOf("d"));
                
                correct = true;
                
                NotHangman.characters[4] = "d";
                
                break;
            }
            
            while (userPick == "E")
            { 
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "F")
            {
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "G")
            {
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "H")
            {
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "I")
            {
                Util.show("There is an I at position(s) " + targetWord.indexOf("i") 
                    + ", " + (targetWord.substring(8).indexOf("i") + 8));
                
                correct = true;
                
                NotHangman.characters[6] = "i";
                NotHangman.characters[8] = "i";
                
                break;
            }
            
            while (userPick == "J")
            {
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "K")
            {
                Util.show("There is a K at position(s) " + targetWord.indexOf("k"));
                
                correct = true;
                
                NotHangman.characters[2] = "k";
                
                break;
            }
            
            while (userPick == "L")
            { 
                Util.show("There is an L at position(s) " + targetWord.indexOf("l") + ", " 
                    + (targetWord.substring(1).indexOf("l") + 1));
                
                NotHangman.characters[11] = "l";   
                    
                correct = true;
                
                break;
            }
            
            while (userPick == "M")
            {
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "N")
            {
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "O")
            {
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "P")
            {
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "Q")
            {
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "R")
            {
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "S")
            {
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "T")
            {
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "U")
            {
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "V")
            {
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "W")
            {
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "X")
            {
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "Y")
            {
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "Z")
            {
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            if (correct = true)
            {
                NotHangman.score = NotHangman.score + 1;
            }
          
            if (userPick == "next word")
            {
                //resets the character values to underscores for next word
                NotHangman.characters[0] = "_";
                NotHangman.characters[1] = "_";
                NotHangman.characters[2] = "_";
                NotHangman.characters[3] = "_";
                NotHangman.characters[4] = "_";
                NotHangman.characters[5] = "_";
                NotHangman.characters[6] = "_";
                NotHangman.characters[7] = "_";
                NotHangman.characters[8] = "_";
                NotHangman.characters[9] = "_";
                NotHangman.characters[10] = "_";
                NotHangman.characters[11] = "_";
                
                break;
            }
            
            while (userPick == "hint")
            {
                String[] hints = {"one of the letter is: k", "synonyme: apathetic", 
                    "evolved from the archaic interjection: lackaday"};
                
                int pickHint = (int)(Math.random() * hints.length);
                
                String hintGiven = hints[pickHint];
                
                Util.show(hintGiven);
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
        } 
        
        while (words[selection].equals("ebullient"))
        {
            //makes it so the correct # of underscores are displayed
            NotHangman.characters[8] = "";
            NotHangman.characters[9] = "";
            NotHangman.characters[10] = "";
            NotHangman.characters[11] = "";
            
            String firstLetter = targetWord.charAt(0) + "";
            
            String underScores = Arrays.toString(characters).replace(",", "")
                    .replace("[", "").replace("]", "");
            
            String userPick = Util.dropDownPick("Your score: " + NotHangman.score + "\nDefinition: " 
                + "cheerful and full of energy" + "\n" + "Word: " + firstLetter + underScores
                + "\nWord length: " + targetWord.length());
            
            boolean correct;
            
            /*
             * goes through the entire alphabet and determines if a letter is
             * part of the target word. if so, the underscore in place of the
             * letter is changed to the letter
             */
            
            while (userPick == "A")
            {
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "B")
            { 
                Util.show("There is a B at position(s) " + targetWord.indexOf("b"));
                
                correct = true;
                
                NotHangman.characters[0] = "b";
                
                break;
            }
            
            while (userPick == "C")
            {
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "D")
            {
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "E")
            { 
                Util.show("There is an E at position(s) " + targetWord.indexOf("e") + ", "
                    + (targetWord.substring(4).indexOf("l") + 4));
                
                correct = true;
                
                NotHangman.characters[5] = "e";
                
                break;
            }
            
            while (userPick == "F")
            {
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "G")
            {
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "H")
            {
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "I")
            {
                Util.show("There is an I at position(s) " + targetWord.indexOf("i"));
                
                correct = true;
                
                NotHangman.characters[4] = "i";
                
                break;
            }
            
            while (userPick == "J")
            {
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "K")
            {
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "L")
            { 
                Util.show("There is an L at position(s) " + targetWord.indexOf("l") + ", " 
                    + (targetWord.substring(4).indexOf("l") + 4));
                
                NotHangman.characters[2] = "l";
                NotHangman.characters[3] = "l";    
                    
                correct = true;
                
                break;
            }
            
            while (userPick == "M")
            {
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "N")
            {
                Util.show("There is an N at position(s) " + targetWord.indexOf("n"));
                
                correct = true;
                
                NotHangman.characters[6] = "n";
                
                break;
            }
            
            while (userPick == "O")
            {
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "P")
            {
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "Q")
            {
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "R")
            {
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "S")
            {
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "T")
            {
                Util.show("There is an T at position(s) " + targetWord.indexOf("t"));
                
                correct = true;
                
                NotHangman.characters[7] = "t";
                
                break;
            }
            
            while (userPick == "U")
            {
                Util.show("There is a U at position(s) " + targetWord.indexOf("u"));
                
                correct = true;
                
                NotHangman.characters[1] = "u";
                
                break;
            }
            
            while (userPick == "V")
            {
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "W")
            {
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "X")
            {
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "Y")
            {
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "Z")
            {
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            if (correct = true)
            {
                NotHangman.score = NotHangman.score + 1;
            }
          
            if (userPick == "next word")
            {
                NotHangman.characters[0] = "_";
                NotHangman.characters[1] = "_";
                NotHangman.characters[2] = "_";
                NotHangman.characters[3] = "_";
                NotHangman.characters[4] = "_";
                NotHangman.characters[5] = "_";
                NotHangman.characters[6] = "_";
                NotHangman.characters[7] = "_";
                NotHangman.characters[8] = "_";
                NotHangman.characters[9] = "_";
                NotHangman.characters[10] = "_";
                NotHangman.characters[11] = "_";
                
                break;
            }
            
            while (userPick == "hint")
            {
                String[] hints = {"one of the letter is: u", "synonyme: exuberant", 
                    "in archaic literary terms, it means: \n(of liquid or matter)" 
                    + " boiling or agitated as if boiling"};
                
                int pickHint = (int)(Math.random() * hints.length);
                
                String hintGiven = hints[pickHint];
                
                Util.show(hintGiven);
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
        }
            
        while (words[selection].equals("tangential"))
        {
            //makes it so the correct # of underscores are displayed
            NotHangman.characters[9] = "";
            NotHangman.characters[10] = "";
            NotHangman.characters[11] = "";
            
            String firstLetter = targetWord.charAt(0) + "";
            
            String underScores = Arrays.toString(characters).replace(",", "")
                    .replace("[", "").replace("]", "");
            
            String userPick = Util.dropDownPick("Your score: " + NotHangman.score + "\nDefinition: " 
                + "relating to or along a tangent" + "\n" + "Word: " + firstLetter + underScores
                + "\nWord length: " + targetWord.length());
            
            boolean correct;
            
            /*
             * Goes through the entire alphabet and determines if a letter is
             * part of the target word. If so, the underscore in place of the
             * letter is changed to the letter
             */
            
            while (userPick == "A")
            {
                Util.show("There is an a at position(s) " + targetWord.indexOf("a") 
                    + (targetWord.substring(2).indexOf("a") + 2));
                
                correct = true;
                
                NotHangman.characters[0] = "a";
                NotHangman.characters[7] = "a";
                
                break;
            }
            
            while (userPick == "B")
            { 
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "C")
            {
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "D")
            {
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "E")
            { 
                Util.show("There is an E at position(s) " + targetWord.indexOf("e"));
                
                correct = true;
                
                NotHangman.characters[3] = "e";
                
                break;
            }
            
            while (userPick == "F")
            {
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "G")
            {
                Util.show("There is a G at position(s) " + targetWord.indexOf("g"));
                
                correct = true;
                
                NotHangman.characters[2] = "g";
                
                break;
            }
            
            while (userPick == "H")
            {
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "I")
            {
                Util.show("There is an I at position(s) " + targetWord.indexOf("i"));
                
                correct = true;
                
                NotHangman.characters[6] = "i";
                
                break;
            }
            
            while (userPick == "J")
            {
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "K")
            {
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "L")
            { 
                Util.show("There is an L at position(s) " + targetWord.indexOf("l"));
                
                NotHangman.characters[8] = "l";   
                    
                correct = true;
                
                break;
            }
            
            while (userPick == "M")
            {
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "N")
            {
                Util.show("There is an N at position(s) " + targetWord.indexOf("n"));
                
                correct = true;
                
                NotHangman.characters[1] = "n";
                
                break;
            }
            
            while (userPick == "O")
            {
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "P")
            {
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "Q")
            {
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "R")
            {
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "S")
            {
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "T")
            {
                Util.show("There is an T at position(s) " + targetWord.indexOf("t") +
                    ", " + (targetWord.substring(1).indexOf("t") + 1));
                
                correct = true;
                
                NotHangman.characters[5] = "t";
                
                break;
            }
            
            while (userPick == "U")
            {
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "V")
            {
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "W")
            {
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "X")
            {
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "Y")
            {
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "Z")
            {
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            if (correct = true)
            {
                NotHangman.score = NotHangman.score + 1;
            }
          
            if (userPick == "next word")
            {
                NotHangman.characters[0] = "_";
                NotHangman.characters[1] = "_";
                NotHangman.characters[2] = "_";
                NotHangman.characters[3] = "_";
                NotHangman.characters[4] = "_";
                NotHangman.characters[5] = "_";
                NotHangman.characters[6] = "_";
                NotHangman.characters[7] = "_";
                NotHangman.characters[8] = "_";
                NotHangman.characters[9] = "_";
                NotHangman.characters[10] = "_";
                NotHangman.characters[11] = "_";
                
                break;
            }
            
            while (userPick == "hint")
            {
                String[] hints = {"one of the letter is: g", "also defined as a: hardly touching a matter", 
                    "related to: opposite/adjacent"};
                
                int pickHint = (int)(Math.random() * hints.length);
                
                String hintGiven = hints[pickHint];
                
                Util.show(hintGiven);
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }    
        } 
        
        while (words[selection].equals("vying"))
        {
            //makes it so the correct # of underscores are displayed
            NotHangman.characters[5] = "";
            NotHangman.characters[6] = "";
            NotHangman.characters[7] = "";
            NotHangman.characters[8] = "";
            NotHangman.characters[9] = "";
            NotHangman.characters[10] = "";
            NotHangman.characters[11] = "";
            
            String firstLetter = targetWord.charAt(0) + "";
            
            String underScores = Arrays.toString(characters).replace(",", "")
                    .replace("[", "").replace("]", "");
            
            String userPick = Util.dropDownPick("Your score: " + NotHangman.score + "\nDefinition: " 
                + "competing eagerly with someone in order to do or achieve something" 
                + "\n" + "Word: " + firstLetter + underScores + "\nWord length: " + targetWord.length());
            
            boolean correct;
            
            /*
             * Goes through the entire alphabet and determines if a letter is
             * part of the target word. If so, the underscore in place of the
             * letter is changed to the letter
             */
            
            while (userPick == "A")
            {
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "B")
            { 
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "C")
            {
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "D")
            {
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "E")
            { 
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "F")
            {
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "G")
            {
                Util.show("There is a G at position(s) " + targetWord.indexOf("g"));
                
                correct = true;
                
                NotHangman.characters[3] = "g";
                
                break;
            }
            
            while (userPick == "H")
            {
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "I")
            {
                Util.show("There is an I at position(s) " + targetWord.indexOf("i"));
                
                correct = true;
                
                NotHangman.characters[1] = "i";
                
                break;
            }
            
            while (userPick == "J")
            {
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "K")
            {
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "L")
            { 
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "M")
            {
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "N")
            {
                Util.show("There is an N at position(s) " + targetWord.indexOf("n"));
                
                correct = true;
                
                NotHangman.characters[2] = "n";
                
                break;
            }
            
            while (userPick == "O")
            {
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "P")
            {
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "Q")
            {
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "R")
            {
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "S")
            {
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "T")
            {
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "U")
            {
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "V")
            {
                Util.show("There is a V at position(s) " + targetWord.indexOf("v"));
                
                correct = true;
                
                break;
            }
            
            while (userPick == "W")
            {
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "X")
            {
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "Y")
            {
                Util.show("There is a Y at position(s) " + targetWord.indexOf("y"));
                
                correct = true;
                
                NotHangman.characters[0] = "y";
                
                break;
            }
            
            while (userPick == "Z")
            {
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            if (correct = true)
            {
                NotHangman.score = NotHangman.score + 1;
            }
          
            if (userPick == "next word")
            {
                NotHangman.characters[0] = "_";
                NotHangman.characters[1] = "_";
                NotHangman.characters[2] = "_";
                NotHangman.characters[3] = "_";
                NotHangman.characters[4] = "_";
                NotHangman.characters[5] = "_";
                NotHangman.characters[6] = "_";
                NotHangman.characters[7] = "_";
                NotHangman.characters[8] = "_";
                NotHangman.characters[9] = "_";
                NotHangman.characters[10] = "_";
                NotHangman.characters[11] = "_";
                
                break;
            }
            
            while (userPick == "hint")
            {
                String[] hints = {"one of the letter is: n", "synonyme: contend", 
                    "evolved in the mid 16th century by shortening the word envy"};
                
                int pickHint = (int)(Math.random() * hints.length);
                
                String hintGiven = hints[pickHint];
                
                Util.show(hintGiven);
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }      
        } 
    }
    
    //if user picks animal
    while (gameChoice == 1)
        {
            //instructions
            Util.show("You have chosen Animals. Rules: I will give you the order of animal, " 
                + "number \nof charaters, and the first letter of a word. You will try to " 
                + "guess \nthe letters of the word. Your score will start at 0. Each wrong " 
                + "letter \nguessed will subtract 1 point from your score. You will gain 1 "
                + "point \nfor each letter you guess correctly. Pick the word, hint, to get "
                + "a hint. I will give you 3 hints. You will be  given \nthe same hints if "
                + "you try more than three times. Your score \nis reduced by 1 point for each "
                + "hint you request. Pick the \nword, forfeit, to go on to the next word.");
            
        //creates choices for SAT words    
        String[] animals = {"pangolin"};
            
        //allows for "random" selection
        int selection = (int)(Math.random() * animals.length);
            
        //stores "random" seletion as string
        String targetWord = animals[selection];
        
        //I only did one because my code is too long
        while (targetWord == "pangolin")
        {
            //makes it so the correct # of underscores are displayed
            NotHangman.characters[7] = "";
            NotHangman.characters[8] = "";
            NotHangman.characters[9] = "";
            NotHangman.characters[10] = "";
            NotHangman.characters[11] = "";
            
            String firstLetter = targetWord.charAt(0) + "";
            
            String underScores = Arrays.toString(characters).replace(",", "")
                    .replace("[", "").replace("]", "");
            
            String userPick = Util.dropDownPick("Your score: " + NotHangman.score + "\nOrder: " 
                + "Pholidata\n" + "Word: " + firstLetter + underScores + "\nWord length: " 
                + targetWord.length());
            
            boolean correct;
            
            /*
             * Goes through the entire alphabet and determines if a letter is
             * part of the target word. If so, the underscore in place of the
             * letter is changed to the letter
             */
            
            while (userPick == "A")
            {
                Util.show("There is an A at position(s) " + targetWord.indexOf("a"));
                
                correct = true;
                
                NotHangman.characters[0] = "a";
                
                break;
            }
            
            while (userPick == "B")
            { 
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "C")
            {
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "D")
            {
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "E")
            { 
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "F")
            {
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "G")
            {
                Util.show("There is a G at position(s) " + targetWord.indexOf("g"));
                
                correct = true;
                
                NotHangman.characters[2] = "g";
                
                break;
            }
            
            while (userPick == "H")
            {
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "I")
            {
                Util.show("There is an I at position(s) " + targetWord.indexOf("i"));
                
                correct = true;
                
                NotHangman.characters[6] = "i";
                
                break;
            }
            
            while (userPick == "J")
            {
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "K")
            {
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "L")
            { 
                Util.show("There is an L at position(s) " + targetWord.indexOf("l"));
                
                correct = true;
                
                NotHangman.characters[4] = "l";
                
                break;
            }
            
            while (userPick == "M")
            {
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "N")
            {
                Util.show("There is an N at position(s) " + targetWord.indexOf("n") + 
                    (targetWord.substring(2).indexOf("n") + 2));
                
                correct = true;
                
                NotHangman.characters[1] = "n";
                NotHangman.characters[5] = "n";
                
                break;
            }
            
            while (userPick == "O")
            {
                Util.show("There is an O at position(s) " + targetWord.indexOf("o"));
                
                correct = true;
                
                NotHangman.characters[3] = "o";
                
                break;
            }
            
            while (userPick == "P")
            {
                Util.show("There is an P at position(s) " + targetWord.indexOf("p"));
                
                correct = true;
                
                break;
            }
            
            while (userPick == "Q")
            {
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "R")
            {
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "S")
            {
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "T")
            {
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "U")
            {
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "V")
            {
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "W")
            {
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "X")
            {
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "Y")
            {
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            while (userPick == "Z")
            {
                Util.show("This letter is not in the word");
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }
            
            if (correct = true)
            {
                NotHangman.score = NotHangman.score + 1;
            }
          
            if (userPick == "next word")
            {
                break;
            }
            
            while (userPick == "hint")
            {
                String[] hints = {"looks similar to armadillos", "one letter is: g", 
                    "they are found in Africa and Southeast Asia"};
                
                int pickHint = (int)(Math.random() * hints.length);
                
                String hintGiven = hints[pickHint];
                
                Util.show(hintGiven);
                
                NotHangman.score = NotHangman.score - 2;
                
                break;
            }      
        }
        }
  }
}
