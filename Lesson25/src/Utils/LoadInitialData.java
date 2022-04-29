package Utils;

import Model.Car;
import Model.CarList;
import Model.Owner;

import java.io.FileNotFoundException;
import java.io.IOException;

public class LoadInitialData
{
  public static void main(String[] args)
  {
    CarList carlist = new CarList();
    String[] carsArray = null;
    try
    {
      carsArray = MyFileHandler.readArrayFromTextFile("Lesson25/CarsModels.txt");
      for (int i = 0; i <carsArray.length ; i++)
      {
        String temp = carsArray[i];
        String[] tempArray = temp.split(",");
        String regNumber = tempArray[0];
        String make = tempArray[1];
        String model = tempArray[2];
        int year = Integer.parseInt(tempArray[3]);
        String firstName = tempArray[4];
        String lastName = tempArray[5];
        carlist.addCar(new Car(regNumber,make,model,year,new Owner(firstName,lastName)));

      }
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found, or could not be opened");;
    }

    try
    {
      MyFileHandler.writeToBinaryFile("Lesson25/CarsList.bin",carlist);
    }
    catch (FileNotFoundException e)
    {
      System.out.println("Error opening the file");
    }
    catch (IOException e)
    {
      System.out.println("IO error  writing to file");;
    }
    System.out.println("done");
  }
}
