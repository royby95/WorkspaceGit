public class Student
{
  private String name;
  private int grade;

  public Student(String name, int grade)
  {

    if(grade!=-3 && grade!=0 && grade!=2 && grade!=4 && grade!=7 && grade!=10 && grade!=12)
    {
      throw new IllegalGradeException();
    }
    else {
      this.grade = grade;
    }
    this.name = name;
  }

  public String getName()
  {
    return name;
  }

  public int getGrade()
  {
    return grade;
  }

  public void setGrade(int grade)
  {
    if(grade!=-3 && grade!=0 && grade!=2 && grade!=4 && grade!=7 && grade!=10 && grade!=12)
    {
      throw new IllegalGradeException();
    }
    else {
      this.grade = grade;
    }
  }

  public String toString()
  {
    return name + " " + grade;
  }
}

