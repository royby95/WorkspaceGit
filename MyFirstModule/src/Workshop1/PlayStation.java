package Workshop1;

import java.util.Date;

public class PlayStation
{
  private String model;
  private Game game;


  public PlayStation(Game game, String model)
  {
    this.game = game;
    this.model = model;
  }
  public Game getGame()
  {
    return game;
  }

  public String getModel()
  {
    return getModel();
  }

  public void setGame(Game game)
  {
    this.game = game;

  }

  public String toString()
  {
    return "PlayStation{" + "model='" + model + '\'' + ", game=" + game + '}';
  }

}
