package Exercise2001;

public class SportsCar extends Car

{
  private int MaxVelocity;

  public SportsCar(String owner, double price, String regNo, int MaxVelocity)
  {
    super(owner,price,regNo);
    this.MaxVelocity = MaxVelocity;
  }

  public int getMaxVelocity()
  {
    return getMaxVelocity();
  }

  public String toString()
  {
    return super.toString() + MaxVelocity;
  }

  public boolean equals(Object obj)
  {
    if(!(obj instanceof SportsCar))
    {
      return false;
    }

    SportsCar other = (SportsCar) obj;

    return super.equals(obj) && MaxVelocity == other.MaxVelocity;
  }

}
