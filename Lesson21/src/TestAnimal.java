public class TestAnimal
{
  public static void main(String[]args)
  {
    Animal[] animal1 = new Animal[4];
    animal1[0] = new Frog(2, "RED");
    animal1[1] = new Bee(2,true);
    animal1[2] = new Dog("Mitzy",4,"Poddle");
    animal1[3] = new Cat(3,"Mimi",true);

    Pet[] pets = new Pet[2];

    pets[0] = new Dog("Pituso", 3, "Doberman");
    pets[1] = new Cat(3,"Garfield",true);

    for (int i = 0; i < animal1.length ; i++)
    {
      System.out.println(animal1[i].speak());
    }

    for (int i = 0; i < pets.length ; i++)
    {
      System.out.println(pets[i].speak());
    }
  }
}
