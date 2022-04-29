import java.util.ArrayList;

public class Notebook
{
  private int NumberOfNotes;
  private ArrayList<Note> notes;

  public Notebook()
  {
    notes = new ArrayList<>(5);
    NumberOfNotes = 5;
  }

  public Notebook(int NumberOfNotes)
  {
    notes = new ArrayList<>(NumberOfNotes);
    this.NumberOfNotes = NumberOfNotes;
  }

  public int getNumberOfNotes()
  {
    return notes.size() ;
  }

  public Note getNote(int index)
  {
    return notes.get(index).copy();
  }

  public String getMessage(int index)
  {
    return notes.get(index).getMessage();
  }

  public void addNote(Note note)
  {
    if (notes.size() < NumberOfNotes)
    {
      this.notes.add(note);
      NumberOfNotes = NumberOfNotes + 1;
    }

  }

  public void addNote(String message)
  {
    if (notes.size() <= NumberOfNotes)
    {
      this.notes.add(new Note(message));
    }

  }
  public void addHighPriorityNote(String message)
  {
    if (notes.size()<= NumberOfNotes)
    {
      Note note = new Note(message);
      note.setHighPriority();
      this.notes.add(note);
    }
  }

  public void removeNote(int index)
  {
    this.notes.remove(index);
  }

  public Note[] getAllNotes()
  {
    Note[] tempArray = new Note[notes.size()];
    Note[] newArray = notes.toArray(tempArray);

    return newArray;
  }

  public int getNumberOfHighPriorityNotes()
  {
    int counter = 0;
    for (int i = 0; i < NumberOfNotes; i++)
    {
      if (notes.get(i).isHighPriority())
      {
        counter++;
      }
    }
    return counter;
  }

  public Note[] getAllPriorityNotes()
  {
    Note[] priorityMessages = new Note[getNumberOfHighPriorityNotes()];
    Note[] newArrayPriorityMessages = notes.toArray(priorityMessages);

    for (int i = 0; i < NumberOfNotes; i++)
    {
      if (notes.get(i).isHighPriority())
      {
        newArrayPriorityMessages[i] = notes.get(i);
      }
    }
    return newArrayPriorityMessages;
  }
}
