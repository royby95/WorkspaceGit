public class Rectangle extends TwoDimensionalShape
{
  private double width;
  private double length;

  public Rectangle(double x, double y, double width, double length)
  {
    super(x, y);
    this.width = width;
    this.length = length;
  }

  public double getWidth()
  {
    return width;
  }

  public void setWidth(double width)
  {
    this.width = width;

  }

  public double getLength()
  {
    return length;
  }

  public void setLength(double length)
  {
    this.length = length;
  }

  public double getArea()
  {
    return width * length;
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Object))
    {
      return false;
    }
    return super.equals(obj) && width == ((Rectangle) obj).width
        && length == (((Rectangle) obj).length);
  }
}
