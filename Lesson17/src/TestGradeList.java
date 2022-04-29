import java.util.Arrays;

public class TestGradeList
{
  public static void main(String[] args)
  {
    GradeList gradeList1 = new GradeList();

    Grade grade1 = new Grade("Mathemathics", 7);
    Grade grade2 = new Grade("Physics", 10);
    gradeList1.addGrade(grade1);
    gradeList1.addGrade(grade2);
    System.out.println(gradeList1.getNumberOfGrades());
    System.out.println(gradeList1.getAllGrades());;
    System.out.println(gradeList1);

    System.out.println(Arrays.toString(gradeList1.getAllGradesAsArray()));
  }
}
