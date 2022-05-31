package PracticeExam1;

public class Tenant
{
  String name;
  MyDate rentedFrom;

  public Tenant(String name)
  {
    this.name = name;
  }

  public String getName()
  {
    return name;
  }

  public MyDate getRentedFrom()
  {
    return rentedFrom.copy();
  }

  public void setRentedFrom(MyDate date)
  {
    rentedFrom = date;
  }
}
