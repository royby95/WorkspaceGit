package Lesson3;

public class Lesson3Part8
{
  public static void main(String[] args)
  {
    Lesson3Part7 Employee = new Lesson3Part7();
    Employee.setPerson1("Susan Meyers",47899,"Accounting","Vice President");
    Employee.setPerson2("Mark Jones",39119,"IT","Programmer");
    Employee.setPerson2("Joy Rogers",81774,"Manufacturing","Engineer");

    System.out.println(Employee.getPerson1());
    System.out.println(Employee.getPerson2());
    System.out.println(Employee.getPerson3());
  }
}
