package net.lazlecraft.bungeeirc;

import org.pircbotx.Channel;

public class JoinChannel {
	
	public static void JoinChan(String channel) {
		BotInstance.bot.joinChannel(channel);
	}
	
	public static void JoinKeyedChannel(String channel, String key) {
		BotInstance.bot.joinChannel(channel, key);
	}
	
	public static void LeaveChannel(Channel chan, String reason) {
		BotInstance.bot.partChannel(chan, reason);
	}

}
