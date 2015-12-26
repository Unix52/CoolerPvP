package CoolerPvP.API;

import org.bukkit.event.Listener;

import CoolerPvP.Main.Main;

public class NameAPI implements Listener
{
	private Main pl;
	  
	  public NameAPI(Main plugin)
	  {
	    this.setPl(plugin);
	  }
  public static String getMod(String name)
  {
    if (name.length() == 16)
    {
      String shorts = name.substring(0, name.length() - 5);
      return shorts;
    }
    if (name.length() == 15)
    {
      String shorts = name.substring(0, name.length() - 4);
      return shorts;
    }
    if (name.length() == 14)
    {
      String shorts = name.substring(0, name.length() - 3);
      return shorts;
    }
    if (name.length() == 13)
    {
      String shorts = name.substring(0, name.length() - 2);
      return shorts;
    }
    return name;
  }
  
  public static String getShortStr(String name)
  {
    if (name.length() == 16)
    {
      String shorts = name.substring(0, name.length() - 5);
      return shorts;
    }
    if (name.length() == 15)
    {
      String shorts = name.substring(0, name.length() - 4);
      return shorts;
    }
    return name;
  }
public Main getPl() {
	return pl;
}
public void setPl(Main pl) {
	this.pl = pl;
}
}
