public class Student
{
  private String name;
  private int semester;

  public Student(String name, int semester)
  {
    this.name = name;
    this.semester = semester;
  }

  public String getName()
  {
    return name;
  }

  public int getSemester()
  {
    return semester;
  }

  public boolean equals(Object object)
  {
    if (!(object instanceof Student))
    {
      return false;
    }
    Student other = (Student) object;

    return name.equals(other.name) && semester == other.semester;
  }

  public String toString()
  {
    return name +" "+ semester;
  }
}
