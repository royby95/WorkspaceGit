package Lesson10;

public class Lesson10part2
{
  public static void main(String[]args)
  {
    double total = 0;
    double grains = 1;
    for (double i=1;i<=64;i++)
    {
      System.out.println("Square"+"("+i+")"+grains);
      grains = grains * 2;
      total += grains;
    }
    System.out.println("total grains"+total);
  }
}
