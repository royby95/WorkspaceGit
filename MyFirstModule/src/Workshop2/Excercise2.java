package Workshop2;

import java.util.Scanner;

public class Excercise2
{
  public static void main(String[] args)
  {
    Scanner user = new Scanner(System.in);
    System.out.println("how many times you want to loop?");
    int n= user.nextInt();
    int sum = 0;

    for (int i=0;i<=n;i++)
    {
      sum = sum + i;
    }
    System.out.println("the result is:"+ sum);
  }
}
