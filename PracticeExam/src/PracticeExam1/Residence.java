package PracticeExam1;

import java.time.LocalDate;
import java.util.Date;

public abstract class Residence
{
  private int number;
  private double size;
  private String type;
  private Tenant rentedTo;

  public Residence(int number, double size, String type)
  {
    this.number = number;
    this.size = size;
    this.type = type;
  }

  public int getNumber()
  {
    return number;
  }

  public double getSize()
  {
    return size;
  }

  public String getType()
  {
    return type;
  }

  public boolean isAvailable()
  {
    if (rentedTo.getRentedFrom().getYear() < LocalDate.now().getYear()
        && rentedTo.getRentedFrom().getMonth() < LocalDate.now().getMonthValue()
        && rentedTo.getRentedFrom().getDay() < LocalDate.now().getDayOfMonth())
    {
      return true;
    }
    return false;
  }

  public void rentTo(Tenant tenant, MyDate rentedFrom)
  {
    this.rentedTo = tenant;
    this.rentedTo.setRentedFrom(rentedFrom);
  }

  public Tenant getTenant()
  {
    return rentedTo;
  }

  public abstract int getNumberOfRooms();
}
