package Lesson14;

import java.time.LocalDate;

public class MyDate
{
  public int day;
  public int month;
  public int year;
  public boolean leapYear;
  public String date;

  public MyDate(int day, int month, int year)
  {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public MyDate()
  {
    LocalDate currentDate = LocalDate.now();
    day = currentDate.getDayOfMonth();
    month = currentDate.getMonthValue();
    year = currentDate.getYear();
  }

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
    return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
  }

  public int daysInMonth()
  {
    if (leapYear)
    {
      if (month == 1)
      {
        return 31;
      }
      if (month == 2)
      {
        return 29;
      }
      if (month == 3)
      {
        return 31;
      }
      if (month == 4)
      {
        return 30;
      }
      if (month == 5)
      {
        return 31;
      }
      if (month == 6)
      {
        return 30;
      }
      if (month == 7)
      {
        return 31;
      }
      if (month == 8)
      {
        return 30;
      }
      if (month == 9)
      {
        return 31;
      }
      if (month == 10)
      {
        return 30;
      }
      if (month == 11)
      {
        return 31;
      }
      if (month == 12)
      {
        return 30;
      }
      else if (leapYear == false)
      {
        if (month == 02)
        {
          return 28;
        }
      }
    }
    return 0;
  }

  public String getAstroSign()
  {
    if ((day >= 21 && month == 3) || (day <= 19 && month == 4))
    {
      return "Aries";
    }
    if ((day >= 20 && month == 4) || (day <= 20 && month == 5))
    {
      return "Taurus";
    }
    if ((day >= 21 && month == 5) || (day <= 20 && month == 6))
    {
      return "Gemini";
    }
    if ((day >= 21 && month == 6) || (day <= 22 && month == 7))
    {
      return "Cancer";
    }
    if ((day >= 23 && month == 7) || (day <= 22 && month == 8))
    {
      return "leo";
    }
    if ((day >= 23 && month == 8) || (day <= 22 && month == 9))
    {
      return "Virgo";
    }
    if ((day >= 23 && month == 9) || (day <= 22 && month == 10))
    {
      return "Libra";
    }
    if ((day >= 23 && month == 10) || (day <= 21 && month == 11))
    {
      return "Scorpio";
    }
    if ((day >= 22 && month == 11) || (day <= 21 && month == 12))
    {
      return "Sagittarius";
    }
    if ((day >= 22 && month == 12) || (day <= 19 && month == 1))
    {
      return "Capricorn";
    }
    if ((day >= 20 && month == 1) || (day <= 18 && month == 2))
    {
      return "Capricorn";
    }
    if ((day >= 20 && month == 1) || (day <= 18 && month == 2))
    {
      return "Capricorn";
    }
    if ((day >= 19 && month == 2) || (day <= 20 && month == 3))
    {
      return "Pisces";
    }
    return null;
  }

  public String getMonthName()
  {
    switch (month)
    {
      case 1:
        System.out.println("January");
        break;
      case 2:
        System.out.println("February");
        break;
      case 3:
        System.out.println("March");
        break;
      case 4:
        System.out.println("April");
        break;
      case 5:
        System.out.println("May");
        break;
      case 6:
        System.out.println("June");
        break;
      case 7:
        System.out.println("July");
        break;
      case 8:
        System.out.println("August");
        break;
      case 9:
        System.out.println("September");
        break;
      case 10:
        System.out.println("Octuber");
        break;
      case 11:
        System.out.println("November");
        break;
      case 12:
        System.out.println("December");
        break;
      default:
        System.out.println("error");
    }
    return null;
  }

  public void nextDay()
  {
    day = day + 1;
  }

  public String toString()
  {
    return " " + day + " " + month + " " + year;
  }

  public boolean equals(MyDate obj)
  {
    return day == obj.day && month == obj.month && year == obj.year;
  }

  public MyDate copy()
  {
    return new MyDate(day, month, year);
  }

  public MyDate(MyDate obj2)
  {
    day = obj2.day;
    month = obj2.month;
    year = obj2.year;
  }

  public int nextDays(int days)
  {
    return daysInMonth() + days;
  }

  public static MyDate today()
  {
    LocalDate currentDate = LocalDate.now();
    int currentDay = currentDate.getDayOfMonth();
    int currentMonth = currentDate.getMonthValue();
    int currentYear = currentDate.getYear();
    return new MyDate(currentDay, currentMonth, currentYear);
  }

  public boolean isBefore(Lesson12.Lesson11.MyDate date2)
  {
    if (year< date2.year)
    {
      return true;
    }
    else if (month < date2.month)
    {
      return true;

    }
    else if (day< date2.day)
    {
      return true;
    }
    else {
      return false;
    }
  }
}
