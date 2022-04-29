import java.util.ArrayList;

public class Course
{
  private String title;
  private Instructor[] instructors=new Instructor[2];
  private ArrayList<Student> students;

  public Course(String title, Instructor primaryInstructor)
  {
    this.title = title;
    instructors[0] =primaryInstructor ;
    instructors[1] = null;
    students = new ArrayList<>();
  }

  public String getTitle()
  {
    return title;
  }

  public Instructor getPrimaryInstructor()
  {
    return instructors[0];
  }

  public Instructor getSecondaryInstructor()
  {
    return instructors[1];
  }

  public void setSecondaryInstructor(Instructor instructor)
  {
    instructors[1] = instructor;
  }

  public void addStudent(Student student)
  {
    students.add(student);
  }

  public int getNumberOfInstructors()
  {
    return instructors.length;
  }

  public int getNumberOfStudents()
  {
    return students.size();
  }

  public Student[] getStudentsBySemester(int semester)
  {
    Student[] tempArray = new Student[students.size()];
    Student[] newArray = students.toArray(tempArray);
    for (int i = 0; i <newArray.length ; i++)
    {
      if (students.get(i).getSemester() == semester)
      {
        newArray[i] = students.get(i);
      }
    }
    return newArray;
  }

  public boolean hasStudent(String name)
  {
    for (int i = 0; i <students.size() ; i++)
    {
      if (students.get(i).getName().equals(name));
      {
        return true;
      }
    }
    return false;
  }

  public String toString()
  {
    String courseInfo = "";

    for (int i = 0; i <students.size() ; i++)
    {
      courseInfo += getTitle()+" " + getPrimaryInstructor()+" " + " "+ getSecondaryInstructor()+" "
              + students.get(i)+"\n";
    }
    return courseInfo;
  }
}
