import java.util.Scanner;

public class Exercise2301
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter x: ");
    int x = scanner.nextInt();
    System.out.println("Enter y: ");
    int y = scanner.nextInt();

    try{
      System.out.println("x / y = " + (x / y));
    }
    catch (ArithmeticException e){
      e.printStackTrace();
      System.out.println("y can not be zero");
    }
    System.out.println("x + y = " + (x + y));
    System.out.println("x - y = " + (x - y));
    System.out.println("x * y = " + (x * y));
  }
}
