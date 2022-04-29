package Lesson14;


public class TestPersonBrain
{
  public static void main(String[]args)
  {
    Person person1 = new Person("Rodrigo", "Norregade 10",new MyDate(5,7,1995));
    Brain brain1 = new Brain();
    System.out.println(person1);
    System.out.println(person1.getAge());
    System.out.println(person1.isBrainDamaged());
    System.out.println(person1.getIQ());
  }
}
