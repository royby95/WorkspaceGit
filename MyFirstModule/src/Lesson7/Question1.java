package Lesson7;

import java.util.Scanner;

public class Question1
{
  public static void main(String[] args)
  {
    Scanner user = new Scanner(System.in);
    System.out.println("Type an integer");
    int integer1 = user.nextInt();
    System.out.println("Type a second integer");
    int integer2 = user.nextInt();
    System.out.println("Type a third integer");
    int integer3 = user.nextInt();

    System.out.println(
        "The product of" + "(integer1 * integer2) is: " + integer1 * integer2);
    System.out.println(
        "The sum of" + "(integer1 + integer2) is: " + (integer1 + integer2));
    System.out.println(
        "The quotient of" + "(integer2 / integer3) is: " + ((double)integer2 / integer3));
    System.out.println(
        "The difference of" + "(integer2-integer3) is: " + (integer2
            - integer3));
  }
}
