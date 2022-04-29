package Lesson10;

import java.util.Scanner;

public class Lesson10
{
  public static void main(String[] args)
  {
    Scanner user = new Scanner(System.in);
    String username = null;
    int password=0;
    int confPassword=1;

    while (password!=confPassword)
        {
          System.out.println("wrong password, type again");
            System.out.println("type your user");
            String newUsername = user.nextLine();
            username=newUsername  ;
            System.out.println("type your password");
            int newpassword= user.nextInt();
            password =newpassword ;
            System.out.println("confirm your password");
            int newconfPassword = user.nextInt();
            confPassword = newconfPassword  ;
          user.nextLine();

        }
      }
    }

