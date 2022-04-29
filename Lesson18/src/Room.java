public class Room
{
  private int number;
  private Bed bed;
  private Guest guest;

  public Room(int number, String bedType)
  {
    this.number = number;
    this.bed = new Bed(bedType);
    guest =null;
  }

  public int getNumber()
  {
    return number;
  }

  public int getFloor()
  {
    String number = Integer.toString(getNumber());
    char floor=number.charAt(0);
    switch (floor)
    {
      case 1:
        return 1;
      case 2:
        return 2;
      case 3:
        return 3;
      case 4:
        return 4;
      case 5:
        return 5;
      case 6:
        return 6;
      case 7:
        return 7;
      case 8:
        return 8;
      case 9:
        return 9;
    }
    return 0;
  }

  public double getPrice()
  {
    if(bed.isSingle())
    {
      return 59.50;
    }
    else if (bed.isDouble())
    {
      return 72.40;
    }
    else
    {
      return 89.00;
    }
  }

  public boolean isOccupied()
  {
    return guest != null;
  }

  public void registerGuest(Guest guest)
  {
    this.guest = guest;
  }

  public void vacate()
  {
    guest = null;
  }

  public String getBedType()
  {
    if (bed.isSingle())
    {
      return "Single";
    }
    if(bed.isDouble())
    {
      return "double";
    }
    if(bed.isKingSize())
    {
      return "KingSize";
    }
    else {
      return "";
    }
  }

  public Guest getGuest()
  {
    return guest;
  }

  public String toString()
  {
    return " "+guest +" "+ number +" "+ bed;
  }
}
