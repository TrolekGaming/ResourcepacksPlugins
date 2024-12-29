package de.themoep.resourcepacksplugin.velocity.listeners;

import com.velocitypowered.api.event.Subscribe;
import de.themoep.resourcepacksplugin.velocity.VelocityResourcepacks;
import pl.minecodes.minelogin.velocity.api.event.post.UserPostLoginEvent;
import pl.minecodes.minelogin.velocity.api.event.post.UserPostRegisterEvent;

public class MineLoginListener extends AuthHandler {

    public MineLoginListener(VelocityResourcepacks plugin) {
        super(plugin);
    }
    @Subscribe
    public void onLogin(UserPostLoginEvent event) {
        onAuth(event.getPlayer());
    }
    @Subscribe
    public void onRegister(UserPostRegisterEvent event) {
        onAuth(event.getPlayer());
    }
}
