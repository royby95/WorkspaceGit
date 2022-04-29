package Lesson3;

public class Lesson3part5
{
  public String name;
  public double payRate;
  public double workedHours;
  public double grossPay;

  public void setName(String n)
  {
    name = n;
  }

  public void setPayrate (double pay)
  {
    payRate = pay;
  }

  public void setWorkedHours(double hours)
  {
    workedHours = hours;
  }

  public double getPayRate()
  {
    return payRate;
  }
  public  double getWorkedHours()
  {
    return workedHours;
  }
  public  double getGrossPay()
  {
    return payRate * workedHours;
  }
}
