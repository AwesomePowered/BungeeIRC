package net.lazlecraft.bungeeirc;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.plugin.Command;

public class IRCConnect extends Command {

    IRCConnect(BungeeIRC plugin) {
        super("ircconnect");
    }

    BungeeIRC plugin;

    @Override
    public void execute(CommandSender sender, String[] args) {
        if (sender.hasPermission("bungeeirc.connect")) {
            BotConnect.botConnect();
        }
    }

}
