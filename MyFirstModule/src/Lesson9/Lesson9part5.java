package Lesson9;

public class Lesson9part5
{
  public static void main(String[] args)
  {

    Lesson9part3 birthday = new Lesson9part3();
    birthday.setYear(1995);
    birthday.setMonth(3);
    birthday.setDay(7);
    for (int i = 1995; i <= 2022; i++)
    {
      for (int j = 3; j <= 12; j++)
      {
        for (int k = 07; k <= 30; k++)
        {
          birthday.nextDay();
          System.out.println("dias" + birthday.getDay());
        }
      }
    }
  }

}

