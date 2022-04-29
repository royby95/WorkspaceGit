import java.util.Objects;

public class Dog extends Animal
{

  private int nrOfCommands;
  public Dog(int nrOfColors, String sound, String ownerName, String name, int nrOfCommands)
  {
    super(nrOfColors, sound, ownerName, name);
    this.nrOfCommands = nrOfCommands;
  }

  public void setNrOfCommands(int nrOfCommands)
  {
    this.nrOfCommands = nrOfCommands;
  }

  public int getNrOfCommands()
  {
    return nrOfCommands;
  }

   public boolean equals(Object object)
  {
    if (!(object instanceof Dog))
    {
      return false;
    }

    Dog other = (Dog) object;

    return super.equals(object) && nrOfCommands == other.getNrOfCommands();
  }

  public String toString()
  {
    return super.toString() + getNrOfCommands();
  }


}
