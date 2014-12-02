import java.util.Arrays;
import java.util.ArrayList;
/****
 * This class creates each roman numeral's arrayList and adds the notes to it
 * @author jmcallister
 *
 */
public class RomanNumerals
{
  
 public static ArrayList<String> chordProgression = new ArrayList<String>();
 public static final ArrayList<String> I = new ArrayList<String>(){{
   add("C"); add("E"); add("G");
 }};
 public static final ArrayList<String> ii = new ArrayList<String>(){{
   add("D"); add("F"); add("A");
 }}; 
 public static final ArrayList<String> iii = new ArrayList<String>(){{
   add("E"); add("G"); add("B");
 }}; 
 public static final ArrayList<String> IV = new ArrayList<String>(){{
   add("F"); add("A"); add("C");
 }}; 
 public static final ArrayList<String> V = new ArrayList<String>(){{
   add("G"); add("B"); add("D");
 }};
 public static final ArrayList<String> vi = new ArrayList<String>(){{
   add("A"); add("C"); add("E");
 }};
 public static final ArrayList<String> vii = new ArrayList<String>(){{
   add("B"); add("D"); add("F");
 }};
 /*
  public static void addNotes()
  {
    I.add("C"); I.add("E"); I.add("G");
    ii.add("D"); ii.add("F"); ii.add("A");
    iii.add("E"); iii.add("G"); iii.add("B");
    IV.add("F"); IV.add("A"); IV.add("C");
    V.add("G"); V.add("B"); V.add("D");
    vi.add("A"); vi.add("C"); vi.add("E");
    vii.add("B"); vii.add("D"); vii.add("F");
  }
*/
}
