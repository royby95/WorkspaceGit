package Lesson2;

import java.util.Scanner;

public class Lesson2part2
{
  public static void main(String[] args)
  {
    /*
    Excercise 2.03
    Modify the program you made last time in Exercise 1.05 so that it now asks the user to input the sales tax,
    and the prices for the three items. Then calculate and print out the tax and total prices like before.
     */
    Scanner user = new Scanner(System.in);
    System.out.println("Type the tax");
    double tax = user.nextDouble();
    System.out.println("Type the price for first item");
    double price1 = user.nextDouble();
    double item1 = (price1*tax)+price1;
    System.out.println(item1);
    System.out.println("Type the price for second item");
    double price2 = user.nextDouble();
    double item2= (price2*tax)+price2;
    System.out.println(item2);
    System.out.println("Type the price for third item");
    double price3 = user.nextDouble();
    double item3= (price3*tax)+price3;
    System.out.println(item3);


  }
}
