package Lesson10;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lesson10part3
{
  public static void main(String[] args)
  {
    Scanner user = new Scanner(System.in);
    System.out.println("how many times you want to loop");
    int loops = user.nextInt();
    double pi = 0;
    double divisor = 3;
    double dividend = 1;
    double counter = 1;

    for (int i=0;i<=loops;i++)
    {
      if(counter % 2 != 0)
      {
        pi -= dividend / divisor;
      }
      else{
        pi += dividend / divisor;
      }
      divisor = divisor + 2;
      counter += 1;
    }

    System.out.println(4*(1+pi));


    DecimalFormat decimal = new DecimalFormat("0.00000");
    decimal.format(pi);
    double valuepi = 3.14156;
    int times = 0;
    while (valuepi>=pi)
    {

      if (counter % 2 != 0)
      {
        pi -= dividend / divisor;
      }
      else
      {
        pi += dividend / divisor;
      }
      divisor = divisor + 2;
      counter += 1;
      times += times;
    }

    System.out.println(4*(1+pi));
    System.out.println(times);
  }
}
