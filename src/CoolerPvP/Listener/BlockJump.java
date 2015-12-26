package CoolerPvP.Listener;

import java.util.ArrayList;

import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.util.Vector;

import CoolerPvP.Main.Main;

@SuppressWarnings("unused")
public class BlockJump
  implements Listener
{
  public static Main plugin;
  @SuppressWarnings({ "unchecked", "rawtypes" })
ArrayList<Player> lanching = new ArrayList();
  
  public BlockJump(Main main)
  {
    plugin = main;
  }
  
  @EventHandler
  public void jumpAlto(PlayerMoveEvent paramPlayerMoveEvent)
  {
    Player localPlayer = paramPlayerMoveEvent.getPlayer();
    Block localBlock1 = paramPlayerMoveEvent.getTo().getBlock();
    Location localLocation = localBlock1.getLocation();
    localLocation.setY(localLocation.getY() - 1.0D);
    Block localBlock2 = localLocation.getBlock();
    if (localBlock2.getType() == Material.GOLD_BLOCK)
    {
      localPlayer.setFallDistance(-50.0F);
      localPlayer.setVelocity(new Vector(0, 4, 0));
      localPlayer.playSound(localPlayer.getLocation(), Sound.FIREWORK_LAUNCH, 
        1.0F, 1.0F);
      localPlayer.getWorld().playEffect(localPlayer.getLocation(), Effect.ENDER_SIGNAL, 5);
      localPlayer.setFallDistance(-50.0F);
    }
  }
  
  @EventHandler
  public void jumpMedio(PlayerMoveEvent paramPlayerMoveEvent)
  {
    Player localPlayer = paramPlayerMoveEvent.getPlayer();
    Block localBlock1 = paramPlayerMoveEvent.getTo().getBlock();
    Location localLocation = localBlock1.getLocation();
    localLocation.setY(localLocation.getY() - 1.0D);
    Block localBlock2 = localLocation.getBlock();
    if (localBlock2.getType() == Material.DIAMOND_BLOCK)
    {
      localPlayer.setFallDistance(-40.0F);
      localPlayer.setVelocity(new Vector(0, 3, 0));
      localPlayer.playSound(localPlayer.getLocation(), Sound.FIREWORK_LAUNCH, 
        1.0F, 1.0F);
      localPlayer.getWorld().playEffect(localPlayer.getLocation(), Effect.ENDER_SIGNAL, 5);
      localPlayer.setFallDistance(-40.0F);
    }
  }
  
  @EventHandler
  public void jumpBaixo(PlayerMoveEvent paramPlayerMoveEvent)
  {
    Player localPlayer = paramPlayerMoveEvent.getPlayer();
    Block localBlock1 = paramPlayerMoveEvent.getTo().getBlock();
    Location localLocation = localBlock1.getLocation();
    localLocation.setY(localLocation.getY() - 1.0D);
    Block localBlock2 = localLocation.getBlock();
    if (localBlock2.getType() == Material.REDSTONE_BLOCK)
    {
      localPlayer.setFallDistance(-40.0F);
      localPlayer.setVelocity(new Vector(0, 2, 0));
      localPlayer.playSound(localPlayer.getLocation(), Sound.FIREWORK_LAUNCH, 
        1.0F, 1.0F);
      localPlayer.getWorld().playEffect(localPlayer.getLocation(), Effect.ENDER_SIGNAL, 5);
      localPlayer.setFallDistance(-40.0F);
    }
  }
  
  @EventHandler
  public void jumpBaixo2(PlayerMoveEvent paramPlayerMoveEvent)
  {
    Player localPlayer = paramPlayerMoveEvent.getPlayer();
    Block localBlock1 = paramPlayerMoveEvent.getTo().getBlock();
    Location localLocation = localBlock1.getLocation();
    localLocation.setY(localLocation.getY() - 1.0D);
    Block localBlock2 = localLocation.getBlock();
    if (localBlock2.getType() == Material.PISTON_BASE)
    {
      localPlayer.setFallDistance(-100.0F);
      localPlayer.setVelocity(new Vector(0, 2, 0));
      localPlayer.playSound(localPlayer.getLocation(), Sound.FIREWORK_LAUNCH, 
        1.0F, 1.0F);
      localPlayer.getWorld().playEffect(localPlayer.getLocation(), Effect.ENDER_SIGNAL, 5);
      localPlayer.setFallDistance(-100.0F);
    }
  }
  
  @EventHandler
  public void jump(PlayerMoveEvent paramPlayerMoveEvent)
  {
    Player localPlayer = paramPlayerMoveEvent.getPlayer();
    Block localBlock1 = paramPlayerMoveEvent.getTo().getBlock();
    Location localLocation = localBlock1.getLocation();
    localLocation.setY(localLocation.getY() - 1.0D);
    Block localBlock2 = localLocation.getBlock();
    if (localBlock2.getType() == Material.ENDER_PORTAL_FRAME)
    {
      localPlayer.setFallDistance(-50.0F);
      Vector vector = localPlayer.getEyeLocation().getDirection();
      vector.multiply(4.6F);
      vector.setY(1.0F);
      localPlayer.setVelocity(vector);
      localPlayer.playSound(localPlayer.getLocation(), Sound.FIREWORK_LAUNCH, 
        1.0F, 1.0F);
      localPlayer.getWorld().playEffect(localPlayer.getLocation(), Effect.ENDER_SIGNAL, 5);
      localPlayer.setFallDistance(-50.0F);
    }
  }
}
