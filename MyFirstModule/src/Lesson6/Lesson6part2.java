package Lesson6;

import java.util.Scanner;

public class Lesson6part2
{
  public static void main(String[] args)
  {
    Scanner user = new Scanner(System.in);
    System.out.println("Type your gender");
    String gender = user.nextLine();
    System.out.println("Type your age");
    int age = user.nextInt();
    char extGender = gender.charAt(0);

    if (!(extGender =='M' ||extGender == 'F') || age < 0)
    {
      System.out.println("error in typed values");
    }
    else if (extGender == 'M' && age < 18)
    {
      System.out.println("is a boy");
    }
    else if (extGender == 'M' && age >= 18)
    {
      System.out.println("is a man");
    }
    else if (extGender == 'F' && age < 18)
    {
      System.out.println("is a girl");
    }
    else
    {
      System.out.println("is a woman");
    }



  }
}
