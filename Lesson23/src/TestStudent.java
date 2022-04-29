import java.util.Scanner;

public class TestStudent
{
  public static void main(String[] args)
  {
    Scanner user = new Scanner(System.in);
    Student student1 = new Student("Rodrigo", 2);
    boolean success = false;
    do
    {
      try
      {
        System.out.println("type a valid grade");
        student1.setGrade(user.nextInt());
        success = true;
      }
      catch (IllegalGradeException e)
      {
        e.printStackTrace();
        System.out.println("invalid grade");
      }
    }
    while (!success);

  }
}
