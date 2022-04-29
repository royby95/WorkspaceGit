package Lesson7;

public class HotelRoomTest
{
  public static void main(String[]args)
  {
    HotelRoom room1 = new HotelRoom(12,345);
    HotelRoom room2 = new HotelRoom(17,390);
    HotelRoom room3 = new HotelRoom(23,550);

    room1.setRent(455);

    Guest guest1 = new Guest("Pablo");
    Guest guest2 = new Guest("Rodrigo");

    room1.checkIn(guest1);
    room2.checkIn(guest2);

    System.out.println(guest2.getName());
    System.out.println(room2);
  }
}
