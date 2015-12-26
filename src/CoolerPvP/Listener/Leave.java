package CoolerPvP.Listener;

import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class Leave
  implements Listener
{
  FileConfiguration cfg;
  
  public Leave(FileConfiguration main)
  {
    this.cfg = main;
  }
  
  @EventHandler
  public void onquit(PlayerQuitEvent event)
  {
	Player player = event.getPlayer();
    event.setQuitMessage("§c - " + ChatColor.RESET + player.getName() + "§7 saiu do servidor");
  }
}
