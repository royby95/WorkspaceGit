package Lesson9;

public class Lesson9part6
{
  public static void main(String[]args)
  {
    int lastNumber = 1;
    int recentNumber = 1;
    int result = 2;
    for (int i = 0; i <= 20; i++)
    {

      if (i == 1 || i == 0)
      {

        System.out.println("Fibonacci" + "(" + i + ")" + ":" + lastNumber);
      }
      else if (i == 2)
      {
        System.out.println(
            "Fibonacci" + "(" + i + ")" + ":" + (lastNumber + recentNumber));
      }
      else
      {
        lastNumber = recentNumber;
        recentNumber = result;
        result = lastNumber + recentNumber;
        System.out.println("Fibonacci" + "(" + i + ")" + ":" + result);
      }

    }

    double n = 1;
    double p = 0;
    for (int i = 0; i <= 20; i++)
    {
      double temp = n;

      n += p;
      p = temp;
      System.out.printf("Fibonacci (%d): %f\n", i, n);
    }
  }
}
