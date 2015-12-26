package CoolerPvP.Comandos;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import CoolerPvP.Main.Main;

public class List
  implements CommandExecutor
{
  public Main plugin;
  
  public List(Main instance)
  {
    this.plugin = instance;
  }
  
  @SuppressWarnings("deprecation")
public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
  {
    if (args.length != 0)
    {
      sender.sendMessage(ChatColor.YELLOW + "Excesso de argumentos.");
      return true;
    }
    Player[] players = Bukkit.getOnlinePlayers();
    String list = "";
    int playerCount = 0;
    for (int i = 0; i < players.length; i++) {
      if ((sender instanceof Player))
      {
        if (((Player)sender).canSee(players[i]))
        {
          list = list + players[i].getDisplayName() + ChatColor.GRAY + ", ";
          playerCount++;
        }
      }
      else
      {
        list = list + players[i].getDisplayName() + ChatColor.GRAY + ", ";
        playerCount++;
      }
    }
    if (players.length == 0)
    {
      sender.sendMessage(ChatColor.YELLOW + "Nao tem jogadores online.");
      return true;
    }
    sender.sendMessage(ChatColor.YELLOW + "Jogadores online (" + playerCount + "): " + ChatColor.GRAY + list.substring(0, list.length() - 2));
    return true;
  }
}
