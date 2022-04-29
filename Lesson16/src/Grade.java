public class Grade
{
  public String courseName;
  public int grade;

  public Grade(String CourseName, int grade)
  {
    this.courseName = CourseName;
    this.grade = grade;
  }

  public String getCourseName()
  {
    return courseName;
  }

  public int getGrade()
  {
    return grade;
  }

  public void setCourseName(String name)
  {
    this.courseName = name;
  }

  public void setGrade(int grade)
  {
    this.grade = grade;
  }

  public String toString()
  {
    return "" + courseName + grade;
  }
}
