package Lesson2;

public class Lesson2part6
{
  public static void main(String[] args)
  {
    double sharesPurchased = 1000;
    double firstPaidShare = 32.87 * sharesPurchased;
    System.out.println("The amount of money he payed was:\n"+firstPaidShare);
    double firstComission = firstPaidShare * .02;
    System.out.println("The amount payed for the first comission was:\n"+firstComission);
    double amountSoldFor = sharesPurchased * 33.92;
    System.out.println("The amount he sold the stocks for:\n"+amountSoldFor);
    double secondComission = amountSoldFor * .02;
    System.out.println("The amount payed for the second comission was:\n"+secondComission);
    double profit = amountSoldFor -firstPaidShare- firstComission - secondComission;
    System.out.println("The profit he made wass:\n"+profit);

  }
}
