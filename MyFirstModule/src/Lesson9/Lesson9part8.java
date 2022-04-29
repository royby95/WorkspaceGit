package Lesson9;

import java.util.Random;
import java.util.Scanner;

public class Lesson9part8
{
  public static void main(String[] args)
  {
    Random rand = new Random();
    Scanner user = new Scanner(System.in);
    int number = rand.nextInt(1, 1000);
    System.out.println(number);
    int guess = 0;
    do
    {
      System.out.println("guess the number");
      guess = user.nextInt();
    }
    while (guess != number);
    System.out.println("is correct");
  }


}
