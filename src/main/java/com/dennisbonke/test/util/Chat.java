package com.dennisbonke.test.util;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dennisbonke on 19-1-2015.
 */
public class Chat implements Listener {

    private static List<Chat> allChats = new ArrayList<Chat>();

    private final String plugin;
    private final String prefix;

    public Chat(String plugin, ChatColor color) {
        this.plugin = plugin;
        this.prefix = color + "[" + plugin + "]" + ChatColor.WHITE;

        allChats.add(this);
    }

    public Chat(String plugin) {
        this.plugin = plugin;
        this.prefix = ChatColor.RED + "[" + plugin + "]" + ChatColor.WHITE;

        allChats.add(this);
    }

    public static Chat getChat(String plugin) {
        for (Chat chat : allChats)
            if (chat.getName().equalsIgnoreCase(plugin))
                    return chat;
        return null;
    }

    private static ConsoleCommandSender getConsole() {
        return Bukkit.getServer().getConsoleSender();
    }

    public String getName() {
        return plugin;
    }

    public String getPrefix() {
        return prefix;
    }

    public void sendConsoleMessage(String message) {
        getConsole().sendMessage(getPrefix() + message);
    }

    public void sendMessage(Player player, String message) {
        player.sendMessage(getPrefix() + message);
    }

    public void sendMessage(CommandSender sender, String message) {
        sender.sendMessage(getPrefix() + message);
    }

    public void sendWarningConsoleMessage(String message) {
        Bukkit.getLogger().warning(getPrefix() + message);
    }


}
