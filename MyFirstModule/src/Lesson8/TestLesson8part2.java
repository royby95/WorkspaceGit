package Lesson8;

public class TestLesson8part2
{
  public static void main(String[] args)
  {
    Lesson8part2 time = new Lesson8part2(6, 30, 20);
    Lesson8part2 time2 = new Lesson8part2(7, 55, 20);
    System.out.printf("Total hours : %s%n", time.getHour());
    System.out.printf("Total minutes : %s%n", time.getMinute());
    System.out.printf("Total seconds : %s%n", time.getSecond());

    time.tic();
    System.out.printf("Total with tic: %s%n", time.getSecond());
    System.out.printf("Total seconds : %s%n", time.convertToSeconds());
    time.set(7,50,20);
    System.out.printf("Difference Time in seconds : %s%n", time.timeInSecondsTo(time2));
    System.out.printf("Is before? : %s%n", time.isBefore(time2));
    System.out.printf("Difference Time in clock format : %s%n", time.timeTo(time2));
  }
}

