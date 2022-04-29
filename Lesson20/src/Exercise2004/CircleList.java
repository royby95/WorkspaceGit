package Exercise2004;

import java.util.ArrayList;

public class CircleList
{
  private int capacity;
  private ArrayList<Circle> circles;

  public CircleList(int capacity)
  {
    this.capacity = capacity;
    circles = new ArrayList<>();
  }

  public int getNumberOfCircles()
  {
    return circles.size();
  }

  public void addCircle(Circle circle)
  {
    circles.add(circle);
  }

  public Circle getCircle(int index)
  {
    return circles.get(index);
  }

  public double getTotalArea()
  {
    double totalArea = 0;
    for (int i = 0; i < circles.size(); i++)
    {
      totalArea += circles.get(i).getArea();
    }
    return totalArea;
  }

  public double getAverageArea()
  {
    return getTotalArea() / circles.size();
  }
}
