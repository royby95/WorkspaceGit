public class Book
{
  private String title;
  private int year;

  public Book(String title, int year)
  {
    this.title = title;
    this.year = year;
  }

  public String getTitle()
  {
    return title;
  }

  public int getYear()
  {
    return year;
  }

  public String toString()
  {
    return title + " " + year;
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Book))
    {
      return false;
    }
    Book other = (Book) obj;

    return (other.title.equals(title) && other.year == year);
  }
}
