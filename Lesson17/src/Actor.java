public class Actor
{
  private String name;
  private int NumberOfEmmys;
  private int numberOfEpisodes;

  public Actor(String name)
  {
    this.name = name;
    NumberOfEmmys = 0;
    numberOfEpisodes = 0;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public int getNumberOfEmmys()
  {
    return NumberOfEmmys;
  }

  public void awardEmmy()
  {
    NumberOfEmmys++;
  }

  public int getNumberOfEpisodes()
  {
    return numberOfEpisodes;
  }

  public void participateInEpisode()
  {
    numberOfEpisodes++;
  }
}
