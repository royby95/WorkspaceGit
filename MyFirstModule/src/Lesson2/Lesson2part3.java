package Lesson2;

import java.util.Scanner;
/*
Write an application that uses a Scanner object, to read your name, age and address.
Afterwards the application should display the information on the screen.
 */
public class Lesson2part3
{
  public static void main(String[] args)
  {
    Scanner user = new Scanner(System.in);
    System.out.println("write your name");
    String name = user.nextLine();
    System.out.println("your name is:" + name);
    System.out.println("write your adress");
    String address = user.nextLine();
    System.out.println("your adress is:"+ address);
    System.out.println("write your age");
    int age = user.nextInt();
    System.out.println("your age is:" + age);

  }
}
