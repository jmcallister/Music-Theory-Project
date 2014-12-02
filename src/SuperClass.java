import org.jfugue.*;

import java.util.Arrays;
import java.util.ArrayList;
/****
 * This class combines the voices and initializes everything necessary to run
 * @author jmcallister
 *
 */

public class SuperClass //extends Initialization
{
  public static int totalNumOfChords = ChooseChord.totalNumOfChords();
  
  public static ArrayList<String> sopranoNotes = new ArrayList<String>();
  public static ArrayList<String> altoNotes = new ArrayList<String>();
  public static ArrayList<String> tenorNotes = new ArrayList<String>();
  public static ArrayList<String> bassNotes = new ArrayList<String>();
  
  public static ArrayList<String> fullBassNotes = new ArrayList<String>();
  public static ArrayList<String> fullSopranoNotes = new ArrayList<String>();
  public static ArrayList<String> fullAltoNotes = new ArrayList<String>();
  public static ArrayList<String> fullTenorNotes = new ArrayList<String>();
  
  public static String bassLine;
  public static String sopranoLine;
  public static String altoLine;
  public static String tenorLine;

}
