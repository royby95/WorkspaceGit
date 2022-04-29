package Exercise2004;

public class CirclesTest
{
  public static void main(String[] args)
  {
    Circle circle1 = new Circle(2.5, 3.5, 4);
    Point point1=circle1.getCenter();
    circle1.moveCircle(150, 0);

    Circle circle2 = new Circle(point1.getX(), point1.getY(), 6);

    CircleList circleList1 = new CircleList(3);

    circleList1.addCircle(circle1);
    circleList1.addCircle(circle2);

    System.out.println(circleList1.getTotalArea());
    System.out.println(circleList1.getAverageArea());
  }
}
