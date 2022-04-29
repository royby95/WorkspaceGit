package Lesson12;

public class TestMyNumber
{
  public static void main(String[] args)
  {
    MyNumber number1 = new MyNumber(13);
    MyNumber number2 = new MyNumber(34);
    MyNumber number3 = new MyNumber(28);
    System.out.printf("%s \n",number1.numberOfProperDivisors());
    System.out.printf("%s\n",number1.isPrime());
    System.out.println(number1);

    System.out.println(number1.plus(number2));
    System.out.println(number3.isPerfectNumber());

    int number = 28;
    int properNumber = 0;
    for (int i=1; i<number;i++)
    {
      if (number % i == 0)
      {
        System.out.println(number/i);
        properNumber += properNumber + i;
      }
      else {
        properNumber = properNumber + 0;
      }
    }
    System.out.println(properNumber);
  }
 }



