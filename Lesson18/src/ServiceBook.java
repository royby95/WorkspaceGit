import java.util.ArrayList;

public class ServiceBook
{
  private ArrayList<Service> services;

  public ServiceBook()
  {
    services = new ArrayList<>();
  }

  public void addService(Service service)
  {
    services.add(service);
  }

  public int getNumberOfServices()
  {
    return services.size();
  }

  public Service getService(int index)
  {
    return services.get(index);
  }

  public Service[] getAllServices()
  {
    Service[] tempArray = new Service[services.size()];
    Service[] newArray = services.toArray(tempArray);

    return newArray;
  }

  public int[] getAllServicesMileages()
  {
    int[] mileage = new int[services.size()];
    for (int i = 0; i < mileage.length; i++)
    {
      mileage[i] = services.get(i).getMileage();
    }
    return mileage;
  }

  public boolean hasServiceOnDate(Date date)
  {
    for (int i = 0; i < services.size(); i++)
    {
      if (services.get(i).getDate().equals(date))
      {
        return true;
      }
    }
    return false;
  }

  public Date getDateOfLastService()
  {
    return services.get(services.size() - 1).getDate();
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof ServiceBook))
    {
      return false;
    }

    ServiceBook other = (ServiceBook) obj;

    return services.equals(other.services);
  }

  public String toString()
  {
    String ServiceBook = "";

    for (int i = 0; i < services.size(); i++)
    {
      ServiceBook += services.get(i)+"\n";
    }

    return ServiceBook;
  }

}

