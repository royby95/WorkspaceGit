package Lesson12;

import Lesson11.MyDate;

public class MyNumber
{
  private int number;

  public MyNumber(int number)
  {
    this.number = number;
  }
  public MyNumber()
  {
  }
  public int getNumber()
  {
    return number;
  }

  public int getLastDigit()
  {
    return number % 10;
  }

  public int getFirstDigit()
  {
    do
    {
      number=number / 10;
    }
    while (number>9);
    return number;
  }

  public boolean isDivisibleBy(int anotherInt)
  {
    return number % anotherInt == 0;
  }

  public int numberOfProperDivisors()
  {
    int properDivisors = 0;
    for (int i=1;i<number;i++)
    {
      if (number % i == 0)
      {
        properDivisors += 1;
      }
    }
    return properDivisors;
  }

  public boolean isPrime()
  {
    int n = 0;
    for (int i = 1; i <= 1000; i++)

    {
      if ((number % i) != 0)
      {
      }
      else
      {
        n = n + 1;
      }
    }
    return n == 2;
  }

  public String toString()
  {
    if(isPrime())
    {
      return number + "\tis prime";
    }
    return ""+number;
  }

  public MyNumber plus(MyNumber anotherNumber)
  {
    if (anotherNumber==null)
    {
      return new MyNumber(0);
    }
    else{
      return new MyNumber(anotherNumber.number + number);
    }
  }

  public boolean isPerfectNumber()
  {
    int properNumber = 0;
    for (int i=1; i<number;i++)
    {
      if (number % i == 0)
      {
        properNumber += properNumber + i;
      }
    }
    return number == properNumber;
  }


}
