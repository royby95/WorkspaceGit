import java.util.Scanner;

public class Exercise1505
{
  public static void main(String[] args)
  {
    Scanner user = new Scanner(System.in);
    System.out.println("print  4 numbers first array");
    int num1 = user.nextInt();
    int num2 = user.nextInt();
    int num3 = user.nextInt();
    int num4 = user.nextInt();
    int[] array1 = new int[4];
    array1[0] = num1;
    array1[1] = num2;
    array1[2] = num3;
    array1[3] = num4;
    System.out.println("print  4 numbers second array");
    int num5 = user.nextInt();
    int num6 = user.nextInt();
    int num7 = user.nextInt();
    int num8 = user.nextInt();

    int[] array2 = new int[4];
    array2[0] = num5;
    array2[1] = num6;
    array2[2] = num7;
    array2[3] = num8;

    boolean arraysEqual = true;
    for (int i = 0; i < 4; i++)
    {
      if (array1[i] != array2[i])
      {
        arraysEqual = false;
        break;
      }
    }
    if (arraysEqual)
      System.out.println("are equal");
    else
    {
      System.out.println("are not equal");
    }
  }
}
