package io.github.yukkuritaku.loom.bootstrap;

import net.fabricmc.loom.bootstrap.BootstrappedPlugin;
import org.gradle.api.Plugin;
import org.gradle.api.plugins.PluginAware;
import org.jetbrains.annotations.NotNull;

public class LittleMaidLoomPluginBootstrap implements Plugin<PluginAware> {

    private static final String PLUGIN_CLASS_NAME = "io.github.yukkuritaku.loom.LittleMaidLoomPlugin";

    BootstrappedPlugin getActivePlugin() {
        try {
            return (BootstrappedPlugin)Class.forName(PLUGIN_CLASS_NAME).getConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Failed to bootstrap maidgradle", e);
        }
    }
    @Override
    public void apply(@NotNull PluginAware target) {
        this.getActivePlugin().apply(target);
    }
}
