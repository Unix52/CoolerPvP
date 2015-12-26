package CoolerPvP.Listener;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import CoolerPvP.Listener.Mensagens;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.BookMeta;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffectType;

import CoolerPvP.API.BossBar;
import CoolerPvP.API.TitleManager;

@SuppressWarnings("unused")
public class Join
  implements Listener
{
@EventHandler
  public void joinEvents(PlayerJoinEvent event)
  {
    Player player = event.getPlayer();
    BossBar.setMessage(player, "§b§oBem-Vindo§6§l " + player.getName() + "§b§o ao CoolerPvP", 4);
    event.setJoinMessage("§a + " + ChatColor.RESET + player.getName() + "§7 entrou no servidor");
    player.removePotionEffect(PotionEffectType.ABSORPTION);
    player.removePotionEffect(PotionEffectType.BLINDNESS);
    player.removePotionEffect(PotionEffectType.CONFUSION);
    player.removePotionEffect(PotionEffectType.DAMAGE_RESISTANCE);
    player.removePotionEffect(PotionEffectType.FAST_DIGGING);
    player.removePotionEffect(PotionEffectType.FIRE_RESISTANCE);
    player.removePotionEffect(PotionEffectType.HARM);
    player.removePotionEffect(PotionEffectType.HEAL);
    player.removePotionEffect(PotionEffectType.HEALTH_BOOST);
    player.removePotionEffect(PotionEffectType.HUNGER);
    player.removePotionEffect(PotionEffectType.INCREASE_DAMAGE);
    player.removePotionEffect(PotionEffectType.INVISIBILITY);
    player.removePotionEffect(PotionEffectType.JUMP);
    player.removePotionEffect(PotionEffectType.NIGHT_VISION);
    player.removePotionEffect(PotionEffectType.POISON);
    player.removePotionEffect(PotionEffectType.REGENERATION);
    player.removePotionEffect(PotionEffectType.SATURATION);
    player.removePotionEffect(PotionEffectType.SLOW);
    player.removePotionEffect(PotionEffectType.SLOW_DIGGING);
    player.removePotionEffect(PotionEffectType.SPEED);
    player.removePotionEffect(PotionEffectType.WATER_BREATHING);
    player.removePotionEffect(PotionEffectType.WEAKNESS);
    player.removePotionEffect(PotionEffectType.WITHER);
    player.getInventory().setArmorContents(null);
    ItemStack portal = new ItemStack(Material.ENDER_PORTAL);
    ItemMeta portalsm = portal.getItemMeta();
    portalsm.setDisplayName("§6CoolerPvP");
    portal.setItemMeta(portalsm);
    
    ItemStack vine = new ItemStack(Material.VINE);
    ItemMeta vinesm = vine.getItemMeta();
    vinesm.setDisplayName("§6CoolerPvP");
    vine.setItemMeta(vinesm);
    
    ItemStack iron = new ItemStack(Material.IRON_FENCE);
    ItemMeta ironsm = iron.getItemMeta();
    ironsm.setDisplayName("§6CoolerPvP");
    iron.setItemMeta(ironsm);
    
    ItemStack book = new ItemStack(Material.BOOK);
    ItemMeta booksm = iron.getItemMeta();
    booksm.setDisplayName("§6Warps");
    book.setItemMeta(booksm);
    
    ItemStack chest = new ItemStack(Material.CHEST);
    ItemMeta chestsm = iron.getItemMeta();
    chestsm.setDisplayName("§6Seus Kit");
    chest.setItemMeta(chestsm);
    
    ItemStack vip = new ItemStack(Material.DIAMOND);
    ItemMeta vipsm = vip.getItemMeta();
    vipsm.setDisplayName("§6Loja");
    vip.setItemMeta(vipsm);
    
    ItemStack vidro = new ItemStack(Material.THIN_GLASS);
    ItemMeta vidrosm = vip.getItemMeta();
    vipsm.setDisplayName("§6Loja");
    vip.setItemMeta(vipsm);
    
    player.getInventory().setItem(0, portal);
    player.getInventory().setItem(1, vine);
    player.getInventory().setItem(2, iron);
    player.getInventory().setItem(3, book);
    player.getInventory().setItem(4, chest);
    player.getInventory().setItem(5, vip);
    player.getInventory().setItem(6, iron);
    player.getInventory().setItem(7, vine);
    player.getInventory().setItem(8, portal);;
    player.getInventory().setItem(9, vidro);
    player.getInventory().setItem(10, vidro);
    player.getInventory().setItem(11, vidro);
    player.getInventory().setItem(12, vidro);
    player.getInventory().setItem(13, vidro);
    player.getInventory().setItem(14, vidro);
    player.getInventory().setItem(15, vidro);
    player.getInventory().setItem(16, vidro);
    player.getInventory().setItem(17, vidro);
    player.getInventory().setItem(18, vidro);
    player.getInventory().setItem(19, vidro);
	player.getInventory().setItem(20, vidro);
	player.getInventory().setItem(21, vidro);
	player.getInventory().setItem(22, vidro);
	player.getInventory().setItem(23, vidro);
	player.getInventory().setItem(24, vidro);
	player.getInventory().setItem(25, vidro);
	player.getInventory().setItem(26, vidro);
	player.getInventory().setItem(27, vidro);
	player.getInventory().setItem(28, vidro);
	player.getInventory().setItem(29, vidro);
	player.getInventory().setItem(30, vidro);
	player.getInventory().setItem(31, vidro);
	player.getInventory().setItem(32, vidro);
	player.getInventory().setItem(33, vidro);
	player.getInventory().setItem(34, vidro);
	player.getInventory().setItem(35, vidro);
    player.teleport(player.getWorld().getSpawnLocation());
  }
}