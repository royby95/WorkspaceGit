package Lesson11;

public class TestMyDate
{
  public static void main(String[] args)
  {

    MyDate date1= new MyDate(13, 3, 10001);
    MyDate date4 = new MyDate (20 , 19 ,10000);
    MyDate date2 = date1.copy();
    MyDate date3 = new MyDate();

    System.out.println(date1);
    System.out.println(date2);
    System.out.println(date3);

    boolean result=date1.equals(date2);
    System.out.println(result);
    System.out.println(MyDate.today());

    System.out.println(date4.isBefore(date1));
  }
}
