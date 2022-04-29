package Lesson2;

import java.util.Scanner;

public class Lesson2part4
{
  public static void main(String[] args)
  {
    /*
    Challenge 10
    Write a program that asks the user to enter three test scores. The program should display
    each test score, as well as the average of the scores.
     */
    Scanner user = new Scanner(System.in);
    System.out.println("write the score for the first test");
    double test1 = user.nextDouble();
    System.out.println("write the score for the second test");
    double test2 = user.nextDouble();
    System.out.println("write the score for the third test");
    double test3 = user.nextDouble();
    System.out.println(("the avarage score is  " +(test1+test2+test3)/3));
  }
}
