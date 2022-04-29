package Lesson10;

import java.text.DecimalFormat;


public class Lesson10part4
{
  public static void main(String[] args)
  {
    double pi = 0;
    double divisor = 3;
    double dividend = 1;
    double counter = 1;
    int times = 0;
    String valuePi = "3.14159";
    DecimalFormat decimal = new DecimalFormat("0.00000");

    do
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
      times = times+1;
    }
    while (!decimal.format(4*(1+pi)).equals(valuePi));

    System.out.println(decimal.format(4*(1+pi)));
    System.out.println(times);
  }
}
