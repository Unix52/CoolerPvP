package CoolerPvP.Comandos;

import java.io.PrintStream;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

import CoolerPvP.Listener.Mensagens;

@SuppressWarnings("unused")
public class Tp
  implements CommandExecutor
{
  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
  {
    if (cmd.getName().equalsIgnoreCase("tp"))
    {
      if ((sender instanceof ConsoleCommandSender))
      {
        Player p = (Player)sender;
  		Mensagens.Console(p);
        return true;
      }
      Player p = (Player)sender;
      if (args.length == 0) {
        p.sendMessage(ChatColor.RED + "Sintaxe Incorreta.");
      } else if (args.length == 1)
      {
        if ((p.hasPermission("pvp.tp")) || (p.isOp()))
        {
          Player targetPlayer = p.getServer().getPlayer(args[0]);
          Location tpLoc = targetPlayer.getLocation();
          p.teleport(tpLoc);
          p.sendMessage(ChatColor.GRAY + "Teleportado para " + ChatColor.AQUA + targetPlayer.getDisplayName() + ChatColor.GRAY + ".");
        }
        else
        {
          Mensagens.semPermiassao(p);
        }
      }
      else if (args.length == 2) {
        if ((p.hasPermission("cp.tp")) || (p.isOp()))
        {
          Player targetPlayer = p.getServer().getPlayer(args[0]);
          Player targetPlayer2 = p.getServer().getPlayer(args[1]);
          if ((targetPlayer == null) || (targetPlayer2 == null))
          {
            p.sendMessage("§4§oJogador Offline!");
          }
          else
          {
            Location tpLoc = targetPlayer2.getLocation();
            targetPlayer.teleport(tpLoc);
            p.sendMessage(ChatColor.AQUA + targetPlayer.getDisplayName() + ChatColor.GRAY + " Teleportado Para " + ChatColor.AQUA + targetPlayer2.getDisplayName() + ChatColor.GRAY + ".");
          }
        }
        else
        {
          Mensagens.semPermiassao(p);
        }
      }
    }
    return false;
  }
}
