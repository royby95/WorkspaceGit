public class TestGradeList
{
  public static void main(String[] args)
  {
    Grade grade1 = new Grade("Mathemathics", 7);
    Grade grade2 = new Grade("Physics", 8);

    GradeList gradeList1 = new GradeList(2);

    System.out.println(grade1.getGrade());
    System.out.println(gradeList1.getNumberOfGrades());
    gradeList1.setGrades(grade1,1);
    gradeList1.setGrades(grade2,0);
    System.out.println(gradeList1.getGrade(1));
    System.out.println(gradeList1.getGrade(0));

  }
}
