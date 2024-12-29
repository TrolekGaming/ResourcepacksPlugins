package de.themoep.resourcepacksplugin.bungee.listeners;

import de.themoep.resourcepacksplugin.bungee.BungeeResourcepacks;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.event.EventHandler;
import pl.minecodes.minelogin.bungee.api.event.post.UserPostLoginEvent;
import pl.minecodes.minelogin.bungee.api.event.post.UserPostRegisterEvent;

public class MineLoginListener extends AuthHandler implements Listener {

    public MineLoginListener(BungeeResourcepacks plugin) {
        super(plugin);
    }
    @EventHandler
    public void onLogin(UserPostLoginEvent event) {
        onAuth(event.getPlayer());
    }
    @EventHandler
    public void onRegister(UserPostRegisterEvent event) {
        onAuth(event.getPlayer());
    }
}
