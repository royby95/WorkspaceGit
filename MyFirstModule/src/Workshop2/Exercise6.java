package Workshop2;

import java.util.Scanner;

public class Exercise6
{
  public static void main(String[]args)
  {
    Scanner user = new Scanner(System.in);
    System.out.println("enter positive number");
    double n = user.nextDouble();

    while (n<=0)
    {
      System.out.println("enter positive number");
      double n2=user.nextDouble();
      n=n2;
    }

  }
}
