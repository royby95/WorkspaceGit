import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Exercise2403
{
  public static void main(String[] args)
  {
    Scanner user = new Scanner(System.in);
    System.out.println("how many integers you want to write");
    int numberIntegers = user.nextInt();
    Random rand = new Random();
    try
    {
      FileOutputStream fileOut = new FileOutputStream("Lesson24/binaries.txt");
      ObjectOutputStream write = new ObjectOutputStream(fileOut);
      for (int i = 0; i < numberIntegers; i++)
      {
        write.writeDouble(rand.nextDouble()*10);
      }
      write.close();
    }
    catch (FileNotFoundException e)
    {
      System.out.println("file not found");
      System.exit(1);
    }
    catch (IOException e)
    {
      System.out.println("IO error writing to file");
      System.exit(1);
    }
  }
}
