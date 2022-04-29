package Lesson5;

import Lesson4.Lesson4part1;

public class Lesson5part1
{
  public String title;
  public double salary;
  public Lesson4part1 employee;

  public Lesson5part1(String title, double salary, Lesson4part1 employee)
  {
    this.title = title;
    this.salary = salary;
    this.employee = employee;
  }

  public Lesson5part1(String title, double salary)
  {
    this.title = title;
    this.salary = salary;
    employee = null;
  }

  public void setTitle(String title)
  {
    this.title = title;
  }

  public void setSalary(double salary)
  {
    this.salary = salary;
  }

  public void setEmployee(Lesson4part1 employee)
  {
    this.employee = new Lesson4part1(employee.getName(),employee.getBirthday());
  }

  public String getTitle()
  {
    return title;
  }

  public double getSalary()
  {
    return salary;
  }

  public Lesson4part1 getEmployee()
  {
    return employee;
  }

  public void givePercentageRaise(double percentage)
  {
    salary+=salary * percentage;
  }
  public String toString()
  {
    return title + salary + employee;
  }

}
