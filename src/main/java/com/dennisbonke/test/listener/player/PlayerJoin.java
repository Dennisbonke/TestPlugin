package com.dennisbonke.test.listener.player;

import com.dennisbonke.test.Test;
import com.dennisbonke.test.listener.TestListener;
import com.dennisbonke.test.util.Chat;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;

/**
 * Created by Dennisbonke on 19-1-2015.
 */
public class PlayerJoin extends TestListener {

    private static Chat chat;

    public PlayerJoin(Test pl) {
        super(pl);
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        chat.sendMessage(player, "Welcome to the server" + player + "!");
    }

}
