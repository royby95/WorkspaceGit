public class TestServiceBook
{
  public static void main(String[] args)
  {
    ServiceBook serviceBook1 = new ServiceBook();
    ServiceBook serviceBook2 = new ServiceBook();
    Date date1 = new Date(2, 3, 1995);
    Date date2 = new Date(1, 3, 1995);
    Service service1 = new Service(50, date1);
    Service service2 = new Service(33, date1);
    serviceBook1.addService(service1);
    serviceBook1.addService(service2);
    System.out.println(serviceBook1.equals(serviceBook2));
    System.out.println(serviceBook1);
    System.out.println(serviceBook1.hasServiceOnDate(date2));
    System.out.println(serviceBook1.getDateOfLastService());

  }
}
