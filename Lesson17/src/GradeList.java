import java.util.ArrayList;
import java.util.Arrays;

public class GradeList
{
  public ArrayList<Grade> grades;

  public GradeList()
  {
    this.grades = new ArrayList<Grade>();
  }

  public int getNumberOfGrades()
  {
    return grades.size();
  }

  public ArrayList<Grade> getAllGrades()
  {
    return grades;
  }

  public Grade[] getAllGradesAsArray()
  {
    Grade[] tempArray = new Grade[grades.size()];
    Grade[] newArray = grades.toArray(tempArray);

    return newArray;
  }

  public void addGrade(Grade grade)
  {
    grades.add(grade);
  }

  public double getAverage()
  {
    double sum = 0;
    double average;
    for (int i=0;i<grades.size();i++)
    {
      sum += grades.get(i).getGrade();
    }
     average= sum / grades.size();
    return average;
  }


  public String toString()
  {
    String gradeList="";
    for (int i=0; i<grades.size();i++)
    {
      gradeList += grades.get(i)+" ";
    }
    return gradeList;
  }
}
