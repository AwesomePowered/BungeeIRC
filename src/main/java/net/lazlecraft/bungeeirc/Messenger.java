package net.lazlecraft.bungeeirc;

public class Messenger {

	
	public static void sendMessage(String Message) {
		BotInstance.bot.sendMessage(BungeeIRC.BotChannel, Message);
	}
	
	public static void sendChanMessage(String Channel, String Message) {
		BotInstance.bot.sendMessage(Channel, Message);
	}
	
	public static void sendPrivateMessage(String target, String message) {
		BotInstance.bot.sendMessage(target, message);
	}

    public static void sendNotice(String user, String message) {
        BotInstance.bot.sendNotice(user, message);
    }
	
}
