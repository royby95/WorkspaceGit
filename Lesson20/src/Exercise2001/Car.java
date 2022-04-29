package Exercise2001;

public class Car extends Vehicle
{
  private String regNo;

  public Car(String owner, double price, String regNo)
  {
    super(owner, price);
    this.regNo = regNo;
  }

  public String getRegistrationNumber()
  {
    return regNo;
  }

  public void setRegistrationNumber(String regNo)
  {
    this.regNo = regNo;
  }

  public String toString()
  {
    return super.toString() + regNo;
  }

  public boolean equals(Object object)
  {
    if (!(object instanceof Vehicle))
    {
      return false;
    }

    Car other = (Car) object;

    return super.equals(object) && regNo.equals(((Car) object).regNo);
  }

}
