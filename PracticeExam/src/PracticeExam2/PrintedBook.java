package PracticeExam2;

public class PrintedBook extends Book
{
  private boolean isPaperback;

  public PrintedBook(String title, String isbn, Boolean isPaperback)
  {
    super(title,isbn);
    this.isPaperback = isPaperback;
  }

  public String getBookType()
  {
    if (isPaperback)
    {
      return "PaperBack";
    }
    else
    {
      return "HardCover";
    }
  }

  public String toString()
  {
    return super.toString() + "Is Paperback:" + isPaperback;
  }

  public boolean equals(Object object)
  {
    if (!(object instanceof PrintedBook))
    {
      return false;
    }
    PrintedBook other = (PrintedBook) object;
    return super.equals(other) && other.isPaperback == isPaperback;
  }

}
