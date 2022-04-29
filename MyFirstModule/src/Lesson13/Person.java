package Lesson13;

import Lesson11.MyDate;
import Lesson14.Brain;

public class Person
{
  public String name;
  public String address;
  public MyDate birthday;
  public Brain brain;

  public Person(String name, String address, MyDate birthday)
  {
    this.name = name;
    this.address = address;
    this.birthday = birthday.copy();
  }

  public Person(String name, MyDate birthday)
  {
    this.name = name;
    this.birthday = birthday.copy();
  }

  public Person(MyDate birthday)
  {
    this.birthday = birthday.copy();
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public String getAddress()
  {
    return address;
  }

  public void setAddress(String address)
  {
    this.address = address;
  }

  public MyDate getBirthday()
  {
    return birthday;
  }

  public int getAge()
  {
    int age = MyDate.today().getYear() - birthday.getYear();
    if (birthday.getMonth() > MyDate.today().getMonth())
    {
      age = age - 1;
    }
    else if (birthday.getMonth() == MyDate.today().getMonth()
        && birthday.getDay() > MyDate.today().getDay())
    {
      age = age - 1;
    }
    return age;
  }

  public String toString()
  {
    return name + address + birthday;
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Person))
    {
      return false;
    }
    Person other = (Person) obj;

    return name.equals(other.name) && address.equals(other.address)
        && birthday.equals(other.birthday);
  }

  public int getIQ()
  {
    return brain.getIQ();
  }


  public boolean isBrainDamaged()
  {
    return brain.isBrainDamaged();
  }

  public boolean doYouRemember(String topic)
  {
    return (topic.equals(brain.activeMemoryItem) || topic.equals(
        brain.passiveMemoryItemTwo) || topic.equals(brain.activeMemoryItem));
  }

  public void rememberThis(String topic)
  {
    if (!topic.equals(brain.passiveMemoryItemOne))
    {
      brain.passiveMemoryItemOne = topic;
    }
    else if (!topic.equals(brain.passiveMemoryItemTwo))
    {
      brain.passiveMemoryItemTwo = topic;
    }
    else if (!topic.equals(brain.activeMemoryItem))
    {
      brain.activeMemoryItem = topic;
    }
    else
    {
      brain.refreshMemory(topic);
    }
  }

  public String whatAreYouThinkingAbout()
  {
    return brain.activeMemoryItem;
  }

}
