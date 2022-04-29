package Lesson4;

public class Lesson4part5
{
  public String name;
  public double payRate;
  public double workedHours;
  public double grossPay;

  public void setName(String n)
  {
    name = n;
  }

  public void setPayRate(double pay)
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

  public Lesson4part5(String name, double payRate, double workedHours)
  {
    this.name = name;
    this.payRate = payRate;
    this.workedHours = workedHours;
    this.grossPay = payRate * workedHours;

  }
  public Lesson4part5()
  {
    name = "Rodrigo";
    payRate = 25.5;
    workedHours = 34;
    grossPay = payRate * workedHours;
  }

  public String toString()
  {
    return "Name is: "+ name + " and his Gross Pay is: " + grossPay;
  }
}