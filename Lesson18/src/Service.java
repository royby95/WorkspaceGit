public class Service
{
  private int mileage;
  private Date date;

  public Service(int mileage, Date date)
  {
    this.mileage = mileage;
    this.date = date;
  }

  public int getMileage()
  {
    return mileage;
  }

  public Date getDate()
  {
    return date.copy();
  }

  public boolean equals(Object object)
  {
    if (!(object instanceof Service))
    {
      return false;
    }
    Service other = (Service) object;

    return mileage == (other.mileage) && date.equals(other.date);
  }

  public String toString()
  {
    return  " "+mileage + " "+ date;
  }
}
