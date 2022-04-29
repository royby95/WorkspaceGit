package Lesson13;

public class Exercise1301part2
{
  private String make;
  private String model;
  private String color;
  private String licenseNumber;
  private int year;

  public Exercise1301part2(String make, String model, String color, String licenseNumber,
      int year)
  {
    this.make = make;
    this.model = model;
    this.color = color;
    this.licenseNumber = licenseNumber;
    this.year = year;
  }

  public Exercise1301part2(String make, String model, String color,
      int year)
  {
    this.make = make;
    this.model = model;
    this.color = color;
    this.licenseNumber = null;
    this.year = year;
  }

  public String getMake()
  {
    return make;
  }
  public String getModel()
  {
    return model;
  }
  public String getColor()
  {
    return color;
  }
  public String getLicenseNumber()
  {
    return licenseNumber;
  }
  public int getYear()
  {
    return year;
  }

  public void setColor(String color)
  {
    this.color = color;
  }
  public void setLicenseNumber(String licenseNumber)
  {
    this.licenseNumber = licenseNumber;
  }

  public Exercise1301part2 copy()
  {
    return new Exercise1301part2(make, model, color, licenseNumber, year);
  }

  public String toString()
  {
    return " " + make + model + color + licenseNumber + year;
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Exercise1301part2))
    {
      return false;
    }
    Exercise1301part2 other = (Exercise1301part2) obj;

    return make.equals(other.make) && model.equals(other.model) &&color.equals(other.color)&&licenseNumber.equals(other.licenseNumber)&&year==other.year;
  }

}

