package CoolerPvP.Comandos;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.craftbukkit.v1_7_R4.entity.CraftPlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.util.Vector;

public class Admin
  implements Listener, CommandExecutor
{
  @SuppressWarnings({ "unchecked", "rawtypes" })
public ArrayList<Player> adminmode = new ArrayList();
@SuppressWarnings({ "unchecked", "rawtypes" })
private ArrayList<Player> vanished = new ArrayList();
  @SuppressWarnings("unused")
private String[] args;
  
  @EventHandler
  public void Invsee(PlayerInteractEntityEvent e)
  {
    if ((e.getRightClicked() instanceof Player))
    {
      Player r = (Player)e.getRightClicked();
      Player p = e.getPlayer();
      Material item = p.getInventory().getItemInHand().getType();
      if ((item == Material.MAGMA_CREAM) && 
        (this.adminmode.contains(p)))
      {
        Inventory clickedinv = r.getInventory();
        p.openInventory(clickedinv);
        p.sendMessage("§7Inventario de: " + ChatColor.RED + r.getName() + "§7 Aberto.");
        p.playSound(p.getLocation(), Sound.CHEST_OPEN, 1.0F, 1.0F);
      }
    }
  }
  
  @EventHandler
  public void nofall(PlayerInteractEntityEvent e)
  {
    if (!(e.getRightClicked() instanceof Player)) {
      return;
    }
    Player p = e.getPlayer();
    Player r = (Player)e.getRightClicked();
    Material item = p.getInventory().getItemInHand().getType();
    if ((item == Material.FEATHER) && 
      (this.adminmode.contains(p)))
    {
      Vector vector = p.getEyeLocation().getDirection();
      vector.multiply(0.0F);
      vector.setY(1.5F);
      r.setVelocity(vector);
    }
  }
  
  @EventHandler
  public void knockback(PlayerInteractEntityEvent e)
  {
    if (!(e.getRightClicked() instanceof Player)) {
      return;
    }
    Player p = e.getPlayer();
    Player r = (Player)e.getRightClicked();
    Material item = p.getInventory().getItemInHand().getType();
    if ((item == Material.BONE) && 
      (this.adminmode.contains(p)))
    {
      r.setFallDistance(-3.0F);
      Vector vector = p.getEyeLocation().getDirection();
      vector.multiply(1.15F);
      vector.setY(0.55D);
      r.setVelocity(vector);
    }
  }
  
  @EventHandler
  public void autosoup(PlayerInteractEntityEvent e)
  {
    if (!(e.getRightClicked() instanceof Player)) {
      return;
    }
    Player p = e.getPlayer();
    Player r = (Player)e.getRightClicked();
    Material item = p.getInventory().getItemInHand().getType();
    if ((item == Material.BOWL) && 
      (this.adminmode.contains(p)))
    {
      r.setHealth(13.5D);
      p.playSound(p.getLocation(), Sound.NOTE_PLING, 1.0F, 1.0F);
    }
  }
  
  @EventHandler
  public void info(PlayerInteractEntityEvent e)
  {
    if (!(e.getRightClicked() instanceof Player)) {
      return;
    }
    Player p = e.getPlayer();
    Player r = (Player)e.getRightClicked();
    Material item = p.getInventory().getItemInHand().getType();
    @SuppressWarnings("unused")
	ItemStack[] aaa = r.getInventory().getContents();
    if ((item == Material.BLAZE_ROD) && 
      (this.adminmode.contains(p)))
    {
      p.sendMessage("§7=====§aInfo§7=====");
      p.sendMessage("§7Nick -> §9" + r.getName());
      p.sendMessage("§7HP -> §9" + ((CraftPlayer)r).getHealth() / 2.0D * 10.0D + "%");
      p.sendMessage("§7Fome ->§9 " + r.getFoodLevel() / 2 * 10 + "%");
      p.sendMessage("§7Gamemode ->§9 " + r.getGameMode());
    }
  }
  
  @EventHandler
  public void Stickff(PlayerInteractEntityEvent e)
  {
    if (!(e.getRightClicked() instanceof Player)) {
      return;
    }
    Player p = e.getPlayer();
    Player r = (Player)e.getRightClicked();
    Material item = p.getInventory().getItemInHand().getType();
    if ((item == Material.STICK) && 
      (this.adminmode.contains(p))) {
      p.performCommand("f " + r.getName());
    }
  }
  
  public void onDisable() {}
  
  public String color(String string)
  {
    return string.replace("&", "§");
  }
  
  @SuppressWarnings({ "unchecked", "rawtypes", "deprecation" })
public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] argsStrings)
  {
    Player p = (Player)sender;
    if (commandLabel.equalsIgnoreCase("admin"))
    {
      ArrayList sticklore;
      ItemStack binfo;
      ItemMeta inf;
      if (!this.vanished.contains(p))
      {
          Player[] onlinePlayers = Bukkit.getServer().getOnlinePlayers();
      	for (int i = 0; i < onlinePlayers.length; i++) {
      		Player pl = onlinePlayers[i];
      		pl.hidePlayer(p);
      	} 
        this.vanished.add(p);
        this.adminmode.add(p);
        ItemStack stickff = new ItemStack(Material.STICK);
        ItemMeta ff = stickff.getItemMeta();
        ff.setDisplayName("§aForceField");
        sticklore = new ArrayList();
        sticklore.add("§6Clique com direito no jogador.");
        sticklore.add("§6Para testar se o jogador usa FF.");
        ff.setLore(sticklore);
        stickff.setItemMeta(ff);
        binfo = new ItemStack(Material.BLAZE_ROD);
        inf = binfo.getItemMeta();
        inf.setDisplayName("§aInfo");
        ArrayList infolore = new ArrayList();
        infolore.add("§6Clique com direito no jogador.");
        infolore.add("§6Para ver informaçoes sobre ele.");
        inf.setLore(infolore);
        binfo.setItemMeta(inf);
        ItemStack asoup = new ItemStack(Material.BOWL);
        ItemMeta soup = binfo.getItemMeta();
        soup.setDisplayName("§aAuto-Soup");
        ArrayList asouplore = new ArrayList();
        asouplore.add("§6Clique com direito no jogador.");
        asouplore.add("§6Para Testar se o jogador usa Auto-Soup.");
        soup.setLore(asouplore);
        asoup.setItemMeta(soup);
        ItemStack knock = new ItemStack(Material.BONE);
        ItemMeta kno = knock.getItemMeta();
        kno.setDisplayName("§aKnockback");
        ArrayList knocklore = new ArrayList();
        knocklore.add("§6Clique com direito no jogador.");
        knocklore.add("§6Para Testar se o jogador usa Knockback.");
        kno.setLore(knocklore);
        knock.setItemMeta(kno);
        ItemStack nofall = new ItemStack(Material.FEATHER);
        ItemMeta nof = nofall.getItemMeta();
        nof.setDisplayName("§aNoFall");
        ArrayList noflore = new ArrayList();
        noflore.add("§6Clique com direito no jogador.");
        noflore.add("§6Para Testar se o jogador usa NoFall.");
        nof.setLore(noflore);
        nofall.setItemMeta(nof);
        ItemStack invsee = new ItemStack(Material.MAGMA_CREAM);
        ItemMeta inv = invsee.getItemMeta();
        inv.setDisplayName("§aInvsee");
        ArrayList invlore = new ArrayList();
        invlore.add("§6Clique com direito no jogador.");
        invlore.add("§6Para Abrir o Inventario.");
        inv.setLore(invlore);
        invsee.setItemMeta(inv);
        p.getInventory().setItem(0, stickff);
        p.getInventory().setItem(7, knock);
        p.getInventory().setItem(2, invsee);
        p.getInventory().setItem(3, nofall);
        p.getInventory().setItem(5, nofall);
        p.getInventory().setItem(6, invsee);
        p.getInventory().setItem(8, binfo);
        p.getInventory().setItem(1, asoup);
        p.setGameMode(GameMode.CREATIVE);
        return true;
      }
      this.vanished.remove(p);
      this.adminmode.remove(p);
      Inventory inv = p.getInventory();
      inv.clear();
      p.setGameMode(GameMode.SURVIVAL);
      for (Player pl : Bukkit.getServer().getOnlinePlayers()) {
          pl.showPlayer(p);
        }
      return true;
    }
    return false;
  }
}
