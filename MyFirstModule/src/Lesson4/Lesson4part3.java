package Lesson4;

public class Lesson4part3
{
  public int day;
  public int month;
  public int year;
  public String date;

  public void setDay(int d)
  {
    day = d;
  }
  public void setMonth(int m)
  {
    month = m;
  }

  public void setYear(int y)
  {
    year = y;
  }

  public int getDay()
  {
    return day;
  }
  public int getMonth()
  {
    return month;
  }
  public int getYear()
  {
    return year;
  }
  public String getdate()
  {
    return day +"/"+ month+ "/" + year ;
  }

  public Lesson4part3(int day, int month, int year)
  {
    this.day = day;
    this.month = month;
    this.year = year;

  }
  public Lesson4part3()
  {
    day = 07;
    month = 05;
    year = 1995;
  }

  public String toString()
  {
    return "date:" + day + "/" + month + "/" + year;
  }
}