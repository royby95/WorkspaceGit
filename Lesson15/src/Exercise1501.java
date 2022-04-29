public class Exercise1501
{
  public static void main(String[] args)
  {
    int[] numbers = new int[6];
    numbers[0] = 1;
    numbers[1] = 2;
    numbers[2] = 3;
    numbers[3] = 4;
    numbers[4] = 5;
    numbers[5] = 6;

    for (int i=0; i<numbers.length;i++)
    {
      numbers[i] = numbers[i] * 2;
    }

    for (int i=0; i<numbers.length;i++)
    {
      System.out.println(numbers[i]);
    }


  }
}
