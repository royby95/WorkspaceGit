import java.util.Arrays;

public class GradeList
{
  private int[] grades;


  public GradeList(int numberOfGrades)
  {
    grades = new int[numberOfGrades];
  }

  public int getNumberOfGrades()
  {
    return grades.length;
  }
  public int getGrade(int index)
  {
    return grades[index];
  }

  public void setGrade(int grade, int index)
  {
    grades[index] = grade;
  }

  public double getAverage()
  {
    int total = 0;
    for (int i=0;i<grades.length;i++)
    {
      total += grades[i];
    }
    return  (double)total / grades.length;
  }

  public String toString()
  {
    return Arrays.toString(grades);
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof GradeList))
    {
      return false;
    }
    GradeList other = (GradeList) obj;

    boolean statement = true;
    for (int i=0;i<getNumberOfGrades();i++)
    {
      if (grades[i] != other.getGrade(i))
      {
        statement = false;
        break;
      }
    }
    if (statement)
    {
      System.out.println("are equal");
    }
    else{
      System.out.println("are not equal");
    }
    return false;
  }
}
