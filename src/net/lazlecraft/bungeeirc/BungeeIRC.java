package net.lazlecraft.bungeeirc;

import java.util.List;

import net.craftminecraft.bungee.bungeeyaml.pluginapi.ConfigurablePlugin;

public class BungeeIRC extends ConfigurablePlugin {
	
	public static String BotNick;
	public static String BotPass;
	public static String BotNetwork;
	public static String BotChannel;
	public static List<String> Channels;
	public static int BotPort;
	
	
	public void onEnable() {
		this.getConfig().options().copyDefaults(true);
		this.saveConfig();
		BotNick = getConfig().getString("Bot.Nick");
		BotPass = getConfig().getString("Bot.Password");
		BotNetwork = getConfig().getString("Bot.Network");
		BotChannel = getConfig().getString("Bot.MainChannel");
		BotPort = getConfig().getInt("Bot.Port");
		Channels = getConfig().getStringList("Bot.Channels");
		BotInstance.bot.setName(BotNick);
		if (getConfig().getBoolean("Bot.UsingBouncer")) {
		BotConnect.botConnect();
		} else {
			BotConnect.botConnectDeux();
		}
	}
	
	public void onDisable() {
		if (BotInstance.bot.isConnected()) {
		BotConnect.botDisconnect();
		}
	}
}
