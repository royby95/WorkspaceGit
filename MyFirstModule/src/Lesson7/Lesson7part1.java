package Lesson7;

import java.util.Scanner;

public class Lesson7part1
{
  public static void main(String[] args)
  {
    Scanner user = new Scanner(System.in);
    System.out.println("Write a number between 1-10");
    int number = user.nextInt();
    if (number == 1)
    {
      System.out.println("Roman numeral is equal to I");
    }
    else if (number == 2)
    {
      System.out.println("Roman numeral is equal to II");
    }
    else if (number == 3)
    {
      System.out.println("Roman numeral is equal to III");
    }
    else if (number == 4)
    {
      System.out.println("Roman numeral is equal to IV");
    }
    else if (number == 5)
    {
      System.out.println("Roman numeral is equal to V");
    }
    else if (number == 6)
    {
      System.out.println("Roman numeral is equal to VI");
    }
    else if (number == 7)
    {
      System.out.println("Roman numeral is equal to VII");
    }
    else if (number == 8)
    {
      System.out.println("Roman numeral is equal to VIII");
    }
    else if (number == 9)
    {
      System.out.println("Roman numeral is equal to IX");
    }
    else if (number == 6)
    {
      System.out.println("Roman numeral is equal to X");
    }
    else
    {
      System.out.println("there is no Roman numeral");
    }

  }
}
