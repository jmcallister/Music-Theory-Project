import java.util.ArrayList;
import java.util.Random;
/****
 * This class defines the self-explanatory methods totalNumOfChords(),findCurrentChord(),findRoot()
 * @author jmcallister
 *
 */
public class ChooseChord extends RomanNumerals
{
  
  public static int totalNumOfChords() //returns total number of chords
  {
    double totalDecimal = Math.random(); //creates a number between 0 and 1
    int totalNumOfChords = (int)(totalDecimal * 10 + 10);
    return totalNumOfChords; //returns totalNumOfChords
  }
  public static String findCurrentChord(int x) //finds any chord with the given index number
  {
    String currentChord = chordProgression.get(x);
    return currentChord;
  }
  public static String findRoot(int chord) //finds the root of a given chord number
  {
   int rootIndex = (chord * 3) - 3; //finds the roots index 
   return chordProgression.get(rootIndex);
  }
}
