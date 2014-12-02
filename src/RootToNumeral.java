import java.util.ArrayList;
/***
 * This class contains the findRomanNumeral() method that converts a String (i.e."C") to a romanNumeral (ArrayList<String>)
 * @author jmcallister
 *
 */
public class RootToNumeral extends RomanNumerals
{
  public static ArrayList<String> findRomanNumeral(String lastRoot) //takes a root and makes it a numeral
  {
    ArrayList<String> romanNumeral;
    if(lastRoot == "C")
    {
      romanNumeral = I;
    }
    else if(lastRoot == "D")
    {
      romanNumeral = ii;
    }
    else if(lastRoot == "E")
    {
      romanNumeral = iii;
    }
    else if(lastRoot == "F")
    {
      romanNumeral = IV;
    }
    else if(lastRoot == "G")
    {
      romanNumeral = V;
    }
    else if(lastRoot == "A")
    {
      romanNumeral = vi;
    }
    else if(lastRoot == "B")
    {
      romanNumeral = vii;
    }
    else //safety catch
    {
      //romanNumeral = I;
      return null;
    }
    return romanNumeral;
    //chordProgression.addAll(romanNumeral);
  }
}
