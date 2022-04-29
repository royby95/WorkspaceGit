package Exercise2002;

import java.util.ArrayList;

public class Student extends Person
{

  private int studentNo;
  private ArrayList<String> grades;

  public Student(String name, String address, int studentNo)
  {
    super(name, address);
    this.studentNo = studentNo;
    grades = new ArrayList<>();
  }

  public int getStudentNo()
  {
    return studentNo;
  }

  public void setStudentNo(int studentNo)
  {
    this.studentNo = studentNo;
  }

  public void addGrade(String grade)
  {
    grades.add(grade);
  }

  public String getGrade(int index)
  {
    String gradesList = "";
    for (int i = 0; i < grades.size(); i++)
    {
      gradesList += grades.get(index);
    }
    return gradesList;
  }

  public String[] getAllGrades()
  {
    String[] tempArray = new String[grades.size()];
    String[] newArray = grades.toArray(tempArray);

    return newArray;
  }

  public String toString()
  {
    return super.toString() + studentNo + grades;
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Student))
    {
      return false;
    }

    Student other = (Student) obj;

    return super.equals(obj) && studentNo == other.studentNo && grades.equals(
        other.grades);
  }
}
