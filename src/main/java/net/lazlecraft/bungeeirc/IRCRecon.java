package net.lazlecraft.bungeeirc;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.plugin.Command;

public class IRCRecon extends Command {

    public IRCRecon(BungeeIRC plugin) {
        super("ircrecon");
        // TODO Auto-generated constructor stub
    }

    BungeeIRC plugin;

    @Override
    public void execute(CommandSender sender, String[] arg1) {
        if (sender.hasPermission("bungeeirc.reconnect")) {
            if (BotInstance.bot.isConnected()) {
                BotConnect.botDisconnect();
                sender.sendMessage(ChatColor.DARK_RED  + "Attempting to reconnect");
                BotConnect.botConnect();
                sender.sendMessage(ChatColor.GREEN + "Bot reconnected");
            } else {
                BotConnect.botConnect();
                sender.sendMessage(ChatColor.GREEN + "Bot reconnected");
            }
        }
    }
}