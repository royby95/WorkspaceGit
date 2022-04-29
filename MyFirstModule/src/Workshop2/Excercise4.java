package Workshop2;

import java.util.Scanner;

public class Excercise4
{
  public static void main(String[] args)
  {
    Scanner user = new Scanner(System.in);
    System.out.println("how many times you want to loop?");
    int n= user.nextInt();
    double sum = 0;


    for ( int i=1;i<=n;i++)
    {
      sum += (double) (i)/((2*i)+1);

    }
    System.out.println(sum);
  }
}
