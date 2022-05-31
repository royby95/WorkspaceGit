package Lesson4;

import java.util.Scanner;

public class Lesson4part8
{
  public int yearModel;
  public String make;
  public int speed;

  public Lesson4part8(int yearModel, String make)
  {
    this.yearModel = yearModel;
    this.make = make;
    speed = 0;
  }

  public int getYearModel()
  {
    return yearModel;
  }

  public String getMake()
  {
    return make;
  }

  public int getSpeed()
  {
    return speed;
  }

  public void setAccelerate(int speed)
  {
    this.speed = speed + 5;
  }

  public void setBrake(int speed)
  {
    this.speed = speed - 5;
  }

  public static void main(String[] args)
  {
    Lesson4part8 car = new Lesson4part8(1992, "Nissan");
    car.setAccelerate(1);
    System.out.println(car.getSpeed());
    car.setAccelerate(2);
    System.out.println(car.getSpeed());
    car.setAccelerate(3);
    System.out.println(car.getSpeed());
    car.setAccelerate(4);
    System.out.println(car.getSpeed());
    car.setAccelerate(5);
    System.out.println(car.getSpeed());
    car.setBrake(1);
    System.out.println(car.getSpeed());
    car.setBrake(2);
    System.out.println(car.getSpeed());
    car.setBrake(3);
    System.out.println(car.getSpeed());
    car.setBrake(4);
    System.out.println(car.getSpeed());
    car.setBrake(5);
    System.out.println(car.getSpeed());
  }
}
