import java.util.ArrayList;
import java.util.Random;

public class AvailibleNotes extends SuperClass
{
  public static ArrayList<String> availibleNotesForSoprano = new ArrayList<String>(3);
  private static ArrayList<String> availibleNotesForAlto = new ArrayList<String>(2);
  public static ArrayList<String> availibleNotesForTenor = new ArrayList<String>(1);
  public static ArrayList<String> middleMan = new ArrayList<String>();
  //public static ArrayList<String> sopranoNotes = new ArrayList<String>();
  //public static ArrayList<String> tenorNotes = new ArrayList<String>();
  public static String chooseNoteOfArray(ArrayList<String> noteOptions)
  {
    int numberOfNotes = noteOptions.size();
    int indexOfArray = (int)(Math.random() * numberOfNotes);
    if(noteOptions.size() == 0)
    {
      System.out.print("ERROR");
    }
    return noteOptions.get(indexOfArray);
  }
  public static void findAndChooseNoteForSoprano(int chordNumber) //takes chordNumber NOT Index
  {
    String rootOfChord = ChooseChord.findRoot(chordNumber);
    availibleNotesForSoprano = RootToNumeral.findRomanNumeral(rootOfChord);
    String noteForSoprano = chooseNoteOfArray(availibleNotesForSoprano);
    sopranoNotes.add(noteForSoprano);
    //return noteForSoprano;
  }
  public static void findAndChooseNoteForAlto(int chordNumber)
  {
    String rootOfChord = ChooseChord.findRoot(chordNumber);
    System.out.println("The root of the chord is: " + rootOfChord);
    for(int i = 0; i < (RootToNumeral.findRomanNumeral(rootOfChord).size()); i++)
      {
        String noteToAdd = RootToNumeral.findRomanNumeral(rootOfChord).get(i);
        availibleNotesForAlto.add(noteToAdd);
      }
    int indexNumber = chordNumber - 1;
    availibleNotesForAlto.remove(sopranoNotes.get(indexNumber));
    String noteForAlto = chooseNoteOfArray(availibleNotesForAlto);
    altoNotes.add(noteForAlto);
  }
  public static void findAndChooseNoteForTenor(int chordNumber)
  {
    String rootOfChord = ChooseChord.findRoot(chordNumber);
    availibleNotesForTenor = RootToNumeral.findRomanNumeral(rootOfChord);
    int indexNumber = chordNumber - 1;
    availibleNotesForTenor.remove(sopranoNotes.get(indexNumber));
    availibleNotesForTenor.remove(altoNotes.get(indexNumber));
    String noteForTenor = chooseNoteOfArray(availibleNotesForTenor);
    tenorNotes.add(noteForTenor);
    
    //tenorNotes.add(noteForTenor);
    //return noteForTenor;
  }
}
