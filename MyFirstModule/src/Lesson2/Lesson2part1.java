package Lesson2;

import java.util.Scanner;

public class Lesson2part1
{
  public static void main(String[] args)
  {
    /*
    Challenge 12
    Write a program that asks the user to enter the name of his or her favorite city. Use a String
variable to store the input. The program should display the following:
 The number of characters in the city name
 The name of the city in all uppercase letters
 The name of the city in all lowercase letters
 First Character in the name of the city
     */
    Scanner user = new Scanner(System.in);
    String City = user.nextLine();
    int numberCharacters = City.length();
    System.out.println(numberCharacters);
    String upperCases = City.toUpperCase();
    System.out.println(upperCases);
    String lowerCases = City.toLowerCase();
    System.out.println(lowerCases);

    /*
    Write an application that reads three integers from the keyboard and displays the sum and the product on the screen.
     */
    Scanner user2 = new Scanner(System.in);
    int integer1 = user2.nextInt();
    System.out.println(integer1);
    int integer2 = user2.nextInt();
    System.out.println(integer2);
    int integer3 = user2.nextInt();
    System.out.println(integer3);
    int sum = integer1 + integer2 + integer3;
    System.out.println("THE SUM IS:"+ sum);
    int product = integer1 * integer2 * integer3;
    System.out.println("THE RESULT OF THE PRODUCT IS:"+ product);


  }

}
