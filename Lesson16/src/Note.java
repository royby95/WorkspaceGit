public class Note
{
  public String message;
  public boolean highPriority;

  public Note(String message)
  {
    this.message = message;
  }

  public String getMessage()
  {
    return message;
  }

  public void setMessage(String message)
  {
    this.message = message;
  }

  public boolean isHighPriority()
  {
    return highPriority;
  }

  public void setHighPriority()
  {
    highPriority = true;
  }

  public void setLowPriority()
  {
    highPriority = false;
  }

  public Note copy()
  {
    return new Note(message);
  }

  public String toString()
  {
    return "message:"+ message + "Priority"+ highPriority;
  }
}