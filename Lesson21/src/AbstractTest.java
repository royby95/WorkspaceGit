public class AbstractTest
{
  public static void main(String[] args)
  {
    Circle circle1 = new Circle(2, 3, 4);
    Rectangle rectangle1 = new Rectangle(2, 3, 6, 5);

    TwoDimensionalShape tds1 = circle1;
    TwoDimensionalShape tds2 = rectangle1;

    System.out.println(tds1.getArea());
    System.out.println(tds2.getArea());

  }
}
