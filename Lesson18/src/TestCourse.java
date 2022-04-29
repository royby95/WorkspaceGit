import java.util.Arrays;

public class TestCourse
{

  public static void main(String[] args)
  {
    Instructor instructor1 = new Instructor("Rodrigo", 13);
    Instructor instructor2 = new Instructor("Pedro", 15);
    Student student1 = new Student("Carlos", 2);
    Student student2 = new Student("Francisco", 2);
    Student student3 = new Student("Luis", 3);
    Course course1 = new Course("Physics",instructor1 );

    course1.setSecondaryInstructor(instructor2);
    course1.addStudent(student1);
    course1.addStudent(student2);
    course1.addStudent(student3);

    System.out.println(course1.getNumberOfInstructors());
    System.out.println(course1.getNumberOfStudents());
    System.out.println(course1.getPrimaryInstructor());
    System.out.println(course1.getSecondaryInstructor());
    System.out.println(Arrays.toString(course1.getStudentsBySemester(2)));
    System.out.println(course1);

  }
}
