package Lesson2;

import java.util.Scanner;

public class Lesson2part5
{
  public static void main(String[] args)
  {
    /*
    Write a program that plays a word game with the user. The program should ask the user
to enter the following:
His or her name
his or her age
the name of the city
the name of a college
a profession
a type of animal
a pet´s name

After the user has entered these items, the program should display the following story,
inserting the user’s input into the appropriate locations:
There once was a person named NAME who lived in CITY. At the age of AGE,
NAME went to college at COLLEGE. NAME graduated and went to work as a
PROFESSION. Then, NAME adopted a(n) ANIMAL named PETNAME. They both lived
happily ever after!
     */
    Scanner user = new Scanner(System.in);
    System.out.println("write your name");
    String name = user.nextLine();
    System.out.println("write your age");
    int age = user.nextInt();
    user.nextLine();
    System.out.println("name of the city");
    String city = user.nextLine();
    System.out.println("name of the college");
    String college = user.nextLine();
    System.out.println("name of the profesion");
    String profesion = user.nextLine();
    System.out.println("name animal type");
    String animal = user.nextLine();
    System.out.println("name pet´s name");
    String petName = user.nextLine();

    System.out.println(
        "There once was a person named " + name + " who lived in " + city + "."
            + "At the age of " + age + ",\n " + name + " went to collage at "
            + college + "." + name + " graduated and went to work as a\n "
            + profesion + "." + "Then, " + name + " adopted a (n) " + animal
            + " named " + petName + "." + "They both lived\n "
            + "happely ever after!");

  }
}
