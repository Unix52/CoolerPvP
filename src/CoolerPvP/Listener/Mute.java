package CoolerPvP.Listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import CoolerPvP.Main.Main;

public class Mute
  implements Listener
{
  @EventHandler
  public void onPlayerMutado(AsyncPlayerChatEvent e)
  {
    Player player = e.getPlayer();
    if (Main.mute.contains(player.getName()))
    {
      e.setCancelled(true);
      player.sendMessage(Main.plugin.getConfig().getString("Silenciado").replaceAll("&", "§"));
      return;
    }
  }
}
