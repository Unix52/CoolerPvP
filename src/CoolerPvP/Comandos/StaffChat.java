package CoolerPvP.Comandos;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import CoolerPvP.Main.Main;

public class StaffChat
  implements Listener, CommandExecutor
{
  ArrayList<String> staff = Main.staff;
  
  @SuppressWarnings("deprecation")
@EventHandler
  public void onChat(AsyncPlayerChatEvent e)
  {
    Player p = e.getPlayer();
    for (Player online : Bukkit.getOnlinePlayers()) {
      if (isStaffChatting(p))
      {
        e.setCancelled(true);
        if ((online.hasPermission("cp.staffchat")) || (isStaffChatting(online))) {
          online.sendMessage(ChatColor.AQUA + p.getName() + ChatColor.GRAY + "> " + ChatColor.LIGHT_PURPLE + e.getMessage());
        }
      }
    }
  }
  
  public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args)
  {
    if (!(sender instanceof Player)) {
      return true;
    }
    Player p = (Player)sender;
    if ((cmd.getName().equalsIgnoreCase("s")) && (p.hasPermission("cp.staffchat"))) {
      if (isStaffChatting(p))
      {
        this.staff.remove(p.getName());
        p.sendMessage(ChatColor.RED + "Voce saiu do chat da staff.");
      }
      else
      {
        this.staff.add(p.getName());
        p.sendMessage(ChatColor.GREEN + "Voce entrou no chat da staff.");
      }
    }
    return false;
  }
  
  public boolean isStaffChatting(Player player)
  {
    if (this.staff.contains(player.getName())) {
      return true;
    }
    return false;
  }
}
