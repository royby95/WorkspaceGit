import java.util.ArrayList;

public class SiteAdministrator
{
  private String name;
  private SiteCollection siteCollection;
  private Website website;

  public SiteAdministrator(String name)
  {
    this.name = name;
  }

  public String getName()
  {
    return name;
  }

  public SiteCollection getSiteCollection()
  {
    return siteCollection;
  }

  public Website getNextSiteToUpdate()
  {

    return siteCollection.getAllNotUpdatedSites()[0];
  }

  public Website[] getAllSitesToUpdate()
  {
    return siteCollection.getAllNotUpdatedSites();
  }

}
