public class TestMyDateException
{
  public static void main(String[] args)
  {
    MyDate date = new MyDate(32, 12, 1995);
    try
    {
      date.setMonth(13);
    }
    catch (IllegalGradeException e)
    {
      e.printStackTrace();
    }
  }


}
