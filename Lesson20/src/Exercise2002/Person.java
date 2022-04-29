package Exercise2002;

public class Person
{
  private String name;
  private String address;

  Person(String name, String address)
  {
    this.name = name;
    this.address = address;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String Name)
  {
    this.name = name;
  }

  public String getAddress()
  {
    return address;
  }

  public void setAddress(String address)
  {
    this.address = address;
  }

  public String toString()
  {
    return name +" "+ address;
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Person))
    {
      return false;
    }

    Person other = (Person) obj;

    return name.equals(other.name) && address.equals(other.address);
  }
}
