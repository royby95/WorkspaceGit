package Lesson9;

import java.util.Scanner;

public class Lesson9part2
{
  public static void main(String[]args)
  {
    Scanner user = new Scanner(System.in);
    double n3 = user.nextDouble();
    while(n3>=1)
    {
      System.out.println((int)Math.pow(n3, 2));
      n3--;
    }
  }

}
