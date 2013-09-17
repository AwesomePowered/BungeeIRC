package net.lazlecraft.bungeeirc;

import net.craftminecraft.bungee.bungeeyaml.pluginapi.ConfigurablePlugin;

public class BungeeIRC extends ConfigurablePlugin {
	
	public static String BotNick;
	public static String BotPass;
	public static String BotNetwork;
	public static String BotChannel;
	public static int BotPort;
	
	
	public void onEnable() {
		this.getConfig().options().copyDefaults(true);
		this.saveConfig();
		BotNick = getConfig().getString("Bot.Nick");
		BotPass = getConfig().getString("Bot.Password");
		BotNetwork = getConfig().getString("Bot.Network");
		BotChannel = getConfig().getString("Bot.Channel");
		BotConnect.botConnect();
	}
	
	public void onDisable() {
		if (BotInstance.bot.isConnected()) {
		BotConnect.botDisconnect();
		}
	}
}
