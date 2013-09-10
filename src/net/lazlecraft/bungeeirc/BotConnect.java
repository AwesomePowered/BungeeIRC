package net.lazlecraft.bungeeirc;

import java.io.IOException;

import org.pircbotx.exception.IrcException;
import org.pircbotx.exception.NickAlreadyInUseException;

public class BotConnect {

	
	public static void botConnect() throws NickAlreadyInUseException, IOException, IrcException {
		BotInstance.bot.setName(BungeeIRC.BotNick);
		BotInstance.bot.connect(BungeeIRC.BotNetwork, BungeeIRC.BotPort, BungeeIRC.BotPass);
	}
	
	public static void botDisconnect() {
		BotInstance.bot.disconnect();
		System.out.println("Bot disconnected");
	}
	
}
