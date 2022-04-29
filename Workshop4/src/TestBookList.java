public class TestBookList
{
  public static void main(String[] args)
  {
    BookList bookList1 = new BookList(3);
    Book book1 = new Book("Algorithms", 1992);
    Book book2 = new Book("Java", 1995);
    Book book3 = new Book("HTML", 2003);
    Book book4 = new Book("HTML", 2003);
    bookList1.addBook(book1);
    bookList1.addBook(book2);
    bookList1.addBook(book3);
    System.out.println(bookList1);
    System.out.println(bookList1.getSize());
    System.out.println(bookList1.contains(book4));
    System.out.println(bookList1.getBook(0));
    System.out.println(bookList1.getBook(1));
    System.out.println(bookList1.getBook(2));
    System.out.println(bookList1.getYearOfTheBook("HTML"));

  }
}
