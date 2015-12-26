package CoolerPvP.Listener;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Bat;
import org.bukkit.entity.Blaze;
import org.bukkit.entity.CaveSpider;
import org.bukkit.entity.Chicken;
import org.bukkit.entity.Cow;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.EnderDragon;
import org.bukkit.entity.Enderman;
import org.bukkit.entity.Ghast;
import org.bukkit.entity.Horse;
import org.bukkit.entity.MagmaCube;
import org.bukkit.entity.MushroomCow;
import org.bukkit.entity.Ocelot;
import org.bukkit.entity.PigZombie;
import org.bukkit.entity.Player;
import org.bukkit.entity.Sheep;
import org.bukkit.entity.Silverfish;
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.Slime;
import org.bukkit.entity.Spider;
import org.bukkit.entity.Squid;
import org.bukkit.entity.Villager;
import org.bukkit.entity.Witch;
import org.bukkit.entity.Wither;
import org.bukkit.entity.Wolf;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.weather.WeatherChangeEvent;
import org.bukkit.help.HelpTopic;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;

import com.sk89q.worldguard.bukkit.WorldGuardPlugin;

import CoolerPvP.Main.Main;

public class Util
  implements Listener
{
 public static ItemStack kits = new ItemStack(Material.CHEST);
	  @SuppressWarnings("unused")
	@EventHandler
	  public void onUnknown(PlayerCommandPreprocessEvent event)
	  {
	    if (event.isCancelled()) {
	      return;
	    }
	    Player p = event.getPlayer();
	    
	    String msg = event.getMessage().split(" ")[0];
	    
	    HelpTopic topic = Bukkit.getServer().getHelpMap().getHelpTopic(msg);
	    if (topic == null)
	    {
	      event.setCancelled(true);
	    }
	  }
	  public Util(Main main) {
		// TODO Auto-generated constructor stub
	}
	  @EventHandler
	  public void nohunger(FoodLevelChangeEvent event)
	  {
	    event.setCancelled(true);
	    event.setFoodLevel(20);
	  }
	  
	  @EventHandler
	  public void noRain(WeatherChangeEvent event)
	  {
	    event.setCancelled(true);
	  }

	  @EventHandler(priority=EventPriority.HIGH)
	  public void onCreeperExplosion(EntityExplodeEvent event)
	  {
	    event.setCancelled(true);
	  }
	  @EventHandler
	  public void onCreeperSpawn(CreatureSpawnEvent e)
	  {
	    if ((e.getEntity() instanceof Creeper)) {
	      e.setCancelled(true);
	    }
	  }
	  
	  @EventHandler
	  public void onSkeletonSpawn(CreatureSpawnEvent e)
	  {
	    if ((e.getEntity() instanceof Skeleton)) {
	      e.setCancelled(true);
	    }
	  }
	  
	  @EventHandler
	  public void onSpiderSpawn(CreatureSpawnEvent e)
	  {
	    if ((e.getEntity() instanceof Spider)) {
	      e.setCancelled(true);
	    }
	  }
	  
	  @EventHandler
	  public void onWitherSpawn(CreatureSpawnEvent e)
	  {
	    if ((e.getEntity() instanceof Wither)) {
	      e.setCancelled(true);
	    }
	  }
	  
	  @EventHandler
	  public void onZombieSpawn(CreatureSpawnEvent e)
	  {
	    if ((e.getEntity() instanceof Zombie)) {
	      e.setCancelled(true);
	    }
	  }
	  
	  @EventHandler
	  public void onSlimeSpawn(CreatureSpawnEvent e)
	  {
	    if ((e.getEntity() instanceof Slime)) {
	      e.setCancelled(true);
	    }
	  }
	  
	  @EventHandler
	  public void onGhastSpawn(CreatureSpawnEvent e)
	  {
	    if ((e.getEntity() instanceof Ghast)) {
	      e.setCancelled(true);
	    }
	  }
	  
	  @EventHandler
	  public void onPigZombieSpawn(CreatureSpawnEvent e)
	  {
	    if ((e.getEntity() instanceof PigZombie)) {
	      e.setCancelled(true);
	    }
	  }
	  
	  @EventHandler
	  public void onEndermanSpawn(CreatureSpawnEvent e)
	  {
	    if ((e.getEntity() instanceof Enderman)) {
	      e.setCancelled(true);
	    }
	  }
	  
	  @EventHandler
	  public void onCaveSpiderSpawn(CreatureSpawnEvent e)
	  {
	    if ((e.getEntity() instanceof CaveSpider)) {
	      e.setCancelled(true);
	    }
	  }
	  
	  @EventHandler
	  public void onSilverfishSpawn(CreatureSpawnEvent e)
	  {
	    if ((e.getEntity() instanceof Silverfish)) {
	      e.setCancelled(true);
	    }
	  }
	  
	  @EventHandler
	  public void onBlazeSpawn(CreatureSpawnEvent e)
	  {
	    if ((e.getEntity() instanceof Blaze)) {
	      e.setCancelled(true);
	    }
	  }
	  
	  @EventHandler
	  public void onMagmaCubeSpawn(CreatureSpawnEvent e)
	  {
	    if ((e.getEntity() instanceof MagmaCube)) {
	      e.setCancelled(true);
	    }
	  }
	  
	  @EventHandler
	  public void onBatSpawn(CreatureSpawnEvent e)
	  {
	    if ((e.getEntity() instanceof Bat)) {
	      e.setCancelled(true);
	    }
	  }
	  
	  @EventHandler
	  public void onWitchSpawn(CreatureSpawnEvent e)
	  {
	    if ((e.getEntity() instanceof Witch)) {
	      e.setCancelled(true);
	    }
	  }
	  
	  @EventHandler
	  public void onSheepSpawn(CreatureSpawnEvent e)
	  {
	    if ((e.getEntity() instanceof Sheep)) {
	      e.setCancelled(true);
	    }
	  }
	  
	  @EventHandler
	  public void onCowSpawn(CreatureSpawnEvent e)
	  {
	    if ((e.getEntity() instanceof Cow)) {
	      e.setCancelled(true);
	    }
	  }
	  
	  @EventHandler
	  public void onChickenSpawn(CreatureSpawnEvent e)
	  {
	    if ((e.getEntity() instanceof Chicken)) {
	      e.setCancelled(true);
	    }
	  }
	  
	  @EventHandler
	  public void onSquidSpawn(CreatureSpawnEvent e)
	  {
	    if ((e.getEntity() instanceof Squid)) {
	      e.setCancelled(true);
	    }
	  }
	  
	  @EventHandler
	  public void onWolfSpawn(CreatureSpawnEvent e)
	  {
	    if ((e.getEntity() instanceof Wolf)) {
	      e.setCancelled(true);
	    }
	  }
	  
	  @EventHandler
	  public void onMooshroomSpawn(CreatureSpawnEvent e)
	  {
	    if ((e.getEntity() instanceof MushroomCow)) {
	      e.setCancelled(true);
	    }
	  }
	  
	  @EventHandler
	  public void onOcelotSpawn(CreatureSpawnEvent e)
	  {
	    if ((e.getEntity() instanceof Ocelot)) {
	      e.setCancelled(true);
	    }
	  }
	  
	  @EventHandler
	  public void onVillagerSpawn(CreatureSpawnEvent e)
	  {
	    if ((e.getEntity() instanceof Villager)) {
	      e.setCancelled(false);
	    }
	  }
	  
	  @EventHandler
	  public void onHorseSpawn(CreatureSpawnEvent e)
	  {
	    if ((e.getEntity() instanceof Horse)) {
	      e.setCancelled(false);
	    }
	  }
	  
	  @EventHandler
	  public void onEnderDragonSpawn(CreatureSpawnEvent e)
	  {
	    if ((e.getEntity() instanceof EnderDragon)) {
	      e.setCancelled(true);
	    }
	  }
	      public boolean onCommand(CommandSender sender, Command command, String cmd, String[] args)
	      {
	        if (!(sender instanceof Player))
	        {
	          sender.sendMessage("[UltraKits] Comando apenas para players in-game.");
	          return true;
	        }
	        Player p = (Player)sender;
	        if (cmd.equalsIgnoreCase("kit"))
	        {
	          if (args.length == 0)
	          {
	            MenuInv.guiKits(p);
	            return true;
	          }
	          if (args.length == 1)
	          {
	            if (kits.contains(p.getName()))
	            {
	              p.sendMessage(ChatColor.RED + "Voce ja esta utilizando um kit!");
	              p.playSound(p.getLocation(), Sound.NOTE_BASS, 1.0F, 1.0F);
	              return true;
	            }
	            if (args[0].equalsIgnoreCase("pvp"))
	            {
	              if ((!p.hasPermission("kit.pvp")) && (!p.hasPermission("kit.*")))
	              {
	                p.sendMessage(plugin.getConfig().getString("MensagemSemKit").replaceAll("&", "§"));
	                p.playSound(p.getLocation(), Sound.NOTE_BASS, 1.0F, 1.0F);
	                return true;
	              }
	              KitItems.kitPvP(p);
	            }
	            if (args[0].equalsIgnoreCase("arqueiro"))
	            {
	              if ((!p.hasPermission("kit.arqueiro")) && (!p.hasPermission("kit.*")))
	              {
	                p.sendMessage(plugin.getConfig().getString("MensagemSemKit").replaceAll("&", "§"));
	                p.playSound(p.getLocation(), Sound.NOTE_BASS, 1.0F, 1.0F);
	                return true;
	              }
	              KitItems.kitArcher(p);
	            }
	            if (args[0].equalsIgnoreCase("urgal"))
	            {
	              if ((!p.hasPermission("kit.urgal")) && (!p.hasPermission("kit.*")))
	              {
	                p.sendMessage(plugin.getConfig().getString("MensagemSemKit").replaceAll("&", "§"));
	                p.playSound(p.getLocation(), Sound.NOTE_BASS, 1.0F, 1.0F);
	                return true;
	              }
	              KitItems.kitUrgal(p);
	            }
	            if (args[0].equalsIgnoreCase("shooter"))
	            {
	              if ((!p.hasPermission("kit.shooter")) && (!p.hasPermission("kit.*")))
	              {
	                p.sendMessage(plugin.getConfig().getString("MensagemSemKit").replaceAll("&", "§"));
	                p.playSound(p.getLocation(), Sound.NOTE_BASS, 1.0F, 1.0F);
	                return true;
	              }
	              KitItems.kitShooter(p);
	            }
	            if (args[0].equalsIgnoreCase("pyro"))
	            {
	              if ((!p.hasPermission("kit.pyro")) && (!p.hasPermission("kit.*")))
	              {
	                p.sendMessage(plugin.getConfig().getString("MensagemSemKit").replaceAll("&", "§"));
	                p.playSound(p.getLocation(), Sound.NOTE_BASS, 1.0F, 1.0F);
	                return true;
	              }
	              KitItems.kitpyro(p);
	            }
	            if (args[0].equalsIgnoreCase("trocador"))
	            {
	              if ((!p.hasPermission("kit.trocador")) && (!p.hasPermission("kit.*")))
	              {
	                p.sendMessage(plugin.getConfig().getString("MensagemSemKit").replaceAll("&", "§"));
	                p.playSound(p.getLocation(), Sound.NOTE_BASS, 1.0F, 1.0F);
	                return true;
	              }
	              KitItems.kitTrocador(p);
	            }
	            if (args[0].equalsIgnoreCase("soldado"))
	            {
	              if ((!p.hasPermission("kit.soldado")) && (!p.hasPermission("kit.*")))
	              {
	                p.sendMessage(plugin.getConfig().getString("MensagemSemKit").replaceAll("&", "§"));
	                p.playSound(p.getLocation(), Sound.NOTE_BASS, 1.0F, 1.0F);
	                return true;
	              }
	              KitItems.kitSoldado(p);
	            }
	            if (args[0].equalsIgnoreCase("viper"))
	            {
	              if ((!p.hasPermission("kit.viper")) && (!p.hasPermission("kit.*")))
	              {
	                p.sendMessage(plugin.getConfig().getString("MensagemSemKit").replaceAll("&", "§"));
	                p.playSound(p.getLocation(), Sound.NOTE_BASS, 1.0F, 1.0F);
	                return true;
	              }
	              KitItems.kitViper(p);
	            }
	            if (args[0].equalsIgnoreCase("ninja"))
	            {
	              if ((!p.hasPermission("kit.ninja")) && (!p.hasPermission("kit.*")))
	              {
	                p.sendMessage(plugin.getConfig().getString("MensagemSemKit").replaceAll("&", "§"));
	                p.playSound(p.getLocation(), Sound.NOTE_BASS, 1.0F, 1.0F);
	                return true;
	              }
	              KitItems.kitNinja(p);
	            }
	            if (args[0].equalsIgnoreCase("anchor"))
	            {
	              if ((!p.hasPermission("kit.anchor")) && (!p.hasPermission("kit.*")))
	              {
	                p.sendMessage(plugin.getConfig().getString("MensagemSemKit").replaceAll("&", "§"));
	                p.playSound(p.getLocation(), Sound.NOTE_BASS, 1.0F, 1.0F);
	                return true;
	              }
	              KitItems.kitAnchor(p);
	            }
	            if (args[0].equalsIgnoreCase("granadier"))
	            {
	              if ((!p.hasPermission("kit.granadier")) && (!p.hasPermission("kit.*")))
	              {
	                p.sendMessage(plugin.getConfig().getString("MensagemSemKit").replaceAll("&", "§"));
	                p.playSound(p.getLocation(), Sound.NOTE_BASS, 1.0F, 1.0F);
	                return true;
	              }
	              KitItems.kitGranadier(p);
	            }
	            if (args[0].equalsIgnoreCase("switcher"))
	            {
	              if ((!p.hasPermission("kit.switcher")) && (!p.hasPermission("kit.*")))
	              {
	                p.sendMessage(plugin.getConfig().getString("MensagemSemKit").replaceAll("&", "§"));
	                p.playSound(p.getLocation(), Sound.NOTE_BASS, 1.0F, 1.0F);
	                return true;
	              }
	              KitItems.kitSwitcher(p);
	            }
	            if (args[0].equalsIgnoreCase("darkmage"))
	            {
	              if ((!p.hasPermission("kit.darkmage")) && (!p.hasPermission("kit.*")))
	              {
	                p.sendMessage(plugin.getConfig().getString("MensagemSemKit").replaceAll("&", "§"));
	                p.playSound(p.getLocation(), Sound.NOTE_BASS, 1.0F, 1.0F);
	                return true;
	              }
	              KitItems.kitDarkmage(p);
	            }
	            if (args[0].equalsIgnoreCase("thor"))
	            {
	              if ((!p.hasPermission("kit.thor")) && (!p.hasPermission("kit.*")))
	              {
	                p.sendMessage(plugin.getConfig().getString("MensagemSemKit").replaceAll("&", "§"));
	                p.playSound(p.getLocation(), Sound.NOTE_BASS, 1.0F, 1.0F);
	                return true;
	              }
	              KitItems.kitThor(p);
	            }
	            if (args[0].equalsIgnoreCase("specialist"))
	            {
	              if ((!p.hasPermission("kit.specialist")) && (!p.hasPermission("kit.*")))
	              {
	                p.sendMessage(plugin.getConfig().getString("MensagemSemKit").replaceAll("&", "§"));
	                p.playSound(p.getLocation(), Sound.NOTE_BASS, 1.0F, 1.0F);
	                return true;
	              }
	              KitItems.kitSpecialist(p);
	            }
	            if (args[0].equalsIgnoreCase("launcher"))
	            {
	              if ((!p.hasPermission("kit.launcher")) && (!p.hasPermission("kit.*")))
	              {
	                p.sendMessage(plugin.getConfig().getString("MensagemSemKit").replaceAll("&", "§"));
	                p.playSound(p.getLocation(), Sound.NOTE_BASS, 1.0F, 1.0F);
	                return true;
	              }
	              KitItems.kitlauncher(p);
	            }
	            if (args[0].equalsIgnoreCase("milkman"))
	            {
	              if ((!p.hasPermission("kit.milkman")) && (!p.hasPermission("kit.*")))
	              {
	                p.sendMessage(plugin.getConfig().getString("MensagemSemKit").replaceAll("&", "§"));
	                p.playSound(p.getLocation(), Sound.NOTE_BASS, 1.0F, 1.0F);
	                return true;
	              }
	              KitItems.kitmilkman(p);
	            }
	            if (args[0].equalsIgnoreCase("skeleton"))
	            {
	              if ((!p.hasPermission("kit.skeleton")) && (!p.hasPermission("kit.*")))
	              {
	                p.sendMessage(plugin.getConfig().getString("MensagemSemKit").replaceAll("&", "§"));
	                p.playSound(p.getLocation(), Sound.NOTE_BASS, 1.0F, 1.0F);
	                return true;
	              }
	              KitItems.kitskeleton(p);
	            }
	            if (args[0].equalsIgnoreCase("fisherman"))
	            {
	              if ((!p.hasPermission("kit.fisherman")) && (!p.hasPermission("kit.*")))
	              {
	                p.sendMessage(plugin.getConfig().getString("MensagemSemKit").replaceAll("&", "§"));
	                p.playSound(p.getLocation(), Sound.NOTE_BASS, 1.0F, 1.0F);
	                return true;
	              }
	              KitItems.kitFisherman(p);
	            }
	            if (args[0].equalsIgnoreCase("phantom"))
	            {
	              if ((!p.hasPermission("kit.phantom")) && (!p.hasPermission("kit.*")))
	              {
	                p.sendMessage(plugin.getConfig().getString("MensagemSemKit").replaceAll("&", "§"));
	                p.playSound(p.getLocation(), Sound.NOTE_BASS, 1.0F, 1.0F);
	                return true;
	              }
	              KitItems.kitPhantom(p);
	            }
	            if (args[0].equalsIgnoreCase("gladiator"))
	            {
	              if ((!p.hasPermission("kit.gladiator")) && (!p.hasPermission("kit.*")))
	              {
	                p.sendMessage(plugin.getConfig().getString("MensagemSemKit").replaceAll("&", "§"));
	                p.playSound(p.getLocation(), Sound.NOTE_BASS, 1.0F, 1.0F);
	                return true;
	              }
	              KitItems.kitGladiator(p);
	            }
	            if (args[0].equalsIgnoreCase("flash"))
	            {
	              if ((!p.hasPermission("kit.flash")) && (!p.hasPermission("kit.*")))
	              {
	                p.sendMessage(plugin.getConfig().getString("MensagemSemKit").replaceAll("&", "§"));
	                p.playSound(p.getLocation(), Sound.NOTE_BASS, 1.0F, 1.0F);
	                return true;
	              }
	              KitItems.kitFlash(p);
	            }
	            if (args[0].equalsIgnoreCase("endermage"))
	            {
	              if ((!p.hasPermission("kit.endermage")) && (!p.hasPermission("kit.*")))
	              {
	                p.sendMessage(plugin.getConfig().getString("MensagemSemKit").replaceAll("&", "§"));
	                p.playSound(p.getLocation(), Sound.NOTE_BASS, 1.0F, 1.0F);
	                return true;
	              }
	              KitItems.kitEndermage(p);
	            }
	            if (args[0].equalsIgnoreCase("monk"))
	            {
	              if ((!p.hasPermission("kit.monk")) && (!p.hasPermission("kit.*")))
	              {
	                p.sendMessage(plugin.getConfig().getString("MensagemSemKit").replaceAll("&", "§"));
	                p.playSound(p.getLocation(), Sound.NOTE_BASS, 1.0F, 1.0F);
	                return true;
	              }
	              KitItems.kitMonk(p);
	            }
	            if (args[0].equalsIgnoreCase("camel"))
	            {
	              if ((!p.hasPermission("kit.camel")) && (!p.hasPermission("kit.*")))
	              {
	                p.sendMessage(plugin.getConfig().getString("MensagemSemKit").replaceAll("&", "§"));
	                p.playSound(p.getLocation(), Sound.NOTE_BASS, 1.0F, 1.0F);
	                return true;
	              }
	              KitItems.kitCamel(p);
	            }
	            if (args[0].equalsIgnoreCase("frosty"))
	            {
	              if ((!p.hasPermission("kit.frosty")) && (!p.hasPermission("kit.*")))
	              {
	                p.sendMessage(plugin.getConfig().getString("MensagemSemKit").replaceAll("&", "§"));
	                p.playSound(p.getLocation(), Sound.NOTE_BASS, 1.0F, 1.0F);
	                return true;
	              }
	              KitItems.kitFrosty(p);
	            }
	            if (args[0].equalsIgnoreCase("wither"))
	            {
	              if ((!p.hasPermission("kit.wither")) && (!p.hasPermission("kit.*")))
	              {
	                p.sendMessage(plugin.getConfig().getString("MensagemSemKit").replaceAll("&", "§"));
	                p.playSound(p.getLocation(), Sound.NOTE_BASS, 1.0F, 1.0F);
	                return true;
	              }
	              KitItems.kitwither(p);
	            }
	            if (args[0].equalsIgnoreCase("poseidon"))
	            {
	              if ((!p.hasPermission("kit.poseidon")) && (!p.hasPermission("kit.*")))
	              {
	                p.sendMessage(plugin.getConfig().getString("MensagemSemKit").replaceAll("&", "§"));
	                p.playSound(p.getLocation(), Sound.NOTE_BASS, 1.0F, 1.0F);
	                return true;
	              }
	              KitItems.kitPoseidon(p);
	            }
	            if (args[0].equalsIgnoreCase("stomper"))
	            {
	              if ((!p.hasPermission("kit.stomper")) && (!p.hasPermission("kit.*")))
	              {
	                p.sendMessage(plugin.getConfig().getString("MensagemSemKit").replaceAll("&", "§"));
	                p.playSound(p.getLocation(), Sound.NOTE_BASS, 1.0F, 1.0F);
	                return true;
	              }
	              KitItems.kitstomper(p);
	            }
	            if (args[0].equalsIgnoreCase("reaper"))
	            {
	              if ((!p.hasPermission("kit.reaper")) && (!p.hasPermission("kit.*")))
	              {
	                p.sendMessage(plugin.getConfig().getString("MensagemSemKit").replaceAll("&", "§"));
	                p.playSound(p.getLocation(), Sound.NOTE_BASS, 1.0F, 1.0F);
	                return true;
	              }
	              KitItems.kitreaper(p);
	            }
	            if (args[0].equalsIgnoreCase("turtle"))
	            {
	              if ((!p.hasPermission("kit.turtle")) && (!p.hasPermission("kit.*")))
	              {
	                p.sendMessage(plugin.getConfig().getString("MensagemSemKit").replaceAll("&", "§"));
	                p.playSound(p.getLocation(), Sound.NOTE_BASS, 1.0F, 1.0F);
	                return true;
	              }
	              KitItems.kitturtle(p);
	            }
	            if (args[0].equalsIgnoreCase("jumper"))
	            {
	              if ((!p.hasPermission("kit.jumper")) && (!p.hasPermission("kit.*")))
	              {
	                p.sendMessage(plugin.getConfig().getString("MensagemSemKit").replaceAll("&", "§"));
	                p.playSound(p.getLocation(), Sound.NOTE_BASS, 1.0F, 1.0F);
	                return true;
	              }
	              KitItems.kitJumper(p);
	            }
	            if (args[0].equalsIgnoreCase("snail"))
	            {
	              if ((!p.hasPermission("kit.snail")) && (!p.hasPermission("kit.*")))
	              {
	                p.sendMessage(plugin.getConfig().getString("MensagemSemKit").replaceAll("&", "§"));
	                p.playSound(p.getLocation(), Sound.NOTE_BASS, 1.0F, 1.0F);
	                return true;
	              }
	              KitItems.kitSnail(p);
	            }
	            if (args[0].equalsIgnoreCase("fireman"))
	            {
	              if ((!p.hasPermission("kit.fireman")) && (!p.hasPermission("kit.*")))
	              {
	                p.sendMessage(plugin.getConfig().getString("MensagemSemKit").replaceAll("&", "§"));
	                p.playSound(p.getLocation(), Sound.NOTE_BASS, 1.0F, 1.0F);
	                return true;
	              }
	              KitItems.kitFireman(p);
	            }
	            if (args[0].equalsIgnoreCase("kangaroo"))
	            {
	              if ((!p.hasPermission("kit.kangaroo")) && (!p.hasPermission("kit.*")))
	              {
	                p.sendMessage(plugin.getConfig().getString("MensagemSemKit").replaceAll("&", "§"));
	                p.playSound(p.getLocation(), Sound.NOTE_BASS, 1.0F, 1.0F);
	                return true;
	              }
	              KitItems.kitKangaroo(p);
	            }
	            if (args[0].equalsIgnoreCase("viking"))
	            {
	              if ((!p.hasPermission("kit.viking")) && (!p.hasPermission("kit.*")))
	              {
	                p.sendMessage(plugin.getConfig().getString("MensagemSemKit").replaceAll("&", "§"));
	                p.playSound(p.getLocation(), Sound.NOTE_BASS, 1.0F, 1.0F);
	                return true;
	              }
	              KitItems.kitViking(p);
	            }
	            if (args[0].equalsIgnoreCase("madman"))
	            {
	              if ((!p.hasPermission("kit.madman")) && (!p.hasPermission("kit.*")))
	              {
	                p.sendMessage(plugin.getConfig().getString("MensagemSemKit").replaceAll("&", "§"));
	                p.playSound(p.getLocation(), Sound.NOTE_BASS, 1.0F, 1.0F);
	                return true;
	              }
	              KitItems.kitMadman(p);
	            }
	            if (args[0].equalsIgnoreCase("grandpa"))
	            {
	              if ((!p.hasPermission("kit.grandpa")) && (!p.hasPermission("kit.*")))
	              {
	                p.sendMessage(plugin.getConfig().getString("MensagemSemKit").replaceAll("&", "§"));
	                p.playSound(p.getLocation(), Sound.NOTE_BASS, 1.0F, 1.0F);
	                return true;
	              }
	              KitItems.kitGrandpa(p);
	            }
	            if (args[0].equalsIgnoreCase("ghost"))
	            {
	              if ((!p.hasPermission("kit.ghost")) && (!p.hasPermission("kit.*")))
	              {
	                p.sendMessage(plugin.getConfig().getString("MensagemSemKit").replaceAll("&", "§"));
	                p.playSound(p.getLocation(), Sound.NOTE_BASS, 1.0F, 1.0F);
	                return true;
	              }
	              KitItems.kitGhost(p);
	            }
	            if (args[0].equalsIgnoreCase("teleporter"))
	            {
	              if ((!p.hasPermission("kit.teleporter")) && (!p.hasPermission("kit.*")))
	              {
	                p.sendMessage(plugin.getConfig().getString("MensagemSemKit").replaceAll("&", "§"));
	                p.playSound(p.getLocation(), Sound.NOTE_BASS, 1.0F, 1.0F);
	                return true;
	              }
	              KitItems.kitTeleporter(p);
	            }
	            if (args[0].equalsIgnoreCase("spiderman"))
	            {
	              if ((!p.hasPermission("kit.spiderman")) && (!p.hasPermission("kit.*")))
	              {
	                p.sendMessage(plugin.getConfig().getString("MensagemSemKit").replaceAll("&", "§"));
	                p.playSound(p.getLocation(), Sound.NOTE_BASS, 1.0F, 1.0F);
	                return true;
	              }
	              KitItems.kitSpiderman(p);
	            }
	            if (args[0].equalsIgnoreCase("barbarian"))
	            {
	              if ((!p.hasPermission("kit.barbarian")) && (!p.hasPermission("kit.*")))
	              {
	                p.sendMessage(plugin.getConfig().getString("MensagemSemKit").replaceAll("&", "§"));
	                p.playSound(p.getLocation(), Sound.NOTE_BASS, 1.0F, 1.0F);
	                return true;
	              }
	              KitItems.kitBarbarian(p);
	            }
	            if (args[0].equalsIgnoreCase("berserker"))
	            {
	              if ((!p.hasPermission("kit.berserker")) && (!p.hasPermission("kit.*")))
	              {
	                p.sendMessage(plugin.getConfig().getString("MensagemSemKit").replaceAll("&", "§"));
	                p.playSound(p.getLocation(), Sound.NOTE_BASS, 1.0F, 1.0F);
	                return true;
	              }
	              KitItems.kitBerserker(p);
	            }
	            if (args[0].equalsIgnoreCase("indio"))
	            {
	              if ((!p.hasPermission("kit.indio")) && (!p.hasPermission("kit.*")))
	              {
	                p.sendMessage(plugin.getConfig().getString("MensagemSemKit").replaceAll("&", "§"));
	                p.playSound(p.getLocation(), Sound.NOTE_BASS, 1.0F, 1.0F);
	                return true;
	              }
	              KitItems.kitIndio(p);
	            }
	            if (args[0].equalsIgnoreCase("ryu"))
	            {
	              if ((!p.hasPermission("kit.ryu")) && (!p.hasPermission("kit.*")))
	              {
	                p.sendMessage(plugin.getConfig().getString("MensagemSemKit").replaceAll("&", "§"));
	                p.playSound(p.getLocation(), Sound.NOTE_BASS, 1.0F, 1.0F);
	                return true;
	              }
	              KitItems.kitRyu(p);
	            }
	            if (args[0].equalsIgnoreCase("neji"))
	            {
	              if ((!p.hasPermission("kit.neji")) && (!p.hasPermission("kit.*")))
	              {
	                p.sendMessage(plugin.getConfig().getString("MensagemSemKit").replaceAll("&", "§"));
	                p.playSound(p.getLocation(), Sound.NOTE_BASS, 1.0F, 1.0F);
	                return true;
	              }
	              KitItems.kitNeji(p);
	            }
	            if (args[0].equalsIgnoreCase("lobisomem"))
	            {
	              if ((!p.hasPermission("kit.lobisomem")) && (!p.hasPermission("kit.*")))
	              {
	                p.sendMessage(plugin.getConfig().getString("MensagemSemKit").replaceAll("&", "§"));
	                p.playSound(p.getLocation(), Sound.NOTE_BASS, 1.0F, 1.0F);
	                return true;
	              }
	              KitItems.kitLobisomem(p);
	            }
	            if (args[0].equalsIgnoreCase("rhino"))
	            {
	              if ((!p.hasPermission("kit.rhino")) && (!p.hasPermission("kit.*")))
	              {
	                p.sendMessage(plugin.getConfig().getString("MensagemSemKit").replaceAll("&", "§"));
	                p.playSound(p.getLocation(), Sound.NOTE_BASS, 1.0F, 1.0F);
	                return true;
	              }
	              KitItems.kitRhino(p);
	            }
	            if (args[0].equalsIgnoreCase("phantom"))
	            {
	              if ((!p.hasPermission("kit.phantom")) && (!p.hasPermission("kit.*")))
	              {
	                p.sendMessage(plugin.getConfig().getString("MensagemSemKit").replaceAll("&", "§"));
	                p.playSound(p.getLocation(), Sound.NOTE_BASS, 1.0F, 1.0F);
	                return true;
	              }
	              KitItems.kitPhantom(p);
	            }
	            if (args[0].equalsIgnoreCase("alien"))
	            {
	              if ((!p.hasPermission("kit.alien")) && (!p.hasPermission("kit.*")))
	              {
	                p.sendMessage(plugin.getConfig().getString("MensagemSemKit").replaceAll("&", "§"));
	                p.playSound(p.getLocation(), Sound.NOTE_BASS, 1.0F, 1.0F);
	                return true;
	              }
	              KitItems.kitAlien(p);
	            }
	            if (args[0].equalsIgnoreCase("hulk"))
	            {
	              if ((!p.hasPermission("kit.hulk")) && (!p.hasPermission("kit.*")))
	              {
	                p.sendMessage(plugin.getConfig().getString("MensagemSemKit").replaceAll("&", "§"));
	                p.playSound(p.getLocation(), Sound.NOTE_BASS, 1.0F, 1.0F);
	                return true;
	              }
	              KitItems.kitHulk(p);
	            }
	            if (args[0].equalsIgnoreCase("critical"))
	            {
	              if ((!p.hasPermission("kit.critical")) && (!p.hasPermission("kit.*")))
	              {
	                p.sendMessage(plugin.getConfig().getString("MensagemSemKit").replaceAll("&", "§"));
	                p.playSound(p.getLocation(), Sound.NOTE_BASS, 1.0F, 1.0F);
	                return true;
	              }
	              KitItems.kitCritical(p);
	            }
	            if (args[0].equalsIgnoreCase("quickdropper"))
	            {
	              if ((!p.hasPermission("kit.quickdropper")) && (!p.hasPermission("kit.*")))
	              {
	                p.sendMessage(plugin.getConfig().getString("MensagemSemKit").replaceAll("&", "§"));
	                p.playSound(p.getLocation(), Sound.NOTE_BASS, 1.0F, 1.0F);
	                return true;
	              }
	              KitItems.kitQuickDropper(p);
	            }
	            if (args[0].equalsIgnoreCase("vitality"))
	            {
	              if ((!p.hasPermission("kit.vitality")) && (!p.hasPermission("kit.*")))
	              {
	                p.sendMessage(plugin.getConfig().getString("MensagemSemKit").replaceAll("&", "§"));
	                p.playSound(p.getLocation(), Sound.NOTE_BASS, 1.0F, 1.0F);
	                return true;
	              }
	              KitItems.kitVitality(p);
	            }
	          }
	        }
	        else if (cmd.equalsIgnoreCase("kits"))
	        {
	          MenuInv.guiKits(p);
	          return true;
	        }
	        return false;
	      }
	      
	      @EventHandler
	      public void onPlayerInteract(PlayerInteractEvent e)
	      {
	        Player p = e.getPlayer();
	        if ((e.getAction() == Action.RIGHT_CLICK_AIR) || (e.getAction() == Action.RIGHT_CLICK_BLOCK)) {
	          if (p.getItemInHand().equals(CoolerPvP.Listener.Util.kits)) {
	            MenuInv.guiKits(p);
	          } else if (p.getItemInHand().equals(UltraKits.Eventos.Events.loja)) {
	            p.chat("/" + plugin.getConfig().getString("ComandoBuycraft"));
	          }
	        }
	      }
	      
	      public void setExecutor(String command, CommandExecutor executor)
	      {
	        getCommand(command).setExecutor(executor);
	      }
	      
	      public void registerEvents(Plugin plugin, Listener... listeners)
	      {
	        for (Listener listener : listeners) {
	          Bukkit.getPluginManager().registerEvents(listener, plugin);
	        }
	      }
	      public String getKit(Player p)
	      {
	        if (Main.hg.contains(p.getName())) {
	          return "PvP";
	        }
	        if (Main.arqueiro.contains(p.getName())) {
	          return "Arqueiro";
	        }
	        if (Main.urgal.contains(p.getName())) {
	          return "Urgal";
	        }
	        if (Main.whister.contains(p.getName())) {
	          return "Shooter";
	        }
	        if (Main.pyro.contains(p.getName())) {
	          return "Pyro";
	        }
	        if (Main.Trocador.contains(p.getName())) {
	          return "Trocador";
	        }
	        if (Main.soldado.contains(p.getName())) {
	          return "Soldado";
	        }
	        if (Main.viper.contains(p.getName())) {
	          return "Viper";
	        }
	        if (Main.ninja.contains(p.getName())) {
	          return "Ninja";
	        }
	        if (Main.anchor.contains(p.getName())) {
	          return "Anchor";
	        }
	        if (Main.tank.contains(p.getName())) {
	          return "Tank";
	        }
	        if (Main.switcher.contains(p.getName())) {
	          return "Switcher";
	        }
	        if (Main.darkmage.contains(p.getName())) {
	          return "Darkmage";
	        }
	        if (Main.Teleporter.contains(p.getName())) {
	          return "Teleporter";
	        }
	        if (Main.thor.contains(p.getName())) {
	          return "Thor";
	        }
	        if (Main.specialist.contains(p.getName())) {
	          return "Specialist";
	        }
	        if (Main.launcher.contains(p.getName())) {
	          return "Launcher";
	        }
	        if (Main.milkman.contains(p.getName())) {
	          return "Milkman";
	        }
	        if (Main.skeleton.contains(p.getName())) {
	          return "Skeleton";
	        }
	        if (Main.fisherman.contains(p.getName())) {
	          return "Fisherman";
	        }
	        if (Main.phantom.contains(p.getName())) {
	          return "Phantom";
	        }
	        if (Main.gladiator.contains(p.getName())) {
	          return "Gladiator";
	        }
	        if (Main.flash.contains(p.getName())) {
	          return "Flash";
	        }
	        if (Main.grappler.contains(p.getName())) {
	          return "Grappler";
	        }
	        if (Main.endermage.contains(p.getName())) {
	          return "Endermage";
	        }
	        if (Main.monk.contains(p.getName())) {
	          return "Monk";
	        }
	        if (Main.camel.contains(p.getName())) {
	          return "Camel";
	        }
	        if (Main.frosty.contains(p.getName())) {
	          return "Frosty";
	        }
	        if (Main.wither.contains(p.getName())) {
	          return "Wither";
	        }
	        if (Main.poseidon.contains(p.getName())) {
	          return "Poseidon";
	        }
	        if (Main.stomper.contains(p.getName())) {
	          return "Stomper";
	        }
	        if (Main.reaper.contains(p.getName())) {
	          return "Reaper";
	        }
	        if (Main.pisca.contains(p.getName())) {
	          return "Remix";
	        }
	        if (Main.turtle.contains(p.getName())) {
	          return "Turtle";
	        }
	        if (Main.jumper.contains(p.getName())) {
	          return "Jumper";
	        }
	        if (Main.snail.contains(p.getName())) {
	          return "Snail";
	        }
	        if (Main.fireman.contains(p.getName())) {
	          return "Fireman";
	        }
	        if (Main.kangaroo.contains(p.getName())) {
	          return "Kangaroo";
	        }
	        if (Main.viking.contains(p.getName())) {
	          return "Viking";
	        }
	        if (Main.madman.contains(p.getName())) {
	          return "Madman";
	        }
	        if (Main.grandpa.contains(p.getName())) {
	          return "Grandpa";
	        }
	        if (Main.ghost.contains(p.getName())) {
	          return "Ghost";
	        }
	        if (Main.barbarian.contains(p.getName())) {
	          return "Barbarian";
	        }
	        if (Main.spiderman.contains(p.getName())) {
	          return "SpiderMan";
	        }
	        if (Main.berserker.contains(p.getName())) {
	          return "Berserker";
	        }
	        if (Main.indio.contains(p.getName())) {
	          return "Indio";
	        }
	        if (Main.ryu.contains(p.getName())) {
	          return "Ryu";
	        }
	        if (Main.neji.contains(p.getName())) {
	          return "Neji";
	        }
	        if (Main.granadier.contains(p.getName())) {
	          return "Granadier";
	        }
	        if (Main.rhino.contains(p.getName())) {
	          return "Rhino";
	        }
	        if (Main.alien.contains(p.getName())) {
	          return "Alien";
	        }
	        if (Main.critical.contains(p.getName())) {
	          return "Critical";
	        }
	        if (Main.hulk.contains(p.getName())) {
	          return "Hulk";
	        }
	        if (Main.lobisomem.contains(p.getName())) {
	          return "Lobisomem";
	        }
	        if (Main.phantom.contains(p.getName())) {
	          return "Phantom";
	        }
	        if (Main.vitality.contains(p.getName())) {
	          return "Vitality";
	        }
	        if (Main.quickdropper.contains(p.getName())) {
	          return "QuickDropper";
	        }
	        return "Sem Kit";
	      }

	  }
}