package Lesson13;

import Lesson12.Car;

public class Garage
{
  private Car car1;
  private Car car2;

  public Garage()
  {
    this.car1 = null;
    this.car2 = null;
  }

  public boolean isParkingAreaTaken(int position)
  {
    if (position == 1)
    {
      if (car1 == null)
      {
        return false;
      }
      else
        return true;
    }
    else if (position==2)
    {
      if (car2 == null)
      {
        return false;
      }
    }
    else {
      return true;
    }
    return false;
  }

  public void park(Car car, int position)
  {
      if (position == 1 && car1 == null)
      {
        this.car1 = car;
      }
      else if (position == 2 && car2==null)
      {
        this.car2 = car;
      }
  }

  public Car leaveGarage(int position)
  {
    if (car1 == null && position==1)
    {
      return null;
    }
    else if (car2 == null && position==2)
    {
      return null;
    }
    else if (car1!=null && position == 1)
    {
      return car1;
    }
    else if (car2!=null&&position == 2)
    {
      return car2;
    }
    return null;
  }

  public String toString()
  {
    return " " + car1 + " " + car2;
  }
  public boolean equals(Object obj)
  {
    if (!(obj instanceof Garage))
    {
      return false;
    }
    Garage other = (Garage) obj;
    return car1 == other.car1 && car2 == other.car2;
  }


}


