import java.util.ArrayList;
public class ArrayToString extends SuperClass
{
  public static String arrayToString(ArrayList<String> notes)
  {
    if(notes.get(0) == fullBassNotes.get(0))
    {
      for(int i = 1; i <= notes.size(); i++)
      {
        int indexNumber = i - 1;
        bassLine = bassLine + notes.get(indexNumber);
      }
      return bassLine;
    }
    else if(notes.get(0) == fullSopranoNotes.get(0))
    {
      for(int i = 1; i <= notes.size(); i++)
      {
        int indexNumber = i - 1;
        sopranoLine = sopranoLine + notes.get(indexNumber);
      }
      return sopranoLine;
    }
    else
    {
      return null;
    }
  }
}
