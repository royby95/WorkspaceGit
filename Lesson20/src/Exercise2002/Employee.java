package Exercise2002;

public class Employee extends Person
{
  private double hours;
  private double payRate;

  public Employee(String name, String address, double hours, double payRate)
  {
    super(name, address);
    this.hours = hours;
    this.payRate = payRate;
  }

  public double getHours()
  {
    return hours;
  }

  public double getPayRate()
  {
    return payRate;
  }

  public void setPayRate(double payRate)
  {
    this.payRate = payRate;
  }

  public double getSalary()
  {
    return hours * payRate;
  }

  public String toString()
  {
    return super.toString() +" "+ hours +" "+ payRate;
  }

  public boolean equals(Object object)
  {
    if (!(object instanceof Employee))
    {
      return false;
    }

    Employee other = (Employee) object;

    return super.equals(object) && hours == other.hours && payRate == payRate;
  }
}
