import org.jfugue.Pattern;
import org.jfugue.Player;

public class Runner extends SuperClass
{
  public static void main(String[] args)
  {
    Player song = new Player();
    //RomanNumerals.addNotes(); 
    AddChords.addChord();
    BassVoice.chooseBassNotes();
    SopranoVoice.chooseSopranoNotes();
    AltoVoice.chooseAltoNotes();
    int tempoPace = 120;
    String tempo = "T" + tempoPace + " ";
    bassLine = ArrayToString.arrayToString(fullBassNotes);// + " " + BassVoice.setBassNote(2);
    sopranoLine = "V3 " + ArrayToString.arrayToString(fullSopranoNotes);
    //sopranoLine = ArrayToString.arrayToString(fullSopranoNotes);
    altoLine = "V2 " + ArrayToString.arrayToString(fullAltoNotes);
    //Pattern test = new Pattern(tempo + bassLine + sopranoLine + altoLine);
    //Pattern test = new Pattern(tempo + bassLine);
    Pattern test = new Pattern(tempo + altoLine + sopranoLine + bassLine);
    //Pattern test = new Pattern(tempo + altoLine);
    
    song.play(test);
 
  }
}
