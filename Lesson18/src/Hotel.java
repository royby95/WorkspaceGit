import java.util.ArrayList;
import java.util.Arrays;

public class Hotel
{
  private String name;
  private Room[] rooms;

  public Hotel(String name, Room[] rooms)
  {
    this.name = name;
    this.rooms = rooms;
  }

  public String getName()
  {
    return name;
  }

  public int getNumberOfRooms()
  {
    return rooms.length;
  }

  public int getNumberOfAvailableRooms()
  {
    int counter = 0;

    for (int i = 0; i <rooms.length ; i++)
    {
      if (rooms[i].isOccupied())
      {
        counter += counter + 1;
      }
    }
    return counter;
  }

  public Room getFirstAvailableRoom()
  {
    for (int i = 0; i <rooms.length ; i++)
    {
      if ((!rooms[i].isOccupied()))
      {
        break;
      }
      return rooms[i];
    }
    return null;
  }

  public Room getFirstAvailableRoom(double maxPrice)
  {
    for (int i = 0; i <rooms.length ; i++)
    {
      if (maxPrice<rooms[i].getPrice())
      {
        break;
      }
      return rooms[i];
    }
    return null;
  }

  public Room[] getAllAvailableRooms(String bedType)
  {
    Room[] availableRooms = new Room[getNumberOfAvailableRooms()];
    for (int i = 0; i <rooms.length ; i++)
    {
      if (!rooms[i].isOccupied())
      {
        availableRooms[i] = rooms[i];
      }
    }
    return availableRooms;
  }

  public boolean hasGuest(Guest guest)
  {
    for (int i = 0; i <rooms.length ; i++)
    {
      if (guest.equals(rooms[i].getGuest()))
      {
        break;
      }
      return true;
    }
    return false;
  }

  public Room getRoom(Guest guest)
  {
    for (int i = 0; i <rooms.length ; i++)
    {
      if (guest.equals(rooms[i].getGuest()))
      {
        return rooms[i];
      }
    }
    return null;
  }

  public String toString()
  {
    String hotel = name;
    for (int i = 0; i <rooms.length ; i++)
    {
      hotel += rooms[i];
    }
    return hotel;
  }

}

