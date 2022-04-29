public abstract class Toy
{
  private int suitableAge;

  public Toy(int suitableAge)
  {
    this.suitableAge = suitableAge;
  }

  public abstract String play();

  public void setSuitableAge(int suitableAge)
  {
    this.suitableAge = suitableAge;
  }

  public int getSuitableAge()
  {
    return suitableAge;
  }

  public String toString()
  {
    return ""+suitableAge;
  }
}
