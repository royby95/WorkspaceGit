
package Lesson6;

public class Lesson6part5
{
  public int day;
  public int month;
  public int year;
  public boolean leapYear;
  public String date;

  public int getDay()
  {
    return day;
  }

  public void setDay(int d)
  {
    day = d;
  }

  public int getMonth()
  {
    return month;
  }

  public void setMonth(int m)
  {
    month = m;
  }

  public int getYear()
  {
    return year;
  }

  public void setYear(int y)
  {
    year = y;
  }

  public String getDate()
  {
    return day + "/" + month + "/" + year;
  }

  public boolean isLeapYear()
  {
    if (year % 4 == 0)
    {
      return true;
    }
    else if (year % 100 == 0)
    {
      return false;
    }
    else if (year % 400 ==0)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
}


