package CoolerPvP.Comandos;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Tpall
  implements CommandExecutor
{
  @SuppressWarnings({ "unused", "deprecation" })
public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args)
  {
    String cm = cmd.getName();
    if ((cmd.getName().equalsIgnoreCase("tpall")) && 
      (sender.hasPermission("uk.tpall")))
    {
      Player s = (Player)sender;
      for (Player player : Bukkit.getOnlinePlayers()) {
        player.teleport(s.getLocation());
      }
      Bukkit.getServer().broadcastMessage("Voce chamou servidor inteiro");
      return true;
    }
	return false;
  }
}