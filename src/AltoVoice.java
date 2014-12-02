import java.util.Random;
import java.util.ArrayList;
public class AltoVoice extends SuperClass
{
  public static void addAltoOctave(String blankNote, int indexNumber)
  {
    if(indexNumber == 0)
    {
      if(blankNote == "E" || blankNote == "F")
      {
        int octave = 4;
        String note = blankNote + octave + "q ";
        fullAltoNotes.add(note);
      }
      else if(blankNote == "C" || blankNote == "D")
      {
        String fullSopranoNote = fullSopranoNotes.get(indexNumber);
        if(fullSopranoNote.contains("5") == true)
        {
          int randomNumber = (int)(Math.random() * 2); //creates randomNumber between 1 or 0
          if(randomNumber == 0)
          {
            String note = blankNote + "4" + "q ";
            fullAltoNotes.add(note);
          }
          else if(randomNumber == 1)
          {
            String note = blankNote + "5" + "q ";
            fullAltoNotes.add(note);
          }
        }
        else if(fullSopranoNote.contains("4") == true)
        {
          String note = blankNote + "4" + "q ";
          fullAltoNotes.add(note);
        }
      }
      else if(blankNote == "G" || blankNote == "A" || blankNote == "B")
      {
        int randomNumber = (int)(Math.random() * 2); //creates randomNumber between 1 or 0
        if(randomNumber == 0)
        {
          String note = blankNote + "3" + "q ";
          fullAltoNotes.add(note);
        }
        else if(randomNumber == 1)
        {
          String note = blankNote + "4" + "q ";
          fullAltoNotes.add(note);
        }
      }
    }
    else if(indexNumber > 0)
    {
      int lastIndex = indexNumber - 1;
      String lastFullAltoNote = fullAltoNotes.get(lastIndex);
      if(lastFullAltoNote.contains("3") == true)
      {
        if(blankNote == "G" || blankNote == "A" || blankNote == "B")
        {
          String note = blankNote + "3" + "q ";
          fullAltoNotes.add(note);
        }
        else //if blankNote = C or D or E or F
        {
          String note = blankNote + "4" + "q ";
          fullAltoNotes.add(note);
        }
      }
      else if(lastFullAltoNote.contains("4") == true)
      {
        if(blankNote == "C" || blankNote == "D")
        {
          String note = blankNote + "4" + "q ";
          fullAltoNotes.add(note);
        }
        else if(blankNote == "E" || blankNote == "F")
        {
          String note = blankNote + "4" + "q ";
          fullAltoNotes.add(note);
        }
        else //if blankNote == G or A or B
        {
          if(lastFullAltoNote.contains("C") == true || lastFullAltoNote.contains("D") == true || lastFullAltoNote.contains("E") == true)
          {
            String note = blankNote + "3" + "q ";
            fullAltoNotes.add(note);
          }
          else //if lastNote is F,G,A, or B
          {
            String note = blankNote + "4" + "q ";
            fullAltoNotes.add(note);
          }
        }
      }
      else if(lastFullAltoNote.contains("5") == true)
      {
        if(blankNote == "C" || blankNote == "D")
        {
          String note = blankNote + "5" + "q ";
          fullAltoNotes.add(note);
        }
        else //if blankNote == E,F,G,A,B
        {
          String note = blankNote + "4" + "q ";
          fullAltoNotes.add(note);
        }
      }
    }
  }
  public static void chooseAltoNotes()
  {
    //altoLine = "V2 ";
    for(int i = 0; i < totalNumOfChords - 2; i++) //-2 because of index not chordNumber
    {
      int chordNumber = i + 1;
      AvailibleNotes.findAndChooseNoteForAlto(chordNumber);
      String blankNote = altoNotes.get(i);
      addAltoOctave(blankNote, i);
    }
  }
}
