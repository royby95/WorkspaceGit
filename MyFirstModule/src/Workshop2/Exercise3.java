package Workshop2;

import java.util.Scanner;

public class Exercise3
{
  public static void main(String[] args)
  {
    Scanner user = new Scanner(System.in);
    System.out.println("how many times you want to loop?");
    int n= user.nextInt();
    int product = 1;


    for (int i=1;i<=n;i++)
    {
      product = i*product;

    }
    System.out.println(product);
  }
}
