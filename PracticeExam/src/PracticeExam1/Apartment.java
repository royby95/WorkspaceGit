package PracticeExam1;

public class Apartment extends Residence
{
  private int numberOfRooms;

  public Apartment(int number, double size,String type,int NumberOfRooms)
  {
    super(number, size,type);
    this.numberOfRooms = NumberOfRooms;

  }


 public int getNumberOfRooms()
  {
    return numberOfRooms;
  }
}
