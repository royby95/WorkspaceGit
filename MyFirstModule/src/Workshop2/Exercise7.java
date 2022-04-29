package Workshop2;

import java.util.Scanner;

public class Exercise7
{
  public static void main(String[] args)
  {
    Scanner user = new Scanner(System.in);
    System.out.println("enter prime number");
    double prime = user.nextDouble();
    int n = 0;
    for (int i = 1; i <= 100; i++)

    {
      if (prime % i != 0)
      {
        System.out.println("(" + i + ")" + "not evenly");
      }
      else if ((prime % prime == 0) && (prime % 1 == 0))
      {
        System.out.println("(" + i + ")" + "evenly");
        n = n + 1;
      }
    }
    if (n <= 2)
    {
      System.out.println(prime + " it is prime number ");
    }
    else
    {
      System.out.println(prime + " it is not prime number ");
    }
  }
}