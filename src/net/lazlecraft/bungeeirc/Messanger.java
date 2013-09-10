package net.lazlecraft.bungeeirc;

public class Messanger {

	
	public static void sendMessage(String Message) {
		BotInstance.bot.sendMessage(BungeeIRC.BotChannel, Message);
	}
	
	public static void sendChanMessage(String Channel, String Message) {
		BotInstance.bot.sendMessage(Channel, Message);
	}
	
}
