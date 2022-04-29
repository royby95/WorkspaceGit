import java.util.Scanner;

public class Exercise2202
{

  public static void main(String[] args)
  {
    int positiveSum = 0;
    int negativeSum = 0;
    Scanner user = new Scanner(System.in);
    int x;
    do
    {
      x = user.nextInt();
      if (x > 0)
      {
        positiveSum += x;
      }
      else
      {
        negativeSum +=x;
      }
    }
    while (x != 0);

    System.out.println(positiveSum);
    System.out.println(negativeSum);
  }
}

