import java.util.ArrayList;
import java.util.Arrays;

public class TestTVSeries
{
  public static void main(String[] args)
  {
    TVSeries tvSeries1 = new TVSeries("Casa de Papel");
    Actor actor1 = new Actor("Rodrigo");
    Actor actor2 = new Actor("Pedro Pablo");
    tvSeries1.hireActor(actor1);
    tvSeries1.hireActor(actor2);
    tvSeries1.awardEmmy("Rodrigo");
    tvSeries1.makeNextEpisode();


    System.out.println(tvSeries1.getActor(1).getName());

    System.out.println(tvSeries1.getNumberOfActors());

    for (int i = 0; i <tvSeries1.getEmmyWinners().size() ; i++)
    {
      System.out.println(tvSeries1.getEmmyWinners().get(i).getName());
    }

    System.out.println(tvSeries1);
  }
}
