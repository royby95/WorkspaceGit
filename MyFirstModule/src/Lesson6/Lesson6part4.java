package Lesson6;

import java.util.Scanner;

public class Lesson6part4
{
  public static void main(String[] args)
  {
    Scanner user = new Scanner(System.in);
    System.out.println("type two numbers two give the greater one");
    double number1 = user.nextDouble();
    double number2 = user.nextDouble();
    if (number1 > number2)
    {
      System.out.println("number 1 is greater than number 2");
    }
    else
    {
      System.out.println("number 2 is greater than number 1");
    }
    System.out.println("type two numbers to give sorted numbers");
    double number3 = user.nextDouble();
    double number4 = user.nextDouble();

    if (number3 > number4)
    {
      System.out.println(number4 + "/" + number3);
    }
    else
      System.out.println(number4 + "/" + number3);

    System.out.println("type three numbers to give sorted numbers");
    double number5 = user.nextDouble();
    double number6 = user.nextDouble();
    double number7 = user.nextDouble();
    if ((number5 > number6 && number5 > number7) && (number6 > number7))
    {
      System.out.println(number7 + "/" + number6 + "/" + number5);
    }
    else if ((number5 > number6 && number5 > number7) && (number7 > number6))
    {
      System.out.println(number6 + "/" + number7 + "/" + number5);
    }
    else if ((number6 > number5 && number6 > number7) && (number5 > number7))
    {
      System.out.println(number7 + "/" + number5 + "/" + number6);
    }
    else if ((number6 > number5 && number6 > number7) && (number7 > number5))
    {
      System.out.println(number5 + "/" + number7 + "/" + number6);
    }
    else if ((number7 > number6 && number7 > number5) && (number6 > number5))
    {
      System.out.println(number5 + "/" + number6 + "/" + number7);
    }
    else
    {
      System.out.println(number6 + "/" + number5 + "/" + number7);
    }
  }
}


