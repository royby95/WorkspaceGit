public class  Circle extends TwoDimensionalShape
{
  private double radius;

  public Circle(double x, double y, double radius)
  {
    super(x, y);
    this.radius = radius;
  }

  public double getRadius()
  {
    return radius;
  }

  public void setRadius(double radius)
  {
    this.radius = radius;
  }

  public double getArea()
  {
    return radius * radius * Math.PI;
  }

  public boolean equals(Object obj)
  {

    if (!(obj instanceof Circle))
    {
      return false;
    }
    return super.equals(obj) && radius == ((Circle) obj).radius;
  }

  public String toString()
  {
    return super.toString() + radius;
  }
}
