package Workshop1;

import java.util.Objects;

public class Game
{
  private String name;
  private String gameGenre;
  private int numberOfPlayers;

  public Game(String name, int numberOfPlayers)
  {
    this.name = name;
    this.numberOfPlayers = numberOfPlayers;
  }

  public String getName()
  {
    return name;
  }

  public String getGameGenre()
  {
    return gameGenre;
  }

  public int getNumberOfPlayers()
  {
    return numberOfPlayers;
  }

  public boolean equals(Game game2)
  {
    return game2.equals(getName());
  }

 public String toString()
  {
    return  "name='" + name + '\'' + ", gameGenre='" + gameGenre + '\''
        + ", numberOfPlayers=" + numberOfPlayers + '}';
  }
}
