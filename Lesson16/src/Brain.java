public class Brain
{
  public String[] memory = new String[3];



  public Brain()
  {
    memory[0] = "";
    memory[1] = "";
    memory[2] = "";

  }

  public int getIQ()
  {
    if ((memory[0].length() > 20 || memory[1].length() > 20
        || memory[2].length() > 20) && (memory[0].length()
        > 10) && memory[1].length() > 10
        && memory[2].length() > 10)
    {
      return 130;
    }
    else if (memory[0].length() > 10
        && memory[1].length() > 10
        && memory[2].length() > 10)
    {
      return 100;
    }
    else if ((memory[0] == null || memory[1] == null
        || memory[2] == null) || (memory[0].length() < 10
        || memory[1].length() < 10
        || memory[2].length() < 10))
    {
      return 70;
    }

    return 0;
  }

  public boolean isBrainDamaged()
  {
    return memory[0] == null || memory[1] == null
        || memory[2] == null;
  }

  public void remember(String info)
  {
    memory[2]=memory[1];
    memory[0] = memory[1];
    memory[0] = info;
  }

  public void refreshMemory(String info)
  {
    if (memory[1].equals(info))
    {
      memory[0] = info;
      memory[1] = memory[0];
    }
    else if (memory[2].equals(info))
    {
      memory[0] = info;
      memory[2] = memory[0];
    }
  }

  public boolean recall(String info)
  {
    return memory[1].equals(info) || memory[2].equals(
        info) || memory[0].equals(info);
  }

  public String recall()
  {
    return memory[0];
  }

  public  String toString()
  {
    return memory[1] + memory[2] + memory[0];
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Brain))
    {
      return false;
    }
    Brain other = (Brain) obj;
    return memory[1] == other.memory[1]
        && memory[2]== other.memory[2]
        && other.memory[0] == memory[0];
  }

  public Brain copy()
  {
    return new Brain();
  }

}
