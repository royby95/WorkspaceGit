package Lesson4;

import org.w3c.dom.html.HTMLImageElement;

import java.util.Scanner;

public class Lesson4part7
{
  public String author;
  public String title;
  public double price;
  public int pages;

  public String getAuthor()
  {
    return author;
  }
  public String getTitle()
  {
    return title;
  }

  public double getPrice()
  {
    return price;
  }
  public int getPages()
  {
    return pages;
  }

  public void setPages(int pages)
  {
    this.pages = pages;
  }

  public Lesson4part7(String author, String title, double price, int pages)
  {
    this.author = author;
    this.title = title;
    this.price = price;
    this.pages = pages;
  }

  public String toString()
  {
    return "Author:\n" + author + "\nTitle\n" + title + "\nprice\n" + price
        + "\npages\n" + pages;
  }
  public static void main(String[] args)
  {
    Scanner user = new Scanner(System.in);
    System.out.println("INFORMATION BOOK1:\n");
    System.out.println("type the author");
    String author1= user.nextLine();
    System.out.println("type the title");
    String title1= user.nextLine();
    System.out.println("type the price");
    double price1= user.nextDouble();
    System.out.println("type the pages");
    int pages1= user.nextInt();
    user.nextLine();
    double newprice1 = price1 * .80;
    Lesson4part7 book1 = new Lesson4part7(author1,title1,newprice1,pages1);

    System.out.println("INFORMATION BOOK2:\n");
    System.out.println("type the author");
    String author2= user.nextLine();
    System.out.println("type the title");
    String title2= user.nextLine();
    System.out.println("type the price");
    double price2= user.nextDouble();
    System.out.println("type the pages");
    int pages2= user.nextInt();
    double newprice2 = price2 * .80;
    Lesson4part7 book2 = new Lesson4part7(author2,title2,newprice2,pages2);

    System.out.println("the book1 has the next information\n "+book1);
    System.out.println("the book2 has the next information\n "+book2);
  }
}
