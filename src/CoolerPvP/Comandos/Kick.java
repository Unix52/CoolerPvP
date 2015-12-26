package CoolerPvP.Comandos;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class Kick
  implements Listener,CommandExecutor
  {
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args)
	{
    if (cmd.getName().equalsIgnoreCase("kick"))
    {
        Player p = (Player)sender;
      if (p.hasPermission("uk.kick"))
      {
        if (args.length == 0)
        {
          p.sendMessage(ChatColor.DARK_RED + "Uso Correto: /kick <jogador> <motivo>");
          return true;
        }
        if (args.length == 1)
        {
          Player t = Bukkit.getPlayerExact(args[0]);
          if (t == null)
          {
            p.sendMessage(ChatColor.RED + "Jogador " + args[0] + " nao encontrado!");
            return true;
          }
          p.sendMessage(ChatColor.GREEN + "Voce kickou " + ChatColor.GREEN + t.getName());
          Bukkit.getServer().broadcastMessage(ChatColor.RED + t.getName() + ChatColor.GRAY + " foi kickado do servidor por " + ChatColor.RED + p.getName() + ChatColor.GRAY + "!");
          t.kickPlayer(ChatColor.RED + "Voce foi kickado do servidor!");
          return true;
        }
        if (args.length >= 2)
        {
          Player t = Bukkit.getPlayerExact(args[0]);
          if (t == null)
          {
            p.sendMessage(ChatColor.RED + "Jogador " + args[0] + ChatColor.RED + " nao encontrado");
            return true;
          }
          StringBuilder str = new StringBuilder();
          for (int i = 1; i < args.length; i++) {
            str.append(args[i]).append(" ");
          }
          String msg = str.toString();
          p.sendMessage(ChatColor.GRAY + "Voce kickou " + ChatColor.RED + t.getName() + ChatColor.GRAY + " por " + ChatColor.RED + msg);
          Bukkit.getServer().broadcastMessage(ChatColor.RED + t.getName() + ChatColor.GRAY + " foi kickado do servidor por " + ChatColor.RED + msg + ChatColor.GRAY + " pelo " + ChatColor.RED + p.getName() + ChatColor.GRAY + "!");
          t.kickPlayer(ChatColor.GRAY + "Voce foi kickado do servidor por " + ChatColor.RED + msg);
          return true;
        }
        return true;
      }
      p.sendMessage(ChatColor.DARK_RED + "Voce nao tem permissao!");
      return true;
    }
	return false;
  }
}