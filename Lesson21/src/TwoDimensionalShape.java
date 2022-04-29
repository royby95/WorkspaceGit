public abstract  class TwoDimensionalShape
{
  private double x;
  private double y;

  public TwoDimensionalShape(double x, double y)
  {
    this.x = x;
    this.y = y;
  }

  public double getX()
  {
    return x;
  }

  public double getY()
  {
    return y;
  }

  public void moveTo(double x, double y)
  {
    this.x += x;
    this.y += y;
  }

  public abstract double getArea();

  public boolean equals(Object obj)
  {
    if (!(obj instanceof TwoDimensionalShape))
    {
      return false;
    }
    return x == ((TwoDimensionalShape) obj).x
        && y == ((TwoDimensionalShape) obj).y;
  }

  public String toString()
  {

    return  x + " "+y;
  }
}
