import java.util.ArrayList;

public class SiteCollection
{
  private int size;
  private ArrayList<Website> websites;

  public SiteCollection(int maxSites)
  {
    websites = new ArrayList<>(maxSites);
  }

  public int getNumberOfSites()
  {
    return size;
  }

  public int getNumberOfUpdateSites()
  {
    int counter = 0;
    for (int i = 0; i <websites.size() ; i++)
    {
      if (websites.get(i).NeedsUpdate() == false)
      {
        counter++;
      }
    }
    return counter;
  }

  public void addSite(Website site)
  {
    if (size < websites.size())
    {
      websites.add(site);
    }
    size++;
  }

  public void removeSite(String url)
  {
    websites.remove(url);
    size--;
  }

  public Website[] getAllSites()
  {
    Website[] tempArray = new Website[websites.size()];
    Website[] newArray = websites.toArray(tempArray);

    return newArray;
  }

  public Website[] getAllNotUpdatedSites()
  {
    Website[] tempArray = new Website[websites.size() - getNumberOfUpdateSites()];

    for (int i = 0; i < websites.size() ; i++)
    {
      if (websites.get(i).NeedsUpdate())
      {
        tempArray[i] = websites.get(i);
      }
    }
    return tempArray;
  }

  public String toString()
  {
    String printWebsites = "";

    for (int i = 0; i <websites.size() ; i++)
    {
      printWebsites += websites.get(i).getUrl();
    }
    return printWebsites;
  }
}
