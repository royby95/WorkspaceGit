public class Apartment
{
  private String address;
  private double rent;
  private Tenant tenant;

  public Apartment(String address, double rent)
  {
    this.address = address;
    this.rent = rent;
    tenant = null;
  }

  public String getAddress()
  {
    return address;
  }

  public void setRent(double rent)
  {
    this.rent = rent;
  }

  public void rentTo(String name, String phone)
  {
    if (tenant == null)
    {
      tenant = new Tenant(name, phone);
    }
  }

  public void evict()
  {
    tenant = null;
  }

  public boolean isOccupied()
  {
    return tenant != null;
  }

  public Tenant getTenant()
  {
    return tenant.copy();
  }

  public double getRentDue()
  {
    if (isOccupied())
    {
      return tenant.getRentDue();
    }
    else {
      return 0;
    }
  }

  public void chargeRent()
  {
    if(isOccupied())
    {
      tenant.setRentDue(rent+getRentDue());
    }
  }

  public void collectRent(double amount)
  {
    if (isOccupied())
    {
      tenant.setRentDue(getRentDue()-amount);
    }
  }

  public String toString()
  {
    if (isOccupied())
    {
      return address + " " + rent +" "+tenant;
    }
    else {
      return "No tenant";
    }
  }

}
