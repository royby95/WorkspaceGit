public class Colour
{
  private int red;
  private int green;
  private int blue;

  public Colour(int red, int green, int blue)
  {
    this.red = red;
    this.green = green;
    this.blue = blue;
  }

  public void set(int red, int green, int blue)
  {
    this.red = red;
    this.green = green;
    this.blue = blue;
  }

  public int getRed()
  {
    return red;
  }

  public int getGreen()
  {
    return green;
  }

  public int getBlue()
  {
    return blue;
  }

  public boolean isGray()
  {
    return (red == green && green == blue);
  }

  public void mixWith(Colour colour2)
  {
    this.red = (int)((.5 * red) + (.5*colour2.red));
    this.green = (int)((.5 * green) + (.5*colour2.green));
    this.blue = (int)((.5 * blue) + (.5*colour2.blue));

  }

  public Colour copy()
  {
    return new Colour(red,green,blue);
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Colour))
    {
      return false;
    }
    Colour other = (Colour) obj;
    return red==other.getRed() && blue==other.getBlue() && green== other.getGreen();
  }
}
