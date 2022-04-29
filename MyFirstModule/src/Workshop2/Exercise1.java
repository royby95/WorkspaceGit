package Workshop2;

import java.util.Scanner;

public class Exercise1
{
  public static void main(String[] args)
  {
    Scanner user = new Scanner(System.in);
    char letter;
    do
    {
      System.out.println("type the names of your family members");
      String names = user.nextLine();
      System.out.println("do you have more family members?");
      String response = user.nextLine();
      letter=response.charAt(0);

    }
    while (letter=='y' || letter=='Y');

  }



}
