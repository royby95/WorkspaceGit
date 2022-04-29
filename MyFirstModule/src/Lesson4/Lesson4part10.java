package Lesson4;

public class Lesson4part10
{
  public static void main(String[]args)
  {
    Lesson4part9 student1 = new Lesson4part9("Pedro", 'M');
    Lesson4part9 student2 = new Lesson4part9("Bob", 'M', 2342);
    Lesson4part9 student3 = new Lesson4part9("Rodrigo", 'M');
    student1.setName("Francisco");
    student1.setStudentNumber(123433);
    System.out.println(student1.getName());
    student2.getGender();
    student2.getStudentNumber();
    System.out.println(student2.toString());

    System.out.println(student1);
    System.out.println(student2);
    System.out.println(student3);
  }
}
