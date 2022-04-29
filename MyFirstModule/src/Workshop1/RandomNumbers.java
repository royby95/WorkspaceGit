package Workshop1;

import java.util.Random;

public class RandomNumbers
{
  public static void main(String[] args)
  {
    Random randomNumbers = new Random();
    int number1 = randomNumbers.nextInt(100) + 1;
    System.out.println(number1);
    int number2 = randomNumbers.nextInt(100) + 1;
    System.out.println(number2);
    int number3 = randomNumbers.nextInt(100) + 1;
    System.out.println(number3);
    int number4 = randomNumbers.nextInt(100) + 1;
    System.out.println(number4);
    int number5 = randomNumbers.nextInt(100) + 1;
    System.out.println(number5);
    int number6 = randomNumbers.nextInt(100) + 1;
    System.out.println(number6);
    int even = 0;
    int odd = 0;
    if (number1 % 2 == 0)
    {
      even += number1;
    }
    else
    {
      odd += number1;
    }
    if (number2 % 2 == 0)
    {
      even += number2;
    }
    else
    {
      odd += number2;
    }
    if (number3 % 2 == 0)
    {
      even += number3;
    }
    else
    {
      odd += number3;
    }
    if (number4 % 2 == 0)
    {
      even += number4;
    }
    else
    {
      odd += number4;
    }
    if (number5 % 2 == 0)
    {
      even += number5;
    }
    else
    {
      odd += number5;
    }
    if (number6 % 2 == 0)
    {
      even += number6;
    }
    else
    {
      odd += number6;
    }

    System.out.println(even);
    System.out.println(odd);
  }

}
