package CoolerPvP.Listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import CoolerPvP.Main.Main;

public class Chat
  implements Listener
{

	  public Chat(Main main) {
	}

	@EventHandler
	  public void HGChat(AsyncPlayerChatEvent e)
	  {
	    Player p = e.getPlayer();
	    e.setFormat("%s§6: §7§o" + e.getMessage());
	    if (p.hasPermission("cp.chat")) {
	    	e.setFormat("%s§6: §7§o" + e.getMessage().replace("&", "§"));
	   }
	}
 }
