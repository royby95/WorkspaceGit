public class Exercise1502
{
  public static void main(String[] args)
  {
    int[] sourceArray = {1, 2, 3, 4, 5};
    int[] destinationArray = new int[5];

    for (int i=0;i<sourceArray.length;i++)
    {
      destinationArray[i] = sourceArray[i];
    }

    for (int i=0;i<sourceArray.length;i++)
    {
      System.out.println(destinationArray[i]);
    }
  }
}
