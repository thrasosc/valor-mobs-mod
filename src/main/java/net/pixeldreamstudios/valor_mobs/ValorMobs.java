package net.pixeldreamstudios.valor_mobs;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import mod.azure.azurelib.common.internal.common.AzureLib;
import net.fabricmc.api.ModInitializer;
import net.pixeldreamstudios.valor_mobs.registry.CreativeModeTabRegistry;
import net.pixeldreamstudios.valor_mobs.registry.EntityTypeRegistry;
import net.pixeldreamstudios.valor_mobs.registry.ItemRegistry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ValorMobs implements ModInitializer {
  public static final String MOD_ID = "valor_mobs";
  public static final Logger LOGGER = LogManager.getLogger(MOD_ID);
  public static ValorMobsConfig config;

  @Override
  public void onInitialize() {
    AutoConfig.register(ValorMobsConfig.class, JanksonConfigSerializer::new);
    config = AutoConfig.getConfigHolder(ValorMobsConfig.class).getConfig();
    AzureLib.initialize();
    EntityTypeRegistry.init();
    ItemRegistry.init();
    CreativeModeTabRegistry.init();
  }
}
