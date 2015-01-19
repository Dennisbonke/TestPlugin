package com.dennisbonke.test.listener;

import com.dennisbonke.test.Test;

import org.bukkit.event.Listener;

/**
 * Created by Dennisbonke on 19-1-2015.
 */
public class TestListener implements Listener {

    public Test plugin;

    public TestListener(Test pl) {
            plugin = pl;
    }

}
