import java.util.ArrayList;
import java.util.Random;
/****
 * This class adds the various types of chords to the chordProgression
 * @author jmcallister
 *
 */
public class AddChords extends ChooseChord
{
  public static ArrayList<String> addChord()
  {
    chordProgression.addAll(RomanNumerals.I);
    for(int i = 1; i <= ChooseChord.totalNumOfChords(); i++)
    {

    chordProgression.addAll(CircleProgression.addCircleChord(1));
    chordProgression.addAll(CircleProgression.addCircleChord(2));
    chordProgression.addAll(CircleProgression.addCircleChord(3));
    chordProgression.addAll(CircleProgression.addCircleChord(4));
    chordProgression.addAll(CircleProgression.addCircleChord(5));
    chordProgression.addAll(CircleProgression.addCircleChord(6));
    chordProgression.addAll(CircleProgression.addCircleChord(7));
    chordProgression.addAll(CircleProgression.addCircleChord(8));
    chordProgression.addAll(CircleProgression.addCircleChord(9));
    }
    return chordProgression;
  }
}
  
