package CoolerPvP.Listener;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class Mensagens
{
	public static String Whitelist = Config.getConfig(Config.ConfigFile.CONFIG).getString("Whiteist").replace("&", "§").replace("%", "\n");
	public static String Servidorcheio = Config.getConfig(Config.ConfigFile.CONFIG).getString("ServidorCheio").replace("&", "§").replace("%", "\n");
	public static String PlacaDeSopaLinha1 = Config.getConfig(Config.ConfigFile.CONFIG).getString("Sopas.1").replace("&", "§").replace("%", "\n");
	public static String PlacaDeSopaLinha2 = Config.getConfig(Config.ConfigFile.CONFIG).getString("Sopas.2").replace("&", "§").replace("%", "\n");
	public static String PlacaDeSopaLinha3 = Config.getConfig(Config.ConfigFile.CONFIG).getString("Sopas.3").replace("&", "§").replace("%", "\n");
	public static String PlacaDeSopaLinha4 = Config.getConfig(Config.ConfigFile.CONFIG).getString("Sopas.4").replace("&", "§").replace("%", "\n");
	public static String PlacaDePotesLinha1 = Config.getConfig(Config.ConfigFile.CONFIG).getString("Potes.1").replace("&", "§").replace("%", "\n");
	public static String PlacaDePotesLinha2 = Config.getConfig(Config.ConfigFile.CONFIG).getString("Potes.2").replace("&", "§").replace("%", "\n");
	public static String PlacaDePotesLinha3 = Config.getConfig(Config.ConfigFile.CONFIG).getString("Potes.3").replace("&", "§").replace("%", "\n");
	public static String PlacaDePotesLinha4 = Config.getConfig(Config.ConfigFile.CONFIG).getString("Potes.4").replace("&", "§").replace("%", "\n");
    public static String entrada = Config.getConfig(Config.ConfigFile.CONFIG).getString("Entrada").replace("&", "§").replace("%", "\n");
    public static String saida = Config.getConfig(Config.ConfigFile.CONFIG).getString("Saida").replace("&", "§").replace("%", "\n");
	public static String Entrada1 = Config.getConfig(Config.ConfigFile.CONFIG).getString("Entrada.1").replace("&", "§").replace("%", "\n");
	public static String Entrada2 = Config.getConfig(Config.ConfigFile.CONFIG).getString("Entrada.2").replace("&", "§").replace("%", "\n");
    static Mensagens instance = new Mensagens();
    
  public static void semPermiassao(Player player)
  {
    CommandSender p = player;
    p.sendMessage(Config.getConfig(Config.ConfigFile.CONFIG).getString("Permissao").replace("&", "§").replace("@player", p.getName()).replace("%", "\n"));
  }
  public static void Offline(Player player)
  {
    CommandSender p = player;
    p.sendMessage(Config.getConfig(Config.ConfigFile.CONFIG).getString("Offline").replace("&", "§").replace("@player", p.getName()).replace("%", "\n"));
  }
  public static void Console(Player player)
  {
    CommandSender p = player;
    p.sendMessage(Config.getConfig(Config.ConfigFile.CONFIG).getString("Console").replace("&", "§").replace("@player", p.getName()).replace("%", "\n"));
  }
  public static void Ip(Player player)
  {
    CommandSender p = player;
    p.sendMessage(Config.getConfig(Config.ConfigFile.CONFIG).getString("IP").replace("&", "§").replace("@player", p.getName()).replace("%", "\n"));
  }
  public static void nome(Player player)
  {
    CommandSender p = player;
    p.sendMessage(Config.getConfig(Config.ConfigFile.CONFIG).getString("NomeDoServidor").replace("&", "§").replace("@player", p.getName()).replace("%", "\n"));
  }
  public static void Tab1(Player player)
  {
    CommandSender p = player;
    p.sendMessage(Config.getConfig(Config.ConfigFile.CONFIG).getString("Tab.1").replace("&", "§").replace("@player", p.getName()).replace("%", "\n"));
  }
  public static void Tab2(Player player)
  {
    CommandSender p = player;
    p.sendMessage(Config.getConfig(Config.ConfigFile.CONFIG).getString("Tab.2").replace("&", "§").replace("@player", p.getName()).replace("%", "\n"));
  }
  public static Mensagens getInstance()
  {
	return instance;
  }
}