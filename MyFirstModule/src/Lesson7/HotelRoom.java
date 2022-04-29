package Lesson7;

public class HotelRoom
{
  public int roomNumber;
  public double rent;
  public Guest guest;

public HotelRoom(int roomNumber, double rent)
{
this.roomNumber = roomNumber;
this.rent = rent;
this.guest = null;
 }

  public double getRent()
  {
    return rent;
  }

  public void setRent(double rent)
  {
    this.rent = rent;
  }

  public double getRoomNumber()
  {
    return roomNumber;
  }

  public Guest getGuest()
  {
    return guest;
  }

  public boolean isAvailable()
  {
    if (guest == null)
    {
      return false;
    }
    return true;
  }

  public void checkIn(Guest guest)
  {
    if (this.guest != null)
    {

    }
    else
    {
      this.guest = guest;
    }
  }

  public void checkOut()
  {
    guest = null;
  }

  public String toString()
  {
    if (guest != null)
    {
      return "roomNumber=" + roomNumber + ", rent=" + rent + ", guest=" + guest.getName();
    }
    else
    {
      return "roomNumber" + roomNumber + "rent" + rent;
    }

  }
}



