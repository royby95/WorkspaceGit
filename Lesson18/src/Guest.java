public class Guest
{
  private String name;

  public Guest(String name)
  {
    this.name = name;
  }

  public String getName()
  {
    return name;
  }

  public boolean equals(Object object)
  {
    if (!(object instanceof Guest))
    {
      return false;
    }
    Guest other = (Guest) object;

    return name.equals(other.name);
  }

  public String toString()
  {
    return " " + name;
  }
}
