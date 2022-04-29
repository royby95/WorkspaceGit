import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercise2401
{
  public static void main(String[] args)
  {
    Scanner user = new Scanner(System.in);
    System.out.println("Type file name");
    String fileName = user.nextLine();
    PrintWriter write = null;
    try
    {
      FileOutputStream fileOut = new FileOutputStream("Lesson24/" + fileName);
      write = new PrintWriter(fileOut);
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found, or could not be opened");
      System.exit(1);
    }
    String name = "";

    while (!name.equalsIgnoreCase("DONE"))
    {
      if (name.equalsIgnoreCase("DONE"))
      {
      }
      else
      {
        name = user.nextLine();
        write.println(name);
      }
    }
    write.close();
  }
}



