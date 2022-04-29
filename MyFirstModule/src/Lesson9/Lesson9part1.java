package Lesson9;

import org.w3c.dom.ls.LSOutput;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Lesson9part1
{
  public static void main(String[] args)
  {
    Scanner user = new Scanner(System.in);
    System.out.println("Enter any number:");
    int n = user.nextInt();
    do
    {
      System.out.println(n);
      n--;

    }
    while (n > 0);

    Scanner user2 = new Scanner(System.in);
    System.out.println("Enter a number to print all them before it");
    int n2= user.nextInt()*2;
    do
    {
      System.out.println(n2);
      n2--;
      n2--;
    }
    while (n2 > 0);


  }


}
