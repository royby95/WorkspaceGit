public class Exercise1507
{
  public static void main(String[] args)
  {
    int[] holes = {3, 5, 1, 3, 3, 2, 4, 2, 3};

    int size = holes.length;

    int totalHits = 0;
    int holeInOne = 0;
    double avarage = 0;
    for (int i=0;i<holes.length;i++)
    {
      totalHits += holes[i];
      if (holes[i]==1)
      {
        holeInOne += holes[i];
      }
    }
    avarage = (double)totalHits / holes.length;
    System.out.println(totalHits);
    System.out.println(holeInOne);
    System.out.println(avarage);
  }
}
