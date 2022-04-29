import java.util.Arrays;

public class GradeList
{
  public Grade[] grades;

  public GradeList(int numberOfGrades)
  {
    this.grades = new Grade[numberOfGrades];
  }

  public int getNumberOfGrades()
  {
    return grades.length;
  }

  public Grade getGrade(int index)
  {
    return grades[index];
  }

  public void setGrades(Grade grade, int index)
  {
    grades[index] = grade;
  }

  public double getAverage()
  {
    int total = 0;
    for (int i=0; i<grades.length;i++)
    {
      total += grades[i].getGrade();
    }
    return (double)total / grades.length;
  }

  public String toString()
  {
    String gradeList="";
    for (int i=0; i<grades.length;i++)
    {
      gradeList += grades[i];
    }
    return gradeList;
  }
}
