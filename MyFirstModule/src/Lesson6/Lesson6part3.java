package Lesson6;

import java.util.Scanner;

public class Lesson6part3
{
  public static void main(String[] args)
  {
    Scanner user = new Scanner(System.in);
    System.out.println("Type your Danish grade");
    int grade = user.nextInt();

    if (grade == 12)
    {
      System.out.println("your grade equals to A in international grade system"); ;
    }
    else if (grade == 10)
    {
      System.out.println("your grade equals to B in international grade system");
    }
    else if (grade == 7)
    {
      System.out.println("your grade equals to C in international grade system");
    }
    else if (grade == 4)
    {
      System.out.println("your grade equals to D in international grade system");
    }
    else if (grade == 2)
    {
      System.out.println("your grade equals to E in international grade system");
    }
    else if (grade == 0)
    {
      System.out.println("your grade equals to Fx in international grade system");
    }
    else if (grade == -3)
    {
      System.out.println("your grade equals to F in international grade system");
    }
    else{
      System.out.println("your grade could not be converted");
    }
  }
}
