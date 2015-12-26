package CoolerPvP.Listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;

@SuppressWarnings("deprecation")
public class Caracters
 implements Listener
{
	  @SuppressWarnings({ "unused" })
	@EventHandler
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
	  
	  @EventHandler
	  public void FreeChat(PlayerChatEvent e)
	  {
	    String message = e.getMessage();
	    message = message.replaceAll("§", "§");
	    e.setMessage(message);
	    String msg = e.getMessage();
	    msg = msg.replace("(1)", "①");
	    msg = msg.replace("(2)", "②");
	    msg = msg.replace("(3)", "③");
	    msg = msg.replace("(4)", "④");
	    msg = msg.replace("(5)", "⑤");
	    msg = msg.replace("(6)", "⑥");
	    msg = msg.replace("(7)", "⑦");
	    msg = msg.replace("(8)", "⑧");
	    msg = msg.replace("(9)", "⑨");
	    msg = msg.replace("(10)", "⑩");
	    msg = msg.replace("(11)", "⑪");
	    msg = msg.replace("(12)", "⑫");
	    msg = msg.replace("(13)", "⑫");
	    msg = msg.replace("(14)", "⑬");
	    msg = msg.replace("(15)", "⑭");
	    msg = msg.replace("(16)", "⑮");
	    msg = msg.replace("(17)", "⑰");
	    msg = msg.replace("(18)", "⑱");
	    msg = msg.replace("(19)", "⑲");
	    msg = msg.replace("(20)", "⑳");
	    msg = msg.replace("->", "➡");
	    msg = msg.replace("(y)", "✔");
	    msg = msg.replace("(n)", "✖");
	    msg = msg.replace("(copyright)", "©");
	    msg = msg.replace("(tm)", "™");
	    msg = msg.replace("(star)", "✰");
	    msg = msg.replace("(music)", "♫");
	    msg = msg.replace("(tempo)", "☁");
	    msg = msg.replace(">", "➤");
	    e.setMessage(msg);
	  }
}