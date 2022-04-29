public class TestToy
{

  public static void main(String[]args)
  {
    Toy[] toys = new Toy[3];

    toys[0] = new Lego(2, 35);
    toys[1] = new Football(3, 4);
    toys[2] = new HandBall(3, 6 );

    for (int i = 0; i < toys.length ; i++)
    {
      System.out.println(toys[i].play());
    }

    toys[1].setSuitableAge(4);
    System.out.println(toys[1]);
  }
}
