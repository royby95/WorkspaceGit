import java.util.ArrayList;

public class ColourPalette
{
  private int numberOfColours;
  private ArrayList<Colour> colours;

  public ColourPalette(int maxNumberOfColours)
  {
    colours = new ArrayList<>(maxNumberOfColours);
  }

  public int getNumberOfColours()
  {
    return numberOfColours;
  }

  public void add(Colour colour)
  {
    if(numberOfColours<colours.size())
    {
      colours.add(colour);
      numberOfColours += 1;
    }
  }

  public Colour get(int index)
  {
    return colours.get(index).copy();
  }

  public int getNumberOfGrayColours()
  {
    int counter = 0;
    for (int i = 0; i <colours.size() ; i++)
    {
      if (colours.get(i).isGray())
      {
        counter++;
      }
    }
    return counter;
  }

  public void mixColour(int index, Colour colour2)
  {
    for (int i = 0; i < colours.size(); i++)
    {
      colours.get(i).mixWith(colour2);
    }
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof ColourPalette))
    {
      return false;
    }
      ColourPalette other = (ColourPalette) obj;

      return colours.equals(other.colours);
  }

  public String toString()
  {
    String coloursPallet = "";

    for (int i = 0; i <colours.size() ; i++)
    {
      coloursPallet += colours.get(i);
    }
    return coloursPallet;
  }

}

