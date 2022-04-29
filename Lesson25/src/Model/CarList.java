package Model;

import java.io.Serializable;
import java.util.ArrayList;

public class CarList implements Serializable
{
  private ArrayList<Car> cars;

  public CarList()
  {
    cars = new ArrayList<>();
  }

  public int size()
  {
    return cars.size();
  }

  public int indexOfRegNumber(String regNumber)
  {
    for (int i = 0; i < cars.size(); i++)
    {
      if (cars.get(i).getRegNumber().equals(regNumber))
      {
        return i;
      }
    }
    return -1;
  }

  public Car getCar(int index)
  {
    return cars.get(index);
  }

  public Car getCar(String regNumber)
  {
    for (int i = 0; i < cars.size(); i++)
    {
      if (cars.get(i).getRegNumber().equals(regNumber))
      {
        return cars.get(i);
      }
    }
    return null;
  }

  public void addCar(Car car)
  {
    for (int i = 0; i < cars.size(); i++)
    {
      if (!cars.get(i).getRegNumber().equals(car.getRegNumber()))
      {
        cars.add(car);
      }
    }
  }

  public String toString()
  {
    String carList = "";
    for (int i = 0; i <cars.size() ; i++)
    {
      carList +=
          cars.get(i).getRegNumber() + cars.get(i).getMake() + cars.get(i)
              .getModel() + cars.get(i).getOwner().getFirstName() + cars.get(i).getYear();
    }
    return carList;
  }



}
