package CoolerPvP.Comandos;

import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import CoolerPvP.Main.Main;
import CoolerPvP.Listener.Mensagens;

@SuppressWarnings("unused")
public class InvSee
  implements CommandExecutor
{
  public Main plugin;
  
  public InvSee(Main instance)
  {
    this.plugin = instance;
  }
  
  public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args)
  {
    if (!(sender instanceof Player))
    {
        Player p = (Player)sender;
		Mensagens.Console(p);
      return true;
    }
    Logger log = Logger.getLogger("Minecraft");
    Player player = (Player)sender;
    if (cmd.getName().equalsIgnoreCase("inv"))
    {
      if (!player.hasPermission("cp.invsee"))
      {
        Mensagens.semPermiassao((Player)sender);
        return true;
      }
      if (args.length == 1)
      {
        if (player.getServer().getPlayer(args[0]) != null)
        {
          Player targetplayer = player.getServer().getPlayer(args[0]);
          player.openInventory(targetplayer.getInventory());
          log.info("[Comando] [Commando] " + player.getDisplayName() + 
            ": " + "/" + commandLabel + " " + 
            targetplayer.getDisplayName());
          player.sendMessage(ChatColor.GRAY + 
            "Abriu o inventario de " + 
            targetplayer.getDisplayName() + ".");
        }
        else
        {
            Player p = (Player)sender;
    		Mensagens.Offline(p);
        }
      }
      else if ((args.length > 1) || (args.length < 1))
      {
        player.sendMessage(ChatColor.RED + "Erro!");
        player.sendMessage(ChatColor.RED + "Usar: /" + commandLabel + 
          " <jogador>");
      }
    }
    return true;
  }
}
