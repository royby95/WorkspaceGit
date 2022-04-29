public class BookList
{
  private int size=0;
  private Book[] books;

  public BookList(int MaxNumberOfBooks)
  {
    books = new Book[MaxNumberOfBooks];
  }

  public int getSize()
  {
    return size;
  }

  public void addBook(Book book)
  {
    if (size < books.length)
    {
      for (int i = 0; i < books.length; i++)
      {
        if (books[i] == null)
        {
          books[i] = book;
          break;
        }
      }
    }
    size += 1;
  }

  public Book getBook(int index)
  {
    return books[index];
  }

  public boolean contains(Book book)
  {
    for (int i=0;i<books.length;i++)
    {
      if (books[i].equals(book))
      {
        return true;
      }
    }
    return false;
  }

  public int getYearOfTheBook(String bookTitle)
  {
    for (int i=0;i<books.length;i++)
    {
      if (books[i].getTitle().equals(bookTitle))
      {
        return books[i].getYear();
      }
    }
    return -1;
  }

  public String toString()
  {
    String bookList = "";

    for (int i=0; i<books.length;i++)
    {
      bookList += " "+books[i];
    }
    return bookList;
  }

}
