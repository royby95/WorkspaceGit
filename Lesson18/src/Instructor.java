public class Instructor
{
  private String name;
  private int officeNumber;

  public Instructor(String name, int officeNumber)
  {
    this.name = name;
    this.officeNumber = officeNumber;
  }

  public String getName()
  {
    return name;
  }

  public int getOfficeNumber()
  {
    return officeNumber;
  }

  public boolean equals(Object object)
  {
    if (!(object instanceof Instructor))
    {
      return false;
    }
    Instructor other = (Instructor) object;

    return name.equals(other.name) && officeNumber == other.officeNumber;
  }

  public String toString()
  {
    return name + " " + officeNumber;
  }
}
