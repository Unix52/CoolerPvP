package CoolerPvP.Comandos;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import CoolerPvP.Main.Main;

public class Mute
  implements CommandExecutor
{
  
  public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args)
  {
    if (commandLabel.equalsIgnoreCase("mute")) {
      if (sender.hasPermission("uk.mute"))
      {
        if (args.length == 0)
        {
          Player p = (Player)sender;
          p.sendMessage(ChatColor.RED + "Sintaxe correta: /mute <jogador>");
        }
        else if (args.length == 1)
        {
          Player player = Bukkit.getPlayer(args[0]);
          if (player == null)
          {
        	Player p = (Player)sender;
            p.sendMessage(ChatColor.RED + "Voce nao pode silenciar um jogador offline");
            return true;
          }
          Player p = (Player)sender;
          p.sendMessage(ChatColor.GREEN + "Jogador silenciado!");
          player.sendMessage(ChatColor.RED + "Voce foi silenciado, portanto nao podera falar!");
          Main.mute.add(player.getName());
        }
      }
      else {
        Player p = (Player)sender;
        p.sendMessage(ChatColor.DARK_RED + "Voce nao tem permissao!");
      }
      if (commandLabel.equalsIgnoreCase("desmute")) {
          if (sender.hasPermission("uk.desmute"))
          {
            if (args.length == 0)
            {
              Player p = (Player)sender;
              p.sendMessage(ChatColor.DARK_GREEN + "Sintaxe correta: /desmute <jogador>");
            }
            else if (args.length == 1)
            {
              Player player = Bukkit.getPlayer(args[0]);
              if (player == null)
              {
              	Player p = (Player)sender;
                p.sendMessage(ChatColor.RED + "Nao e possivel deixar que um jogador offline volte a falar!");
                return true;
              }
            	Player p = (Player)sender;
              p.sendMessage(ChatColor.GREEN + "O jogador ja pode falar novamente");
              Main.mute.remove(player.getName());
            }
          }
          else {
          	Player p = (Player)sender;
            p.sendMessage(ChatColor.DARK_RED + "Voce Nao Tem Permissao!");
          }
        }
  	return false;
    }
	return false;
  }
}