package CoolerPvP.Listener;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;

public class Tag
  implements Listener
{
  @EventHandler(priority=EventPriority.HIGHEST)
  public void onPlayerTag(PlayerLoginEvent e)
  {
    Player p = e.getPlayer();
    String name = p.getName();
    if (name.length() + 4 >= 16) {
      name = name.substring(0, name.length() - 4);
    }
    if (p.hasPermission("cp.dono"))
    {
      p.setPlayerListName("§4" + name);
      p.setCustomName("§4" + name);
      p.setDisplayName("§4" + name + ChatColor.RESET);
      p.setCustomNameVisible(true);
      return;
    }
    else
    if (p.hasPermission("cp.admin"))
    {
      p.setPlayerListName("§c" + name);
      p.setCustomName("§c" + name);
      p.setDisplayName("§c" + name + ChatColor.RESET);
      p.setCustomNameVisible(true);
      return;
    }
    else
    if (p.hasPermission("cp.mod"))
    {
      p.setPlayerListName("§5" + name);
      p.setCustomName("§5" + name);
      p.setDisplayName("§5" + name + ChatColor.RESET);
      p.setCustomNameVisible(true);
      return;
    }
    else
    if (p.hasPermission("cp.pro"))
    {
      p.setPlayerListName("§6" + name);
      p.setCustomName("§6" + name);
      p.setDisplayName("§6" + name + ChatColor.RESET);
      p.setCustomNameVisible(true);
      return;
    }
    else
    if (p.hasPermission("cp.mvp"))
    {
      p.setPlayerListName("§9" + name);
      p.setCustomName("§9" + name);
      p.setDisplayName("§9" + name + ChatColor.RESET);
      p.setCustomNameVisible(true);
      return;
    }
    else
    if (p.hasPermission("cp.vip"))
    {
      p.setPlayerListName("§a" + name);
      p.setCustomName("§a" + name);
      p.setDisplayName("§a" + name + ChatColor.RESET);
      p.setCustomNameVisible(true);
      return;
    }
    else
    if (p.hasPermission("cp.youtuber"))
    {
      p.setPlayerListName("§b" + name);
      p.setCustomName("§b" + name);
      p.setDisplayName("§b" + name + ChatColor.RESET);
      p.setCustomNameVisible(true);
      return;
    }
    else
    {
      p.setPlayerListName("§8" + name);
      p.setCustomName("§8" + name);
      p.setDisplayName("§8" + name + ChatColor.RESET);
      p.setCustomNameVisible(true);
      return;
     }
   }
 }
