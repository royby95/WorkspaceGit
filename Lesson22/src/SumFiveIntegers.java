import java.util.Scanner;

public class SumFiveIntegers
{
  public static void main(String[]args)
  {
    Scanner user = new Scanner(System.in);
    int sum = 0;
    for (int i = 0; i < 5; i++)
    {
      System.out.println("type a number");
      sum += user.nextInt();
    }
    System.out.println(sum);
  }
}
