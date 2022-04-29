package Workshop2;

public class ShapeMaker
{
  public void makeADownPyramid()
  {
    for (int i = 1; i <= 6; i++)
    {
      if (i == 1)
      {
        System.out.println("*");
      }
      else if (i == 2)
      {
        System.out.println("**");
      }
      else if (i == 3)
      {
        System.out.println("***");
      }
      else if (i == 4)
      {
        System.out.println("****");
      }
      else if (i == 5)
      {
        System.out.println("*****");
      }
      else
      {
        System.out.println("******\n");
      }

    }

  }

  public void makeAnUpPyramid()
  {
    for (int i = 6; i >= 1; i--)
    {
      if (i == 6)
      {
        System.out.println("******");
      }
      else if (i == 5)
      {
        System.out.println("*****");
      }
      else if (i == 4)
      {
        System.out.println("****");
      }
      else if (i == 3)
      {
        System.out.println("***");
      }
      else if (i == 2)
      {
        System.out.println("**");
      }
      else
      {
        System.out.println("*\n");
      }
    }
  }

  public void twoInnerPyramids()
  {
    makeADownPyramid();
    makeAnUpPyramid();
  }

  public void twoOuterPyramids()
  {
    for (int i = 5; i <= 1; i--)
    {
      makeAnUpPyramid();
      makeADownPyramid();
    }
  }
}
