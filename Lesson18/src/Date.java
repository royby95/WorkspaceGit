public class Date
{
  private int day;
  private int month;
  private int year;

  public Date(int day, int month, int year)
  {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public Date()
  {
    day = 0;
    month = 0;
    year = 0;
  }

  public void set(int day, int month, int year)
  {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public Date copy()
  {
    return new Date(day, month, year);
  }

  public boolean equals(Object object)
  {
    if (!(object instanceof Date))
    {
      return false;
    }

    Date other = (Date) object;

    return other.year == ((Date) object).year
        && other.month == ((Date) object).month
        && other.day == ((Date) object).day;
  }

  public  String toString()
  {
    return day + "/" + month + "/" + year;
  }
}