import java.util.Arrays;

public class TestGradeList
{
  public static void main(String[] args)
  {
    GradeList gradesList = new GradeList(7);
    GradeList gradesList2 = new GradeList(7);

    gradesList.setGrade(-3,0);
    gradesList.setGrade(0,1);
    gradesList.setGrade(2,2);
    gradesList.setGrade(4,3);
    gradesList.setGrade(7,4);
    gradesList.setGrade(10,5);
    gradesList.setGrade(12,6);

    gradesList2.setGrade(-3,0);
    gradesList2.setGrade(0,1);
    gradesList2.setGrade(2,2);
    gradesList2.setGrade(4,3);
    gradesList2.setGrade(7,4);
    gradesList2.setGrade(12,6);



    System.out.println(gradesList);
    System.out.println(gradesList2);
    System.out.println(gradesList.getNumberOfGrades());
    System.out.println(gradesList.getAverage());
    System.out.println(gradesList.getGrade(3));

    gradesList.equals(gradesList2);

  }
}
