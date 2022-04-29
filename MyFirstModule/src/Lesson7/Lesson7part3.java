package Lesson7;

import java.util.Scanner;

public class Lesson7part3
{
  public static void main(String[] args)
  {
    Scanner user = new Scanner(System.in);
    System.out.println("Type the user name" );
    String name=user.nextLine();
    System.out.println("Type the password" );
    String password=user.nextLine();
    System.out.println("Repeat the password" );
    String password2=user.nextLine();
    System.out.println("The user name is: " + name);
    if (password.equals(password2))
    {
      System.out.println("passwords are identical");
    }
    else{
      System.out.println("passwords are different , please write the password again");
    }
  }
}
