import java.io.NotSerializableException;

public class Notebook
{
  public int NumberOfNotes;
  public Note[] notes;

  public Notebook(int maxNumberOfNotes)
  {
    notes = new Note[maxNumberOfNotes];
    NumberOfNotes = 0;
  }

  public int getNumberOfNotes()
  {
    return NumberOfNotes;
  }

  public Note getNote(int index)
  {
    return notes[index].copy();
  }

  public String getMessage(int index)
  {
    return notes[index].getMessage();
  }

  public void addNote(Note note)
  {
    if (NumberOfNotes <= notes.length)
    {
      this.notes[NumberOfNotes] = note.copy();
      NumberOfNotes = NumberOfNotes + 1;
    }

  }

  public void addNote(String message)
  {
    if (NumberOfNotes <= notes.length)
    {
      for (int i = 0; i < NumberOfNotes; i++)
      {
        if (notes[i] == null)
        {
          this.notes[i] = new Note(message);
          NumberOfNotes = NumberOfNotes+ 1;
          break;
        }
      }
    }

  }
  public void addHighPriorityNote(String message)
  {
    if (NumberOfNotes <= notes.length)
    {
      for (int i = 0; i < NumberOfNotes; i++)
      {
        if (notes[i] == null)
        {
          notes[i] = new Note(message);
          notes[i].setHighPriority();
          NumberOfNotes += 1;
          break;
        }
      }
    }
  }

  public void removeNote(int index)
  {
    this.notes[index].setMessage(null);
  }

  public Note[] getAllNotes()
  {
    Note[] printNotes = new Note[NumberOfNotes];
    for (int i=0;i<NumberOfNotes;i++)
    {
      printNotes[i] = notes[i].copy();
    }
    return printNotes;
  }

  public int getNumberOfHighPriorityNotes()
  {
    int counter = 0;
    for (int i = 0; i < NumberOfNotes; i++)
    {
      if (notes[i].isHighPriority())
      {
        counter += counter + 1;
      }
    }
    return counter;
  }

  public Note[] getAllPriorityNotes()
  {
    Note[] priorityMessages = new Note[getNumberOfHighPriorityNotes()];

    for (int i = 0; i < NumberOfNotes; i++)
    {
      if (notes[i].isHighPriority())
      {
        for (int j=0; j<getNumberOfHighPriorityNotes();j++)

          priorityMessages[j] = notes[i].copy();
      }
    }
    return priorityMessages;
  }
}

