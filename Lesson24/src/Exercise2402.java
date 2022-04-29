import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise2402
{
  public static void main(String[] args)
  {
    Scanner read = null;
    Scanner user = new Scanner(System.in);
    System.out.println("Type file name");
    String fileName = user.nextLine();
    try
    {
      FileInputStream fileIn = new FileInputStream("Lesson24/" + fileName);
      read = new Scanner(fileIn);
    }
    catch (FileNotFoundException e)
    {
      System.out.println("file not found, or could not be opened");
      System.exit(1);
    }
    while (read.hasNext())
    {
      System.out.println(read.nextLine());
    }
    read.close();
  }
}
