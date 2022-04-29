package Lesson6;

import java.util.Scanner;

public class Lesson6part7
{
  public static void main(String[] args)
  {
    Scanner user = new Scanner(System.in);
    System.out.println("Type de value of a");
    double a = user.nextDouble();
    System.out.println("Type de value of b");
    double b = user.nextDouble();
    System.out.println("Type de value of c");
    double c = user.nextDouble();
    double d = (Math.pow(b,2)) - (4 * a * c);

    if (d < 0)
    {
      System.out.println("there is no solution");
    }
    if (d==0)
    {
      System.out.println("the only solution is: " + -b/2*a);
    }
    else {
      System.out.println("the two possible solutions are: " + ((-b+Math.sqrt(d))/(2*a)) + " / "+ (-b-Math.sqrt(d))/(2*a));
    }
  }
}
