package CoolerPvP.Comandos;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.SkullMeta;

import CoolerPvP.Main.Main;
import CoolerPvP.Listener.Mensagens;

@SuppressWarnings("unused")
public class Head
  implements CommandExecutor
{
  Main main;
  
  public Head(Main plugin)
  {
    plugin = this.main;
  }
  
  public boolean onCommand(CommandSender sender, Command command, String label, String[] args)
  {
    if (!(sender instanceof Player))
    {
        Player p = (Player)sender;
		Mensagens.Console(p);
      return true;
    }
    if ((sender instanceof Player))
    {
      Player player1 = (Player)sender;
      if ((args.length != 0) && 
        (args.length == 1)) {
        if (player1.hasPermission("cp.head"))
        {
          ItemStack skullItem = new ItemStack(Material.SKULL_ITEM);
          skullItem.setDurability((short)3);
          SkullMeta skullMeta = (SkullMeta)skullItem.getItemMeta();
          skullMeta.setOwner(args[0]);
          skullItem.setItemMeta(skullMeta);
          player1.getInventory().addItem(new ItemStack[] { skullItem });
          player1.sendMessage(ChatColor.GREEN + "Voce pegou uma cabeça");
        }
        else
        {
          Mensagens.semPermiassao(player1);
        }
      }
    }
    return false;
  }
}
