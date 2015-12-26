package CoolerPvP.Listener;

import net.minecraft.server.v1_7_R4.ChatSerializer;
import net.minecraft.server.v1_7_R4.IChatBaseComponent;
import net.minecraft.server.v1_7_R4.PlayerConnection;

import org.bukkit.craftbukkit.v1_7_R4.entity.CraftPlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.spigotmc.ProtocolInjector;

import CoolerPvP.API.TitleManager;

public class v1_8
  implements Listener
{
  @EventHandler
  public void joinEvents(PlayerJoinEvent event)
  {
    Player player = event.getPlayer();
    TitleManager.sendTimings(player.getPlayer(), 20, 40, 20);
    TitleManager.sendSubTitle(player.getPlayer(), "{\"text\":\"\",\"extra\":[{\"text\":\"Olá\",\"color\":\"blue\"}]}");
    TitleManager.sendTitle(player.getPlayer(), "{\"text\":\"\",\"extra\":[{\"text\":\"Seja Bem-Vindo ao servidor\",\"color\":\"yellow\"}]}");
  }
}