package Exercise2002;

import java.util.ArrayList;

public class Teacher extends Employee
{
  private ArrayList<String> courses;
  private ArrayList<Integer> groups;

  public Teacher(String name, String address, double hours, double payRate)
  {
    super(name, address, hours, payRate);
    courses = new ArrayList<>();
    groups = new ArrayList<>();
  }

  public String getCourses()
  {
    String listCourses = "";
    for (int i = 0; i <courses.size() ; i++)
    {
      listCourses+= courses.get(i);
    }
    return listCourses;
  }

  public int[] getAllGroups()
  {
    int[] tempArray = new int[groups.size()];

    for (int i = 0; i <courses.size() ; i++)
    {
      tempArray[i] = groups.get(i);
    }
    return tempArray;
  }

  public void addCourses(String course)
  {
    courses.add(course);
  }

  public void addGroups(int group)
  {
    groups.add(group);
  }

  public String toString()
  {
    return super.toString()+" " + courses +" "+ groups;
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Teacher))
    {
      return false;
    }

    Teacher other = (Teacher) obj;

    return super.equals(obj) && other.groups.equals(groups) && other.courses.equals(courses);
  }



}
