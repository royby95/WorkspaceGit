package Lesson13;

import Lesson12.Car;

public class TestGarage
{
  public static void main(String[] args)
  {
    Garage garage1 = new Garage();
    Garage garage2 = new Garage();
    Garage garage3 = new Garage();
    garage1.park(new Car("Ford","Spark","red","OP23I",1992),1);
    garage1.park(new Car("Nissan","March","blue","POER45",1992),2);


    System.out.println(garage1);
    System.out.println(garage2);
    System.out.println(garage1.leaveGarage(1));
    System.out.println(garage1.leaveGarage(2));

    System.out.println(garage2.equals(garage3));
  }



}
