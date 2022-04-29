package Lesson2;

import java.util.Scanner;

public class Lesson2part7
{
  public static void main(String[] args)
  {
    //Using Scanner for the input
    Scanner user = new Scanner(System.in);
    System.out.println("Type shares purchased:\n");
    double sharesPurchased = user.nextDouble();
    System.out.println("Type price of the shares purchased:\n");
    double pricesSharesPurchased = user.nextDouble();
    System.out.println("The amount payed is:\n"+(sharesPurchased*pricesSharesPurchased));
    double firstPaidShare = pricesSharesPurchased * sharesPurchased;
    System.out.println("Type the commission for buying:\n");
    double comission1 = user.nextDouble();
    double firstcomissionStockBroker = firstPaidShare * comission1;
    System.out.println("The amount payed for the first comission is:\n"+firstcomissionStockBroker);
    System.out.println("Type the amount of shares sold:\n");
    double sharesSold = user.nextDouble();
    System.out.println("Type the price of shares sold:\n");
    double pricesSharesSold = user.nextDouble();
    double amountSoldFor = sharesSold * pricesSharesSold;
    System.out.println("The amount you are being payed is:\n"+amountSoldFor);
    System.out.println("Type the comission for selling:\n");
    double comission2 = user.nextDouble();
    double secondComissionStockBroker = amountSoldFor*comission2;
    System.out.println("The amount payed for the second comission is:\n"+secondComissionStockBroker);
    double profit = amountSoldFor - firstPaidShare - firstcomissionStockBroker
        - secondComissionStockBroker;
    System.out.println("The profit you made is:\n"+profit);
  }
}
