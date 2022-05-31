package Lesson13;

import Lesson12.Lesson11.MyDate;

public class TestPerson
{
  public static void main(String[] args)
  {
    Person person1 = new Person("Rodrigo", "Norregade10",new MyDate(7,3,1995));
    System.out.println(person1.getBirthday());
    System.out.println(person1.getAge());
  }
}
