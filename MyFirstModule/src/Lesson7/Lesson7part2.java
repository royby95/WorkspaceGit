package Lesson7;

public class Lesson7part2
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
    if ((year % 4 == 0) && (year % 100 !=0) || (year % 400 == 0))
    {
      return true;
    }
    else
    {
      return false;
    }
  }


  public int daysInMonth()
  {
    if (leapYear == true)
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
    if ((day>=21 && month==3) || (day<=19 && month==4))
    {
      return "Aries";
    }
    if ((day>=20 && month==4) || (day<=20 && month==5))
    {
      return "Taurus";
    }
    if ((day>=21 && month==5) || (day<=20 && month==6))
    {
      return "Gemini";
    }
    if ((day>=21 && month==6) || (day<=22 && month==7))
    {
      return "Cancer";
    }
    if ((day>=23 && month==7) || (day<=22 && month==8))
    {
      return "leo";
    }
    if ((day>=23 && month==8) || (day<=22 && month==9))
    {
      return "Virgo";
    }
    if ((day>=23 && month==9) || (day<=22 && month==10))
    {
      return "Libra";
    }
    if ((day>=23 && month==10) || (day<=21 && month==11))
    {
      return "Scorpio";
    }
    if ((day>=22 && month==11) || (day<=21 && month==12))
    {
      return "Sagittarius";
    }
    if ((day>=22 && month==12) || (day<=19 && month==1))
    {
      return "Capricorn";
    }
    if ((day>=20 && month==1) || (day<=18 && month==2))
    {
      return "Capricorn";
    }
    if ((day>=20 && month==1) || (day<=18 && month==2))
    {
      return "Capricorn";
    }
    if ((day>=19 && month==2) || (day<=20 && month==3))
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


}
