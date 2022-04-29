package Lesson1;

public class Lesson1
{
  public static void main(String[] args)
  {
    //Challenge 1
    String name = "Rodrigo";
    int age = 26;
    double annualPay = 1000.23;
    System.out.print("My name is " + name);
    System.out.print(" My age is " + age + " and");
    System.out.println("\nI hope to earn " + annualPay);

    //Challenge 2 Write a program that has the following String variables: firstName, middleName, and
    //lastName. Initialize these with your first, middle, and last names. The program should also
    //have the following char variables: firstInitial, middleInitial, and lastInitial. Store
    //your first, middle, and last initials in these variables. The program should display the contents
    //of these variables on the screen.
    String firstName = "Rodrigo";
    String middleName = "";
    String lastname = "Reyes Gonzalez";
    char firstInitial = 'R';
    System.out.println(firstInitial);
    char middleInitial = ' ';
    System.out.println(middleInitial);
    char lastInitial = 'R';
    System.out.println(lastInitial);

    //Challenge 3 Write a program that displays the following information, each on a separate line:
    // Your name Your address, with city, state, and ZIP Your telephone number Your college major
    //Although these items should be displayed on separate output lines, use only a single println
    //statement in your program.

    System.out.println(
        "Name:Rodrigo\n" + "," + "Adress:Valle del Oro 104\n" + ","
            + "City:Aguascalientes\n" + "," + "State:AGS\n" + ","
            + "zip:20064\n" + "," + "telephone number:4491562024\n" + ","
            + "College Major:VIA\n");

    //Challenge 4
    // Write a program that displays the following pattern:
    // ***
    // *****
    //*******
    //*****
    //***
    //*

    System.out.println("*\n***\n*****\n*******\n*****\n***\n*\n");

    //Excercise 1.04
    //Write a program that stores the integers 19 and 89 in variables, and stores their sum in a variable named total
    int var1 = 19;
    int var2 = 89;
    int total = (var1 + var2);
    System.out.println(total);

    //Excercise 1.05
    //In Denmark, the sales tax is 25%. Write a program that calculates and prints the tax
    // and the total price of items that before the added tax cost 80, 140, and 230 kr., respectively.
    double item1 = 80 * 1.25;
    System.out.println(item1);
    double item2 = 140 * 1.25;
    System.out.println(item2);
    double item3 = 230 * 1.25;
    System.out.println(item3);

    //Excercise 1.06
    //Write a program that calculates and prints the circumference and area of a circle with radius 22.5.
    // (Hint: The circumference of a circle is 2πr,
    // the area is πr2. The expression Math.PI gives a value for π).

    double radius = 22.5;
    double circunference = 2 * Math.PI * radius;
    System.out.println("The circunference is:" + circunference);
    double area = Math.PI * (radius * radius);
    System.out.println("The area is:" + area);

    /*
    Excercise 1.07
    Determine the order of evaluation of the operators in each of the following Java statements,
     and try to figure out what the value of x, y, and z will be.
     Then check if you were right by implementing a Java program that prints out the values after running the statements.
     a. x = 7 + 3 * 6 / 2 - 1;
     b. y = 2 % 2 + 2 * 2 - 2 / 2;
     c. z = (3 * 9 * ( 3 + ( 9 * 3 / ( 3 ) ) ) );
    */

    //a. 15
    //b. 3
    //c.324
    int x = 7 + 3 * 6 / 2 - 1;
    System.out.println("value of x:" + x);
    double y = 2 % 2 + 2 * 2 - 2 / 2;
    System.out.println("value of y:" + y);
    int z = (3 * 9 * (3 + (9 * 3 / (3))));
    System.out.println("value of z:" + z);

    /*
    Excercise 1.08
    What does the following code print? Think about it first,
    and then check if you were right by implementing the statement.
    System.out.println("*\n**\n***\n****\n*****" );
    */
    System.out.println("*\n**\n***\n****\n*****");

    /*
    Excercise 1.09
    What does the following code print? Think about it first, and then check if you were right by implementing the statements.
    System.out.print( "*" );
     System.out.println( "***" );
     System.out.println( "*****" );
     System.out.print( "****" );
     System.out.println( "**" );
     */
    System.out.print("*");
    System.out.println("***");
    System.out.println("*****");
    System.out.print("****");
    System.out.println("**");

    /*
    Excercise 1.10
    What will the following program print? Try to figure it out yourself before running the program.
    public class Expressions
    {
    public static void main(String[] args)
    {
    System.out.println(23 * 4.5 / 0.5 + 1);
    System.out.println(23 * 4.5 / (0.5 + 1));
    System.out.println(2 + 5 - 18 + 11);
    System.out.println((2 + 5) - (18 + 11));
    System.out.println(14 * 18 / 4 + 4);
    System.out.println(14 * 18 / (4 + 4));
    }
      }
     */

    System.out.println(23 * 4.5 / .5 + 1); //208
    System.out.println(23 * 4.5 / (.5 + 1));//69
    System.out.println(2 + 5 - 18 + 11);//0
    System.out.println((2 + 5) - (18 + 11));//-22
    System.out.println(14 * 18 / 4 + 4);//67
    System.out.println(14 * 18 / (4+4));//31.5
  }
}


