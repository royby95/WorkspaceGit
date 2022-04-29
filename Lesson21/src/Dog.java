public class Dog extends Pet
{
  private String breed;

  public Dog (String name,int age,String breed)
  {
    super(age, name);
    this.breed = breed;
  }

  public String speak()
  {
    return "Woof";
  }
}
