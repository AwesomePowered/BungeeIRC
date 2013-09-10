package net.lazlecraft.bungeeirc;

import java.io.IOException;

import org.pircbotx.exception.IrcException;
import org.pircbotx.exception.NickAlreadyInUseException;

import net.craftminecraft.bungee.bungeeyaml.pluginapi.ConfigurablePlugin;

public class BungeeIRC extends ConfigurablePlugin {
	
	public static String BotNick;
	public static String BotPass;
	public static String BotNetwork;
	public static String BotChannel;
	public static int BotPort;
	
	
	public void onEnable() {
		BotNick = getConfig().getString("Bot.Nick");
		BotPass = getConfig().getString("Bot.Password");
		BotNetwork = getConfig().getString("Bot.Network");
		BotChannel = getConfig().getString("Bot.Channel");
		
		try {
			BotConnect.botConnect();
		} catch (NickAlreadyInUseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IrcException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void onDisable() {
		BotConnect.botDisconnect();
	}
}
