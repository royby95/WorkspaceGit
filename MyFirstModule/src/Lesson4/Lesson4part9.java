package Lesson4;

public class Lesson4part9
{
    public String name;
    public char gender;
    public int studentNumber;

  public Lesson4part9(String name, char gender, int studentNumber)
    {
      this.name = name;
      this.gender = gender;
      this.studentNumber = studentNumber;
    }

  public Lesson4part9(String name, char gender)
    {
      this.name = name;
      this.gender = gender;
      studentNumber = 0;
    }

    public void setName(String name)
    {
      this.name = name;
    }

    public void setStudentNumber(int studentNumber)
    {
      this.studentNumber = studentNumber;
    }

    public String getName()
    {
      return name;
    }

    public char getGender()
    {
      return gender;
    }

    public int getStudentNumber()
    {
      return studentNumber;
    }

  public String toString()
  {
    return "Name "+ name + " Gender: " + gender + " Student Number: " + studentNumber;
  }
    }


