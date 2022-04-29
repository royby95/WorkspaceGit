import java.util.Arrays;

public class Exercise1
{
  public static void main(String[] args)
  {
    int[] numbers = {1, 2, 3, 4, 5, 6};
    System.out.println(Arrays.toString(numbers));
    String odd = "";
    String even = "";
    for (int i=0; i<numbers.length;i++)
    {
      if (numbers[i] % 2 != 0)
      {
        odd += " "+numbers[i];
      }
      else {
        even += " "+numbers[i];
      }
    }
    System.out.println("Odd numbers are:"+odd);
    System.out.println("Even numbers are:"+even);
  }
}
