package Exercise2001;

public class Van extends Car
{
  private int MaxLoad;

  public Van(String owner, double price, String regNo, int MaxLoad)
  {
    super(owner,price,regNo);
    this.MaxLoad = MaxLoad;
  }

  public int getMaxLoad()
  {
    return getMaxLoad();
  }

  public String toString()
  {
    return super.toString() + MaxLoad;
  }

  public boolean equals(Object obj)
  {
    if(!(obj instanceof Van))
    {
      return false;
    }

    Van other = (Van) obj;

    return super.equals(obj) && MaxLoad == other.MaxLoad;
  }
}
