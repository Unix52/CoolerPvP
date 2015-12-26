package CoolerPvP.Listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerListPingEvent;

public class Motd
  implements Listener
{
  @EventHandler
  public void ping(ServerListPingEvent e)
  {
    e.setMotd("§a§m§l=-=-=-=-=-=-=〖§6§lCoolerPvP§a§m§l〗=-=-=-=-=-=-=\n"
    		+ "§6§m§l=-=-=-=-=-=〖§aVenha Jogar PvP§6§m§l〗=-=-=-=-=-=");
  }
}
