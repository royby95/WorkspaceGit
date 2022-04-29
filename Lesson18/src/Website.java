public class Website
{
  private String url;
  private boolean needsUpdate;

  public Website(String url)
  {
    this.url = url;
  }

  public String getUrl()
  {
    return url;
  }

  public boolean NeedsUpdate()
  {
    return needsUpdate;
  }

  public void markAsNotUpdated()
  {
    needsUpdate = true;
  }

  public void markAsUpdated()
  {
    needsUpdate = false;
  }

  public boolean equals(Object object)
  {
    if (!(object instanceof Website))
    {
      return false;
    }
    Website other = (Website) object;

    return url.equals(other.url);
  }

}
