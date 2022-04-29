package Model;

import java.io.Serializable;

public class Car implements Serializable
{
  private String regNumber;
  private String make;
  private String model;
  private int year;
  private Owner owner;

  public Car(String regNumber, String make, String model, int year, Owner owner)
  {
    this.regNumber = regNumber;
    this.make = make;
    this.model = model;
    this.year = year;
    this.owner = owner;
  }

  public String getRegNumber()
  {
    return regNumber;
  }

  public String getMake()
  {
    return make;
  }

  public String getModel()
  {
    return model;
  }

  public int getYear()
  {
    return year;
  }

  public Owner getOwner()
  {
    return owner;
  }

  public String toString()
  {
    return regNumber+" " + make+" "  + year +" " + model+" "  + owner;
  }

  public boolean equals(Object object)
  {
    if (!(object instanceof Car))
    {
      return false;
    }
    Car other = (Car) object;
    return regNumber.equals(other.regNumber) && make.equals(other.regNumber)
        && make.equals(other.make) && model.equals(other.model) && owner.equals(
        ((Car) object).owner);
  }
}
