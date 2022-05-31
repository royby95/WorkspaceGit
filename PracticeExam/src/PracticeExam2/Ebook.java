package PracticeExam2;

public class Ebook extends Book
{
  private String url;

  public Ebook(String url, String title, String isbn)
  {
    super(url, title);
    this.url = url;
  }

  public String getUrl()
  {
    return url;
  }

  public String getBookType()
  {
    return "E-book";
  }

  public String toString()
  {
    return super.toString() + url;
  }

  public boolean equals(Object object)
  {
    if (!(object instanceof Ebook))
    {
      return false;
    }
    Ebook tempEbook = (Ebook) object;
    return super.equals(object) && tempEbook.url.equals(url);
  }
}

