package net.lazlecraft.bungeeirc;

import java.io.IOException;

import org.pircbotx.exception.IrcException;
import org.pircbotx.exception.NickAlreadyInUseException;

public class BotConnect {

	
	public static void botConnect()  {
		try {
		BotInstance.bot.connect(BungeeIRC.BotNetwork, BungeeIRC.BotPort, BungeeIRC.BotPass);
		BotInstance.bot.setAutoReconnect(true);
		System.out.println("Bot Connected");
		} catch (NickAlreadyInUseException e) {
			BotInstance.bot.setName(BungeeIRC.BotNick + "_");
            botConnect();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IrcException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Messenger.sendChanMessage("nickserv", "identify " + BungeeIRC.BotPass);
		joinChannels();
	}
	
	public static void botConnectDeux() {

	}
	
	public static void botReconnect() throws NickAlreadyInUseException, IOException, IrcException {
		BotInstance.bot.reconnect();
	}
	
	public static void joinChannels() {
		BotInstance.bot.joinChannel(BungeeIRC.BotChannel);
		for (String chans : BungeeIRC.Channels)
		BotInstance.bot.joinChannel(chans);
	}
	
	public static void botDisconnect() {
		BotInstance.bot.disconnect();
		System.out.println("Bot disconnected");
	}
	
}
