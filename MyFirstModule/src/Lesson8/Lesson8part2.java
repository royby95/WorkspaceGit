package Lesson8;

import java.time.Clock;

public class Lesson8part2
{
  public int hour;
  public int minute;
  public int second;


  public Lesson8part2(int h, int m, int s)
  {
    hour=h;
    minute=m;
    second=s;
  }

  public Lesson8part2(int totalTimeInSeconds)
  {
    hour = totalTimeInSeconds / 3600;
    totalTimeInSeconds -= hour * 3600;
    minute = totalTimeInSeconds / 60;
    totalTimeInSeconds -= minute * 60;
    second = totalTimeInSeconds;
  }

  public void set(int h, int m, int s)
  {
    hour=h;
    minute=m;
    second=s;
  }

  public int getHour()
  {
    return hour;
  }

  public int getMinute()
  {
    return minute;
  }

  public int getSecond()
  {
    return second;
  }

  public void tic()
  {
    second += 1;
  }

  public int convertToSeconds()
  {
    return (hour * 3600) + (minute * 60) + second;
  }

  public boolean isBefore(Lesson8part2 time)
  {
    return convertToSeconds() < time.convertToSeconds();
  }

  public int timeInSecondsTo(Lesson8part2 time)
  {
    int numHours=time.getHour()*3600;
    int numMinutes = time.getMinute()*60;
    int numSeconds = time.getSecond();
    return ((numHours-(hour*3600))+(numMinutes-(minute*60))+(numSeconds-second));
  }

  public  Lesson8part2 timeTo (Lesson8part2 time)
  {
    return  new Lesson8part2 (time.getHour() - hour ,time.getMinute() - minute ,time.getSecond() - second) ;
  }

  public String toString()
  {
    return  hour +":" + minute +":" + second;
  }
}
