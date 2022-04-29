package Workshop1;

import java.text.DecimalFormat;

public class testCalculator
{
  public static void main(String[] args)
  {
    Calculator operator = new Calculator(2.344455, 3.44445, "add");
    DecimalFormat formatter = new DecimalFormat("0.0000");
    System.out.println(operator);
  }
}
