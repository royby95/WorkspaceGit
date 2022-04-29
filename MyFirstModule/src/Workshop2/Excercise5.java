package Workshop2;

import java.util.Scanner;

public class Excercise5
{
  public static void main(String[] args)
  {
    Scanner user = new Scanner(System.in);
    System.out.println("how many times you want to loop?");
    int n= user.nextInt();
    double result = 0;

    for (int i=1;i<=n;i++)
    {

      result=Math.pow(2,i);
    }
    System.out.println(result);
  }
}
