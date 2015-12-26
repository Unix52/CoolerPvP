package CoolerPvP.Habilidades;

import CoolerPvP.Main.Main;
import com.sk89q.worldguard.bukkit.WorldGuardPlugin;
import com.sk89q.worldguard.protection.ApplicableRegionSet;
import com.sk89q.worldguard.protection.flags.DefaultFlag;
import com.sk89q.worldguard.protection.managers.RegionManager;
import java.util.ArrayList;
import java.util.HashMap;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Server;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitScheduler;
import org.bukkit.util.Vector;

public class Jumper
  implements Listener
{
  public Plugin plugin;
  
  public Jumper(Main plugin)
  {
    this.plugin = plugin;
  }
  
  int cool = 10;
  public static ArrayList<String> jumperkit = new ArrayList();
  public static ArrayList<String> kitjumper = new ArrayList();
  public static HashMap<String, Long> jcool = new HashMap();
  ArrayList<Block> blockList = new ArrayList();
  
  @EventHandler(priority=EventPriority.HIGHEST)
  public void onPlayerJumper(PlayerInteractEvent e)
  {
    final Player p = e.getPlayer();
    if ((!Main.jumper.contains(p.getName())) || 
    
      (p.getItemInHand().getType() == Material.PUMPKIN))
    {
      if ((e.getAction() == Action.RIGHT_CLICK_BLOCK) || (e.getAction() == Action.RIGHT_CLICK_AIR))
      {
        WorldGuardPlugin worldGuard = Main.getWorldGuard();
        RegionManager regionManager = worldGuard.getRegionManager(p.getWorld());
        ApplicableRegionSet set = regionManager.getApplicableRegions(p.getLocation());
        if (set.allows(DefaultFlag.PVP))
        {
          if (jcool.containsKey(p.getName()))
          {
            long seconds = ((Long)jcool.get(p.getName())).longValue() / 1000L + this.cool - System.currentTimeMillis() / 1000L;
            
            e.setCancelled(true);
            p.updateInventory();
            p.sendMessage(ChatColor.RED + "Voce pode usar sua habilidade novamente em " + seconds + " segundos");
            return;
          }
          jcool.put(p.getName(), Long.valueOf(System.currentTimeMillis()));
          e.setCancelled(true);
          p.updateInventory();
          Vector v = p.getLocation().getDirection().multiply(0).setY(2.0D);
          p.setVelocity(v);
          jumperkit.add(p.getName());
          kitjumper.add(p.getName());
          Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(this.plugin, new Runnable()
          {
            public void run()
            {
              Jumper.jcool.remove(p.getName());
            }
          }, 200L);
        }
        else
        {
          p.sendMessage(ChatColor.DARK_GREEN + "Voce pode usar sua habilidade somente em PvP");
        }
        return;
      }
      return;
    }
  }
  
  @EventHandler(priority=EventPriority.HIGHEST)
  public void onPlayerJumperLeftClick(PlayerInteractEvent e)
  {
    Player p = e.getPlayer();
    if ((!Main.jumper.contains(p.getName())) || 
    
      (p.getItemInHand().getType() == Material.PUMPKIN))
    {
      if (e.getAction() == Action.LEFT_CLICK_AIR)
      {
        if ((jumperkit.contains(p.getName())) && (kitjumper.contains(p.getName())))
        {
          e.setCancelled(true);
          kitjumper.remove(p.getName());
          Vector v = p.getLocation().getDirection().multiply(2.0D);
          p.setVelocity(v);
          return;
        }
        return;
      }
      return;
    }
  }
  
  @EventHandler
  public void onPlayerJumperFall(EntityDamageEvent e)
  {
    if (!(e.getEntity() instanceof Player)) {
      return;
    }
    Player p = (Player)e.getEntity();
    if (e.getCause() == EntityDamageEvent.DamageCause.FALL)
    {
      if (jumperkit.contains(p.getName()))
      {
        WorldGuardPlugin worldGuard = Main.getWorldGuard();
        RegionManager regionManager = worldGuard.getRegionManager(p.getWorld());
        ApplicableRegionSet set = regionManager.getApplicableRegions(p.getLocation());
        if (set.allows(DefaultFlag.PVP))
        {
          for (Entity plr : p.getNearbyEntities(8.0D, 8.0D, 8.0D)) {
            if ((plr instanceof Player))
            {
              Player pla = (Player)plr;
              Vector v = p.getLocation().getDirection().multiply(0).setY(2.0D);
              pla.setVelocity(v);
              pla.playSound(pla.getLocation(), Sound.EXPLODE, 4.0F, 4.0F);
              p.playSound(p.getLocation(), Sound.EXPLODE, 4.0F, 4.0F);
            }
          }
          jumperkit.remove(p.getName());
          e.setDamage(9.0D);
          return;
        }
        p.sendMessage(ChatColor.RED + "Voce so pode usar sua habilidade em area PvP!");
        return;
      }
      return;
    }
  }
}
