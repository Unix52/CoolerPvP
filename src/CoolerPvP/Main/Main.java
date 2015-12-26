package CoolerPvP.Main;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import CoolerPvP.API.BossBar;
import CoolerPvP.Comandos.Admin;
import CoolerPvP.Comandos.Build;
import CoolerPvP.Comandos.ChatClear;
import CoolerPvP.Comandos.ChatLock;
import CoolerPvP.Comandos.Clear;
import CoolerPvP.Comandos.Gamemode;
import CoolerPvP.Comandos.Head;
import CoolerPvP.Comandos.InvSee;
import CoolerPvP.Comandos.Kick;
import CoolerPvP.Comandos.Mute;
import CoolerPvP.Comandos.Report;
import CoolerPvP.Comandos.StaffChat;
import CoolerPvP.Comandos.Tell;
import CoolerPvP.Comandos.Tp;
import CoolerPvP.Comandos.Tpall;
import CoolerPvP.Listener.BlockJump;
import CoolerPvP.Listener.Caracters;
import CoolerPvP.Listener.Chat;
import CoolerPvP.Listener.CombatLog;
import CoolerPvP.Listener.Config;
import CoolerPvP.Listener.Join;
import CoolerPvP.Listener.Motd;
import CoolerPvP.Listener.Sopa;
import CoolerPvP.Listener.Tag;
import CoolerPvP.Listener.Util;
import CoolerPvP.Listener.v1_8;

import com.sk89q.worldguard.bukkit.WorldGuardPlugin;

@SuppressWarnings({ "unused", "deprecation" })
public class Main extends JavaPlugin implements Listener {
public static ArrayList<String> staff = new ArrayList<String>();
public List<String> Infernor = new ArrayList<String>();
@SuppressWarnings({ "unchecked", "rawtypes" })
public static ArrayList<String> mute = new ArrayList();

public void onEnable()
	  {
	    getServer().getConsoleSender().sendMessage(ChatColor.BOLD + "============");
	    getServer().getConsoleSender().sendMessage(ChatColor.GREEN + " CoolerPvP");
	    getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "  Ativado"); 
	    getServer().getConsoleSender().sendMessage(ChatColor.BOLD + "============");
	    Config.getConfig(Config.ConfigFile.CONFIG).options().copyDefaults(true);
	    Config.loadConfigs();
	    registerCommands();
	    registerEvents();
	  }
@EventHandler
public void onDamage(EntityDamageEvent e)
{
  if (e.getCause() == EntityDamageEvent.DamageCause.VOID)
  {
    Player p = (Player)e.getEntity();
    p.setHealth(0.0D);
    p.teleport(p.getWorld().getSpawnLocation());
    
  }
}
	public void registerCommands()
	  {

	    getCommand("Admin").setExecutor(new Admin());
	    getCommand("build").setExecutor(new Build());
	    getCommand("cc").setExecutor(new ChatClear());
	    getCommand("ccp").setExecutor(new ChatClear());
	    getCommand("cl").setExecutor(new ChatLock(this));
	    getCommand("clear").setExecutor(new Clear());
	    getCommand("gm").setExecutor(new Gamemode());
	    getCommand("head").setExecutor(new Head(this));
	    getCommand("invsee").setExecutor(new InvSee(this));
	    getCommand("kick").setExecutor(new Kick());
	    getCommand("mute").setExecutor(new Mute());
	    getCommand("report").setExecutor(new Report());
	    getCommand("s").setExecutor(new StaffChat());
	    getCommand("tell").setExecutor(new Tell());
	    getCommand("tp").setExecutor(new Tp());
	    getCommand("tpall").setExecutor(new Tpall());
	    getCommand("mute").setExecutor(new Mute());
	    getCommand("desmute").setExecutor(new Mute());
	  }
	public void registerEvents()
	  {
	    Bukkit.getServer().getPluginManager().registerEvents(this, this);
	    PluginManager pm = getServer().getPluginManager();
	    pm.registerEvents(new Admin(), this);
	    pm.registerEvents(new v1_8(), this);
	    pm.registerEvents(new BossBar(this), this);
	    pm.registerEvents(new Config(this), this);
	    pm.registerEvents(new Join(), this);
	    pm.registerEvents(new Motd(), this);
	    pm.registerEvents(new Tag(), this);
	    pm.registerEvents(new Sopa(this), this);
	    pm.registerEvents(new Chat(this), this);
	    pm.registerEvents(new Caracters(), this);
	    pm.registerEvents(new Util(this), this);
	    pm.registerEvents(new BlockJump(this), this);
	    pm.registerEvents(new CombatLog(), this);
	    
	  }

	  
	public void onChat(PlayerChatEvent e)
	  {
	    String message = e.getMessage();
	    Player p = e.getPlayer();
	    if (p.hasPermission("chat.color"))
	    {
	      String msg = e.getMessage();
	      msg = msg.replace("&", "§");
	      e.setMessage(msg);
	      return;
	    }
	  }
	public void onDisable()
	  {
	    getServer().getConsoleSender().sendMessage(ChatColor.RED + "============");
	    getServer().getConsoleSender().sendMessage(ChatColor.RED + " CoolerPvP");
	    getServer().getConsoleSender().sendMessage(ChatColor.RED + " Desativado"); 
	    getServer().getConsoleSender().sendMessage(ChatColor.RED + "============");
	  }
}
