package Workshop1;

public class Player
{
  public String username;
  public PlayStation playStation;

  public Player(PlayStation playStation, String username)
  {
    this.playStation = playStation;
    this.username = username;
  }

  public String getUsername()
  {
    return username;
  }

  public PlayStation getPlayStation()
  {
    return playStation;
  }

  public Game getName()
  {
    return getName();
  }

  public void changeGame(Game game2)
  {
    playStation.setGame(game2);
  }

  public String toString()
  {
    return username + playStation;
  }

}
