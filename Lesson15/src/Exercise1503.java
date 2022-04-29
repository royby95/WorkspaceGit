public class Exercise1503
{
  public static void main(String[] args)
  {
    int[] sourceArray = {1, 2, 3, 4, 5, 6};
    int doubleSize = (sourceArray.length)*2;
    int[] destinationArray = new int[doubleSize];


    for (int i=0;i<sourceArray.length;i++)
    {
      destinationArray[i] = sourceArray[i];
    }
    for (int j=6;j<destinationArray.length;j++)
    {
      destinationArray[j] = 0;
    }
    for (int i=0;i<destinationArray.length;i++)
    {
      System.out.println(destinationArray[i]);
    }
  }
}
