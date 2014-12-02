import java.util.ArrayList;
import java.util.Random;
/****
 * This class sets the bass note equal to the root of each chord in chordProgession and writes it in jFugue format
 * @author jmcallister
 *
 */
public class BassVoice extends SuperClass
{
  
 public static String chooseBassNotes()
 {
  bassLine = "V0 ";
  
  //for(int i = 1; i <= ChooseChord.totalNumOfChords() - 2; i++)
  for(int i = 1; i <= totalNumOfChords - 2; i++)
  {
    String blankNote = ChooseChord.findRoot(i); //finds the root of each chord 
    bassNotes.add(blankNote);
    //following code determines the octave
    if(blankNote == "F" || blankNote == "G" || blankNote == "A" || blankNote == "B")
    {
        String note = blankNote + "3" + "q ";
        fullBassNotes.add(note);
    }
    else if(blankNote == "C")
    {
      int randomNumber = (int)(Math.random() * 2); //creates randomNumber between 1 or 0
      
      if(randomNumber == 0)
      {
        String note = blankNote + "3" + "q ";
        fullBassNotes.add(note);
      }
      else if(randomNumber == 1)
      {
        String note = blankNote + "4" +"q ";
        fullBassNotes.add(note);
      }
    }
    else if(blankNote == "D" || blankNote == "E")
    {
      String note = blankNote + "3" +"q ";
      fullBassNotes.add(note);
    }
    
  }
  return bassLine;
 
 }
}
