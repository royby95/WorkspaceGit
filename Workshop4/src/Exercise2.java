import java.util.Scanner;

public class Exercise2
{
  public static void main(String[] args)
  {
    Scanner user = new Scanner(System.in);
    System.out.println("How many elements you want to print");
    int numberElements=user.nextInt();
    int[] numbers = new int[numberElements];


    for (int i=0; i<numbers.length;i++)
    {
      System.out.println("type number");
      numbers[i]= user.nextInt();
    }
    boolean statement = false;
    for (int i = 0; i < numbers.length; i++)
    {
      if (numbers[i] == 7 || numbers[i] == 9 || numbers[i] == 13)
      {
        statement=true;
      }
      else {
        statement=false;
      }
    }
    if (statement)
    {
      System.out.println("Lucky");
    }
    else {
      System.out.println("Contains no 7-9-13");
    }
  }
}
