package PracticeExam2;

import java.util.ArrayList;

public class BookList
{
  private ArrayList<Book> books;

  public BookList()
  {
    books = new ArrayList<Book>();
  }

  public int getNumberOfBooks()
  {
    return books.size();
  }

  public void addBook(Book book)
  {
    books.add(book);
  }

  public Book getBook(int index)
  {
    return books.get(index);
  }

  public Book getBook(String isbn)
  {
    for (int i = 0; i < books.size(); i++)
    {
      if (books.get(i).getIsbn().equals(isbn))
      {
        return books.get(i);
      }
    }
    return null;
  }

  public void removeBook(int index)
  {
    books.remove(index);
  }

  public int getIndexOfFirstPrintedBook()
  {
    for (int i = 0; i < books.size(); i++)
    {
      if (books.get(i).getBookType().equals("Paperback") || books.get(i)
          .getBookType().equals("HardCover"))
      {
        return i;
      }
    }
    return 0;
  }

  public int getNumberOfBooksByType(String bookType)
  {
    int printedBooksNumber = 0;
    int EbooksNumber = 0;
    if (bookType.equals("PrintedBook"))
    {
      for (int i = 0; i < books.size(); i++)
      {
        if (books.get(i).getBookType().equals("PaperBack") || books.get(i)
            .getBookType().equals("HardCover"))
        {
          printedBooksNumber++;
        }
      }
      return printedBooksNumber;
    }
    else if (bookType.equals("Ebook"))
    {
      for (int i = 0; i < books.size(); i++)
      {
        if (books.get(i).getBookType().equals("Ebook"))
        {
          EbooksNumber++;
        }
      }
      return EbooksNumber;
    }
    return 0;
  }

  public Book[] getBooksByType(String bookType)
  {
    if (bookType.equals("PrintedBook"))
    {
      Book[] printedArray = new Book[getNumberOfBooksByType(bookType)];
      for (int i = 0; i < books.size(); i++)
      {
        if (books.get(i).getBookType().equals("PaperBack") || books.get(i)
            .getBookType().equals("HardCover"))
        {
          printedArray[i] = books.get(i);
        }
      }
      return printedArray;
    }
    else if (bookType.equals("Ebook"))
    {
      Book[] ebookArray = new Book[getNumberOfBooksByType(bookType)];
      for (int i = 0; i < books.size(); i++)
      {
        if (books.get(i).getBookType().equals("Ebook"))
        {
          ebookArray[i] = books.get(i);
        }
      }
      return ebookArray;
    }

    return new Book[0];
  }

  public Ebook[] getAllEBooks()
  {
    Ebook[] tempArray = new Ebook[getNumberOfBooksByType("Ebook")];
    for (int i = 0; i < books.size(); i++)
    {
      if (books.get(i).getBookType().equals("Ebook"))
      {
        tempArray[i] = (Ebook) books.get(i);
      }
    }
    return tempArray;
  }

  public String toString()
  {
    String tempString = "";
    for (int i = 0; i <books.size() ; i++)
    {
      tempString += books.get(i);
    }
    return tempString;
  }

  public boolean equals(Object object)
  {
    if (!(object instanceof BookList))
    {
      return false;
    }
    BookList temp = (BookList) object;

    return temp.equals(books);
  }
}

