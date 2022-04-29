import java.util.Scanner;

public class Exercise1504
{
  public static void main(String[] args)
  {
    Scanner user = new Scanner(System.in);
    System.out.println("type five integers");
    int firstInt = user.nextInt();
    int secondInt = user.nextInt();
    int thirdInt = user.nextInt();
    int fourthInt = user.nextInt();
    int fifthInt = user.nextInt();

    int[] numbers = {fifthInt, secondInt, thirdInt, fourthInt, fifthInt};
    int total = 0;
    double avarage;
    for (int i=0;i<numbers.length;i++)
    {
      total += numbers[i];
    }
     avarage = total / numbers.length;
    System.out.println(avarage);
  }
}
