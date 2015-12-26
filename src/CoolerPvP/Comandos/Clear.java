package CoolerPvP.Comandos;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import CoolerPvP.Listener.Mensagens;

public class Clear
  implements CommandExecutor
{
  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
  {
    Player p = (Player)sender;
    if ((cmd.getName().equalsIgnoreCase("clear")) && 
      (args.length == 0)) {
      if ((p.hasPermission("cp.clear")) || (p.isOp()))
      {
        Inventory inv = p.getInventory();
        inv.clear();
        p.sendMessage(ChatColor.YELLOW + "Inventario limpo");
      }
      else
      {
        Mensagens.semPermiassao(p);
      }
    }
    return false;
  }
}
