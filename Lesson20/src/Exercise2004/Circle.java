package Exercise2004;

public class Circle
{
  private double radius;
  private Point center;

  public Circle(double x, double y, double radius)
  {
    this.radius = radius;
    center = new Point(x, y);
  }

  public Point getCenter()
  {
    return center.copy();
  }

  public double getRadius()
  {
    return radius;
  }

  public void moveCircle(double dx, double dy)
  {
    center.move(dx,dy);
  }

  public double getArea()
  {
    return Math.PI * Math.pow(getRadius(), 2);
  }

  public String toString()
  {
    return radius + " " + center +" "+getArea();
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Circle))
    {
      return false;
    }

    Circle other = (Circle) obj;

    return radius == other.radius && center.equals(other.center);
  }
}

