package Lesson4;

public class Lesson4part1
{
  private String name;
  private String birthday;

  public Lesson4part1(String name, String birthday)
  {
    this.name = name;
    this.birthday = birthday;
  }

  public Lesson4part1()
  {
    name = "Felipe";
    birthday = "07/03/95";
  }
  public void setName(String n)
  {
    this.name = n;
  }
  public void setBirthday(String b)
  {
    this.birthday = b;
  }
  public String getName()
  {
    return name;
  }
  public String getBirthday()
  {
    return birthday;
  }
  public String toString()
  {
    return " name " + name + " birthday " + birthday;
  }
}