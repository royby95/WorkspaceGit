import java.util.ArrayList;

public class TVSeries
{
  private String title;
  private int numberOfEpisodes;
  private ArrayList<Actor> actors;

  public TVSeries(String title)
  {
    this.actors = new ArrayList<>();
    this.title = title;
    numberOfEpisodes = 0;
  }

  public void hireActor(Actor actor)
  {
    actors.add(actor);
  }

  public int getNumberOfActors()
  {
    return actors.size();
  }

  public Actor getActor(int index)
  {
    Actor getActor = new Actor(actors.get(index).getName());

    return getActor;
  }

  public void awardEmmy(String name)
  {
    for (int i = 0; i <actors.size() ; i++)
    {
      if (actors.get(i).getName().equals(name))
      {
        actors.get(i).awardEmmy();
      }
    }
  }

  public void makeNextEpisode()
  {
    numberOfEpisodes++;
    for (int i = 0; i <actors.size() ; i++)
    {
      actors.get(i).participateInEpisode();
    }
  }

  public ArrayList<Actor> getEmmyWinners()
  {
    ArrayList<Actor> actorsEmmy = new ArrayList<>();
    for (int i = 0; i <actors.size() ; i++)
    {
      if (actors.get(i).getNumberOfEmmys()>=1)
      {
        actorsEmmy.add(actors.get(i));
      }
    }
    return actorsEmmy;
  }

  public String toString()
  {
    String TVSeries = "";
    for (int i = 0; i <actors.size() ; i++)
    {
      TVSeries+=title + " " + numberOfEpisodes + " " + actors.get(i).getName()+" \n";
    }
    return TVSeries;
  }
}
