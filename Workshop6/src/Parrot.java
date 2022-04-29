import java.util.ArrayList;

public class Parrot extends Animal
{

  private ArrayList<String> favouriteWords;

  public Parrot(int nrOfColors, String sound, String ownerName, String name)
  {
    super(nrOfColors, sound, ownerName, name);
  }
}