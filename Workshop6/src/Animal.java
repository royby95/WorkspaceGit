import java.sql.Array;
import java.util.ArrayList;

public class Animal
{
  private int nrOfColors;
  private String sound;
  private String ownerName;
  private String name;
  private ArrayList<String> colors;

  public Animal(int nrOfColors, String sound, String ownerName, String name)
  {
    this.nrOfColors = nrOfColors;
    this.sound = sound;
    this.ownerName = ownerName;
    this.name = name;
    colors = new ArrayList<>();
  }

  public void setSound(String sound)
  {
    this.sound = sound;
  }

  public void setOwnerName(String name)
  {
    this.name = name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public void addColor(String color)
  {
    colors.add(color);
  }

  public String getSound()
  {
    return sound;
  }

  public String getOwnerName()
  {
    return ownerName;
  }

  public String getName()
  {
    return name;
  }

  public ArrayList<String> getColors()
  {
    return colors;
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Animal))
    {
      return false;
    }
    Animal other = (Animal) obj;

    return nrOfColors == other.nrOfColors && sound.equals(other.sound)
        && ownerName.equals(other.ownerName) && name.equals(other.name)
        && colors.equals(other.colors);
  }
}
