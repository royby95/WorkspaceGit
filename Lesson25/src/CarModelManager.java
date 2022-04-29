import Utils.MyFileHandler;
import Model.CarList;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CarModelManager
{
  private String fileName;

  public CarModelManager(String fileName)
  {
    this.fileName = fileName;
  }

  public CarList getAllCars()
  {
    CarList allCars = new CarList();

    try
    {
      allCars = (CarList) MyFileHandler.readFromBinaryFile(fileName);
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found");
    }
    catch (IOException e)
    {
      System.out.println("IO Error reading file");
    }
    catch (ClassNotFoundException e)
    {
      System.out.println("Class Not Found");
    }
    return allCars;
  }
}

