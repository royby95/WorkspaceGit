package Lesson3;

public class Lesson3part3
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
}

