package Exercise2002;

public class FullDegreeStudent extends Student
{
  private int age;
  private String nationality;

  public FullDegreeStudent(String name, String address, int studentNo, int age,
      String nationality)
  {
    super(name, address, studentNo);
    this.age = age;
    this.nationality = nationality;
  }

  public int getAge()
  {
    return age;
  }

  public void setAge(int age)
  {
    this.age = age;
  }

  public String getNationality()
  {
    return nationality;
  }

  public void setNationality(String nationality)
  {
    this.nationality = nationality;
  }

  public String toString()
  {
    return super.toString() + age + nationality;
  }

  public boolean equals(Object object)
  {
    if (!(object instanceof FullDegreeStudent))
    {
      return false;
    }

    FullDegreeStudent other = (FullDegreeStudent) object;

    return
        super.equals(object) && age ==other.age && nationality.equals(other.nationality);
  }

}
