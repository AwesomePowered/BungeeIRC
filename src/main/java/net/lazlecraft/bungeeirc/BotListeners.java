package net.lazlecraft.bungeeirc;

import net.md_5.bungee.api.ProxyServer;
import org.pircbotx.hooks.ListenerAdapter;
import org.pircbotx.hooks.events.DisconnectEvent;
import org.pircbotx.hooks.events.MessageEvent;

public class BotListeners extends ListenerAdapter {

    public void onDisconnect(DisconnectEvent ev) {
        System.out.println("Bot Disconnected attempting to reconnect");
        if (BotInstance.bot.isConnected()) {
        BotConnect.botDisconnect();
        System.out.println("Reconnecting bot");
        BotConnect.botConnect();
        } else {
            BotConnect.botConnect();
        }
    }

    public void onMessage(MessageEvent ev) {
        if (ev.getMessage().equalsIgnoreCase("!playercount")) {
                ev.respond("There are currently " + ProxyServer.getInstance().getOnlineCount() + " players online");
        }
    }
}
