package Lesson8;

import java.util.Random;
import java.util.Scanner;

public class Lesson8part1
{
  public static void main(String[]args)
  {
    Random randomnumber = new Random();
    Scanner user = new Scanner(System.in);
    int number1 = randomnumber.nextInt(10)+1;
    System.out.println(number1);
    System.out.println("guess the number");
    int guess1 = user.nextInt();

    if (number1 == guess1)
    {
      System.out.println("is the same");
    }
    else {
      System.out.println("is not the same");
    }
  }
}
