package Workshop1;

public class PlayTest
{
  public static void main(String[] args)
  {

    Game game1 = new Game("Dota2", 10);
    Game game2 = new Game("Fifa22", 2);
    PlayStation playStation1 = new PlayStation(game1, "Playstation");
    Player player1;
    player1 = new Player(playStation1, "Rodrigo95");
    String nameGame1=game1.getName();
    System.out.println(game1.getName());
    String nameGame2=game1.getName();
    System.out.println(game2.getName());

    System.out.println(nameGame1.equals(nameGame2));

    player1.changeGame(game2);
    System.out.println(player1);
    }

  }

