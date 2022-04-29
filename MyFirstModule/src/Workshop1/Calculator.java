package Workshop1;

import java.text.DecimalFormat;

public class Calculator
{
  DecimalFormat formatter = new DecimalFormat("0.0000");
  public double result;
  public String operator;
  public double number1;
  public double number2;


  public Calculator(double number1, double number2, String operator)
  {
    this.number1 = number1;
    this.number2 = number2;
    this.operator = operator;
    switch (operator)
    {
      case "subtract":
        result = number1 - number2;
        break;
      case "add":
        result = number1 + number2;
        break;
      case "multiply":
        result = number1 * number2;
        break;
      default:
        System.out.println("Operator Not Supported");
    }

  }

  public String toString()
  {
    return  "" + formatter.format(result);
  }

}


