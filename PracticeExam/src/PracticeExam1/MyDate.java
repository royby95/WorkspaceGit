package PracticeExam1;

import java.time.LocalDate;
import java.util.Date;

public class MyDate
{
  int day;
  int month;
  int year;

  public MyDate(int day, int month, int year)
  {
    this.day = day;
    this.month = month;
    this.year = year;
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

  public void set(int day, int month, int year)
  {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public MyDate copy()
  {
    return new MyDate(day,month,year);
  }

  public MyDate now()
  {
    return new MyDate(LocalDate.now().getDayOfYear(),
        LocalDate.now().getMonthValue(), LocalDate.now().getYear() );
  }
}
