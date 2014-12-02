import java.util.ArrayList;
import java.util.Random;
/****
 * This class defines the addCircleChord which takes any chord and returns the chord following it if it is a CircleChord 
 * @author jmcallister
 *
 */
public class CircleProgression extends RomanNumerals
{
  public static ArrayList<String> addCircleChord(int previousChord) //takes the last chord's number (not index)
  {
    ArrayList<String> lastRomanNumeral = RootToNumeral.findRomanNumeral(ChooseChord.findRoot(previousChord));
    //sets the lastRomanNumeral to the RomanNumeral of the root of the last chord
    ArrayList<String> nextRomanNumeral;
    if(lastRomanNumeral == I)
    {
      nextRomanNumeral = IV;
    }
    else if(lastRomanNumeral == ii)
    {
      nextRomanNumeral = V;
    }
    else if(lastRomanNumeral == iii)
    {
      nextRomanNumeral = vi;
    }
    else if(lastRomanNumeral == IV)
    {
      nextRomanNumeral = vii;
    }
    else if(lastRomanNumeral == V)
    {
      nextRomanNumeral = I;
    }
    else if(lastRomanNumeral == vi)
    {
      nextRomanNumeral = ii;
    }
    else if(lastRomanNumeral == vii)
    {
      nextRomanNumeral = iii;
    }
    else
    {
      nextRomanNumeral = I;
    }
    return nextRomanNumeral;
  }
 
} 
