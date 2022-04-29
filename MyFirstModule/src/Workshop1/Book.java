
package Workshop1;

import java.util.Objects;

public class Book
{
  public String title;
  public int year;

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
    return "Book{" + "title='" + title + '\'' + ", year=" + year + '}';
  }


}
