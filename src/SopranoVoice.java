import java.util.ArrayList;
import java.util.Random;
public class SopranoVoice extends SuperClass
{
  public static void addSopranoOctave(String blankNote, int indexNumber)
  {
    if(indexNumber == 0)
    {
      if(blankNote == "C" || blankNote == "D" ||blankNote == "E" || blankNote == "F" || blankNote == "G")
      {
        int randomNumber = (int)(Math.random() * 2); //creates randomNumber between 1 or 0
        if(randomNumber == 0)
        {
          String note = blankNote + "4" + "q ";
          fullSopranoNotes.add(note);
        }
        else if(randomNumber == 1)
        {
          String note = blankNote + "5" + "q ";
          fullSopranoNotes.add(note);
        }
      }
      
      else if(blankNote == "A" || blankNote == "B")
      {
        String note = blankNote + "4" +"q ";
        fullSopranoNotes.add(note);
      }
    }
    else //if(indexNumber > 0)
    {
      int lastIndex = indexNumber - 1;
      String lastFullSopranoNote = fullSopranoNotes.get(lastIndex);
      if(lastFullSopranoNote.contains("4") == true)
      {
        if(lastFullSopranoNote.contains("A") == true || lastFullSopranoNote.contains("B") == true)
        {
          if(blankNote == "C" || blankNote == "D" || blankNote == "E")
          {
            int octave = 5;
            String note = blankNote + octave + "q ";
            fullSopranoNotes.add(note);
          }
          else
          {
            int octave = 4;
            String note = blankNote + octave + "q ";
            fullSopranoNotes.add(note);
          }
        }
        else
        {
          int octave = 5;
          String note = blankNote + octave + "q ";
          fullSopranoNotes.add(note);
        }
      }
      else //if(lastFullSopranoNote.contains("5") == true)
      {
        //int lastOctave = 5;
        if((lastFullSopranoNote.contains("B") == true) && ((blankNote != "B") && (blankNote != "A")))
        {
          int octave = 5;
          String note = blankNote + octave + "q ";   
          fullSopranoNotes.add(note);
        }
        else
        {
          int octave = 4;
          String note = blankNote + octave + "q ";
          fullSopranoNotes.add(note);
        }
      }
    }

  }
  public static void chooseSopranoNotes()
  {
    sopranoLine = "V3 ";
    for(int i = 0; i < totalNumOfChords - 2; i++) //-2 because of index not chordNumber
    {
      int chordNumber = i + 1;
      AvailibleNotes.findAndChooseNoteForSoprano(chordNumber);
      String blankNote = sopranoNotes.get(i);
      addSopranoOctave(blankNote,i);
    }
  }
}
   
  


