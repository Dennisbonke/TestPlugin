package com.dennisbonke.test;

import com.dennisbonke.test.listener.player.PlayerJoin;
import com.dennisbonke.test.util.Chat;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by Dennisbonke on 18-1-2015.
 */
public class Test extends JavaPlugin {

    public static Chat chat = new Chat("TEST");
    private static Test plugin;

    public static Chat getChat(){
        return chat;
    }

    public static Test getPlugin(){
        return plugin;
    }

    @Override
    public void onEnable() {
        chat.sendConsoleMessage("Starting up TestPlugin, Please wait....");
        chat.sendWarningConsoleMessage("YOU SHOULDN'T BE USING THIS PLUGIN, AS IT IS ONLY FOR TESTING!");

        plugin = this;
        PluginManager pm = Bukkit.getPluginManager();

        chat.sendConsoleMessage("Registering events....");
        pm.registerEvents(new PlayerJoin(this), this);
        chat.sendConsoleMessage("Events registered.");

        chat.sendConsoleMessage("TestPlugin is ready to go!");
        chat.sendConsoleMessage("Enabled.");
    }

    @Override
    public void onDisable() {
        chat.sendConsoleMessage("Shutting down TestPlugin, This should only take a moment....");

        chat.sendConsoleMessage("Junk cleared, shutting down.");
        chat.sendConsoleMessage("Disabled.");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String commandLabel, String[] args) {
        if(commandLabel.equalsIgnoreCase("mycommand")) {
            sender.sendMessage("IT WOKKS!!! :D");
        }
        return false;
    }
}
