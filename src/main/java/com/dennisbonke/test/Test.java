package com.dennisbonke.test;

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

    }

    @Override
    public void onDisable() {

    }
}
