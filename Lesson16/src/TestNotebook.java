public class TestNotebook
{
  public static void main(String[] args)
  {
    Note note1 = new Note("Hello");
    Note note2 = new Note("Good Bye");

    Note note3 = note1.copy();

    Notebook notebook1 = new Notebook(6);
    notebook1.addNote(note1);
    notebook1.addNote(note2);
    notebook1.addNote(note3);
    notebook1.addNote("Dog");
    notebook1.addHighPriorityNote("WaterMellon");
    System.out.println(notebook1.getNumberOfNotes());
    System.out.println(notebook1.getAllNotes());


  }
}

