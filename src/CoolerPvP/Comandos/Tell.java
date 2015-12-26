package CoolerPvP.Comandos;

import java.io.PrintStream;

import org.bukkit.ChatColor;
import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

import CoolerPvP.Listener.Mensagens;

@SuppressWarnings("unused")
public class Tell
  implements CommandExecutor
{
  public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args)
  {
    if (cmd.getName().equalsIgnoreCase("tell"))
    {
      if ((sender instanceof ConsoleCommandSender))
      {
        Player p = (Player)sender;
  		Mensagens.Console(p);
        return true;
      }
      Player p = (Player)sender;
      {
        if (args.length == 0)
        {
          p.sendMessage(ChatColor.RED + "Use: /tell <jogador> <mensagem>");
        }
        else if (args.length == 1)
        {
          p.sendMessage(ChatColor.RED + "Use: /tell <jogador> <mensagem>");
        }
        else if (args.length > 1)
        {
          String message = "";
          for (int i = 1; i < args.length; i++) {
            message = message + args[i] + " ";
          }
          Player targetPlayer = p.getServer().getPlayer(args[0]);
          if (targetPlayer == null)
          {
      		Mensagens.Offline(p);
          }
          else
          {
            targetPlayer.sendMessage(ChatColor.GRAY + "(De " + ChatColor.RED + p.getDisplayName() + "§7)§f: " + message);
            p.sendMessage(ChatColor.GRAY + "(Para " + ChatColor.RED + targetPlayer.getDisplayName() + "§7)§f: " + message);
          }
        }
      }
    }
    return false;
  }
}
