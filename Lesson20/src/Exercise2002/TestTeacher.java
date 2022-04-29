package Exercise2002;

public class TestTeacher
{
  public static void main(String[] args)
  {
    Teacher teacher1 = new Teacher("Pedro", "Norregade10", 18, 5.5);
    Employee employee1 = new Employee("Rodrigo", "Norregade13", 12, 3.5);

    teacher1.addCourses("Mathemathics");
    teacher1.addGroups(2);
    teacher1.addGroups(5);
    teacher1.setPayRate(2);
    System.out.println(teacher1.getSalary());
    System.out.println(teacher1.getName());
    System.out.println(teacher1);
  }
}
