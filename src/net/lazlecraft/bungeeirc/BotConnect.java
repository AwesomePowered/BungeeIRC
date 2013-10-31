package net.lazlecraft.bungeeirc;

import java.io.IOException;

import org.pircbotx.exception.IrcException;
import org.pircbotx.exception.NickAlreadyInUseException;

public class BotConnect {

	
	public static void botConnect()  {
		try {
		BotInstance.bot.setName(BungeeIRC.BotNick);
		BotInstance.bot.connect(BungeeIRC.BotNetwork, BungeeIRC.BotPort, BungeeIRC.BotPass);
		System.out.println("Bot Connected");
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
		BotInstance.bot.joinChannel(BungeeIRC.BotChannel);
		Messenger.sendMessage("EXTERMINATE!");
	}
	
	public static void botDisconnect() {
		Messenger.sendMessage("I shall return!");
		BotInstance.bot.disconnect();
		System.out.println("Bot disconnected");
	}
	
}
