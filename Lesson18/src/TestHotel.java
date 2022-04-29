import java.util.Arrays;

public class TestHotel
{
  public static void main(String[] args)
  {
    Guest guest1 = new Guest("Pedro");
    Guest guest2 = new Guest("Pablo");
    Room room1 = new Room(2, "Single");
    Room room2 = new Room(3, "Single");
    Room room3 = new Room(4, "Double");
    room1.registerGuest(guest1);
    System.out.println(room1.isOccupied());
    System.out.println(room1.getGuest());
    Hotel Hotel1 = new Hotel("Overlook", new Room[] {room1, room2,room3});
    System.out.println(Hotel1.getNumberOfRooms());
    System.out.println(Hotel1.getFirstAvailableRoom());
  }
}
