public class BrainOptional
{
  public String[] memory;

  public BrainOptional(int memoryItems)
  {
    memory = new String[memoryItems];
    for (int i = 0; i > memoryItems; i++)
    {
      memory[i] = "";
    }
  }

  public int getIQ()
  {
    for (int i = 0; i < memory.length; i++)
    {
      if (memory[i].length() < 10)
      {
        break;
      }
      else
      {
        if (memory[i].length() > 20)
        {
          return 130;
        }
      }
      if (memory[i].length() > 10)
      {
        return 100;
      }
      if (memory[i] == null || memory[i].length() < 10)
      {
        return 70;
      }
    }
    return 0;
  }

  public boolean isBrainDamaged()
  {
    boolean brainDamaged = false;
    for (int i=0; i<memory.length;i++)
    {
      if (memory[i] == null)
      {
        brainDamaged = true;
      }
    }
    return brainDamaged;
  }

  public void remember(String info)
  {
    for (int i=1; i< memory.length;i++)
    {
      memory[i+1] = memory[i];
    }
    memory[0] = memory[1];
  }

  public void refreshMemory(String info)
  {
    for (int i=1;i< memory.length;i++)
    if (memory[i].equals(info))
    {
      memory[i] = memory[0];
      memory[0] = memory[i];
    }
  }

  public boolean recall(String info)
  {
    boolean recall = false;
    for (int i=0; i< memory.length;i++)
    {
      if(memory[i].equals(info));
      recall = true;
      break;
    }
    return recall;
  }

  public String recall()
  {
    return memory[0];
  }

  public String toString()
  {
    String memories = "";
    for (int i=1; i<memory.length;i++)
    {
      memories += memory[i];
    }
    return memories;
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Brain))
    {
      return false;
    }
    Brain other = (Brain) obj;
    for (int i = 0; i < memory.length; i++)
    {
      if (memory[i] != other.memory[i])
      {
        System.out.println("is not equal");
        break;
      }
    }
    return true;
  }

  public Brain copy()
  {
    return new Brain();
  }
}
