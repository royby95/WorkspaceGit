package Lesson3;

import java.util.Scanner;

public class Lesson3Part6
{
  public static void main(String[] args)
  {
    Lesson3part5 Payrolltest = new Lesson3part5();
    Scanner user = new Scanner(System.in);
    System.out.println("Type the name of the person");
    String name = user.nextLine();
    Payrolltest.setName(name);
    System.out.println("his/her name is:"+name);
    System.out.println("Type the pay rate");
    double payrate = user.nextDouble();
    user.nextLine();
    Payrolltest.setPayrate(payrate);
    System.out.println("Type the worked hours");
    double workedhours = user.nextDouble();
    user.nextLine();
    Payrolltest.setWorkedHours(workedhours);
    System.out.println("The gross pay is");
    System.out.println(Payrolltest.getGrossPay());
  }
}
