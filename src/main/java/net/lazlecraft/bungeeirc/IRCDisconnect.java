package net.lazlecraft.bungeeirc;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.plugin.Command;

public class IRCDisconnect extends Command {

    public IRCDisconnect(BungeeIRC plugin) {
        super("ircdisconnect");
    }

    BungeeIRC plugin;

    @Override
    public void execute(CommandSender sender, String[] arg1) {
        if (sender.hasPermission("bungeeirc.disconnect")) {
            BotInstance.bot.disconnect();
            sender.sendMessage(ChatColor.RED + "Bot disconnected ");
        }
    }
}