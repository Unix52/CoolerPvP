package CoolerPvP.Comandos;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;

import CoolerPvP.Listener.Mensagens;

public final class Build
  implements Listener, CommandExecutor
{
  private static boolean build = false;
  
  public final boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
  {
    if (cmd.getName().equalsIgnoreCase("build"))
    {
      if (!sender.hasPermission("cp.build"))
      {
        Mensagens.semPermiassao((Player)sender);
        return true;
      }
      if (args.length == 0)
      {
        sender.sendMessage(ChatColor.GRAY + "Contruir esta: " + (build ? ChatColor.GREEN + "Habilitado" : new StringBuilder().append(ChatColor.RED).append("Desativado").toString()));
        sender.sendMessage("Usar: " + ChatColor.RED + "/build [on|off]");
        return true;
      }
      if (args[0].equalsIgnoreCase("on"))
      {
        build = true;
        sender.sendMessage(ChatColor.GRAY + "Contruir esta: " + (build ? ChatColor.GREEN + "Habilitado" : new StringBuilder().append(ChatColor.RED).append("Desativado").toString()));
      }
      else if (args[0].equalsIgnoreCase("off"))
      {
        build = false;
        sender.sendMessage(ChatColor.GRAY + "Contruir esta: " + (build ? ChatColor.GREEN + "Desativado" : new StringBuilder().append(ChatColor.RED).append("Desativado").toString()));
      }
      else
      {
        sender.sendMessage("Usar: " + ChatColor.RED + "/build [on|off]");
      }
      return true;
    }
    return false;
  }
  
  @EventHandler(priority=EventPriority.MONITOR)
  public final void onBlockPlace(BlockPlaceEvent event)
  {
    if (!build) {
      event.setCancelled(true);
    }
  }
  
  @EventHandler(priority=EventPriority.MONITOR)
  public final void onBlockBreak(BlockBreakEvent event)
  {
    if (!build) {
      event.setCancelled(true);
    }
  }
}
