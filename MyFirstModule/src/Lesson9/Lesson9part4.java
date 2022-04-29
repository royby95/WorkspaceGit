package Lesson9;

import java.util.Scanner;

public class Lesson9part4
{
  public static void main(String[] args)
  {
    Scanner user = new Scanner(System.in);

    System.out.println("Chose end year\n");
    int end= user.nextInt();
    System.out.printf("Chose start year\n");
    int start = user.nextInt();
    Lesson9part3 year = new Lesson9part3();
    int number = 0;
    for(int i = start ; i<=end ; i++)
    { year.setYear(i);
      if (year.isLeapYear()) {
        System.out.println(i);
        number=number+1;
      }
    }
    System.out.println("Counting of leap years "+ number);


  }

}
