package Lesson6;

import java.util.Scanner;

public class Lesson6part1
{
  public static void main(String[] args)
  {
    Scanner user = new Scanner(System.in);
    System.out.println("Type your age: ");
    int age= user.nextInt();

    if (age < 0)
    {
      System.out.println("error in age value");
    }
    if (age >= 0 && age <= 12)
    {
      System.out.println("Child");
    }
    if (age >= 13 && age <= 19)
    {
      System.out.println("Teenager");

    }
    if (age >= 20 && age <= 65)
    {
      System.out.println("Adult");
    }
     if (age > 65)
    {
      System.out.println("Senior Citizen");
    }
  }

}
