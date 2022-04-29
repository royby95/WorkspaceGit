package Lesson5;

import Lesson4.Lesson4part1;

public class Lesson5part2
{
  public static void main(String[] args)
  {
    Lesson4part1 employee1 = new Lesson4part1("Rodrigo","07/03/95");
    Lesson5part1 job1 = new Lesson5part1("Musician",20.4,new Lesson4part1("Pedro","05/05/95"));
    Lesson5part1 job2 = new Lesson5part1("Engineer",22.9,employee1);
    System.out.println(job2);
    employee1.setName("Pablo");
    System.out.println(job2.getEmployee());
    System.out.println(job2);
    job2.givePercentageRaise(.20);
    System.out.println(job2);

  }
}
