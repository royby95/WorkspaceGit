public class Lego extends Toy
{
  private int numberOfBricks;

  public Lego(int suitableAge, int numberOfBricks)
  {
    super(suitableAge);
    this.numberOfBricks = numberOfBricks;
  }

  public void setNumberOfBricks(int numberOfBricks)
  {
    this.numberOfBricks = numberOfBricks;
  }

  public int getNumberOfBricks()
  {
    return numberOfBricks;
  }

  public String play()
  {
    return "Build";
  }

  public String toString()
  {
    return super.toString() + numberOfBricks;
  }
}
