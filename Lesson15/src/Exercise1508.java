public class Exercise1508
{
  public double[] rainfall;

  public double totalRainfall(double[] rainfall)
  {
    this.rainfall = rainfall;
    int totalRainfall = 0;
    for (int i = 0; i < rainfall.length; i++)
    {
      totalRainfall += rainfall[i];
    }
    return totalRainfall;
  }

  public double averageRainfall()
  {
    return totalRainfall(rainfall) / rainfall.length;
  }

  public int monthMostRain()
  {
    int mostRain = 0;

    for (int i = 0; i < rainfall.length; i++)
    {
      if (rainfall[i] > rainfall[mostRain])
      {
        mostRain = i;
      }

    }
    return mostRain;

  }
}
