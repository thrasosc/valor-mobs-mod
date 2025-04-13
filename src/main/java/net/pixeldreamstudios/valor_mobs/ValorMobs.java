package net.pixeldreamstudios.valor_mobs;

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

  @Override
  public void onInitialize() {
    AzureLib.initialize();
    EntityTypeRegistry.init();
    ItemRegistry.init();
    CreativeModeTabRegistry.init();
  }
}
