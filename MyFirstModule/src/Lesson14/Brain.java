package Lesson14;

public class Brain
{
  public String activeMemoryItem;
  public String passiveMemoryItemOne;
  public String passiveMemoryItemTwo;


  public Brain()
  {
    activeMemoryItem = "";
    passiveMemoryItemOne = "";
    passiveMemoryItemTwo = "";

  }

  public int getIQ()
  {
    if ((activeMemoryItem.length() > 20 || passiveMemoryItemOne.length() > 20
        || passiveMemoryItemTwo.length() > 20) && (activeMemoryItem.length()
        > 10) && passiveMemoryItemOne.length() > 10
        && passiveMemoryItemTwo.length() > 10)
    {
      return 130;
    }
    else if (activeMemoryItem.length() > 10
        && passiveMemoryItemOne.length() > 10
        && passiveMemoryItemTwo.length() > 10)
    {
      return 100;
    }
    else if ((activeMemoryItem == null || passiveMemoryItemOne == null
        || passiveMemoryItemTwo == null) || (activeMemoryItem.length() < 10
        || passiveMemoryItemOne.length() < 10
        || passiveMemoryItemTwo.length() < 10))
    {
      return 70;
    }

    return 0;
  }

  public boolean isBrainDamaged()
  {
    return activeMemoryItem == null || passiveMemoryItemOne == null
        || passiveMemoryItemTwo == null;
  }

  public void remember(String info)
  {
    passiveMemoryItemTwo=passiveMemoryItemOne;
    activeMemoryItem = passiveMemoryItemOne;
    activeMemoryItem = info;
  }

  public void refreshMemory(String info)
  {
    if (passiveMemoryItemOne.equals(info))
    {
      activeMemoryItem = info;
      passiveMemoryItemOne = activeMemoryItem;
    }
    else if (passiveMemoryItemTwo.equals(info))
    {
      activeMemoryItem = info;
      passiveMemoryItemTwo = activeMemoryItem;
    }
  }

  public boolean recall(String info)
  {
    return passiveMemoryItemOne.equals(info) || passiveMemoryItemTwo.equals(
        info) || activeMemoryItem.equals(info);
  }

  public String recall()
  {
    return activeMemoryItem;
  }

  public  String toString()
  {
    return passiveMemoryItemOne + passiveMemoryItemTwo + activeMemoryItem;
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Brain))
    {
      return false;
    }
    Brain other = (Brain) obj;
    return passiveMemoryItemOne.equals(other.passiveMemoryItemOne)
        && passiveMemoryItemTwo.equals(other.passiveMemoryItemTwo)
        && other.activeMemoryItem.equals(other.activeMemoryItem);
  }

  public Brain copy()
  {
    return new Brain();
  }


}
