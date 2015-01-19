package com.dennisbonke.test;

import com.dennisbonke.test.listener.player.PlayerJoin;
import com.dennisbonke.test.util.Chat;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by Dennisbonke on 18-1-2015.
 */
public class Test extends JavaPlugin {

    public static String prefix = ChatColor.RED + "[TEST] " + ChatColor.WHITE;
    public static Chat chat;

    private static Test test;

    @Override
    public void onEnable() {
        chat.sendConsoleMessage("Starting up TestPlugin, Please wait....");
        chat.sendConsoleMessage("[WARNING]: YOU SHOULDN'T BE USING THIS PLUGIN, AS IT IS ONLY FOR TESTING!");

        test = this;

        chat.sendConsoleMessage("Registering events....");
        this.getServer().getPluginManager().registerEvents(new PlayerJoin(this), this);
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
}
