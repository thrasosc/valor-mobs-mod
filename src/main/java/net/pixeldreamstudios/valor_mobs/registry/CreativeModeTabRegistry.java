package net.pixeldreamstudios.valor_mobs.registry;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.pixeldreamstudios.valor_mobs.ValorMobs;

public class CreativeModeTabRegistry {
  public static final ResourceKey<CreativeModeTab> VALOR_MOBS_GROUP_KEY =
      ResourceKey.create(
          BuiltInRegistries.CREATIVE_MODE_TAB.key(),
          ResourceLocation.fromNamespaceAndPath(ValorMobs.MOD_ID, "creative_mode_tab"));
  public static final CreativeModeTab VALOR_MOBS_CREATIVE_MODE_TAB =
      FabricItemGroup.builder()
          .icon(() -> new ItemStack(ItemRegistry.EXECUTIONER_SPAWN_EGG))
          .title(Component.translatable("creative_mode_tab." + ValorMobs.MOD_ID))
          .build();

  public static void init() {
    ValorMobs.LOGGER.info("Registering creative mode tabs");

    Registry.register(
        BuiltInRegistries.CREATIVE_MODE_TAB, VALOR_MOBS_GROUP_KEY, VALOR_MOBS_CREATIVE_MODE_TAB);
    ItemGroupEvents.modifyEntriesEvent(VALOR_MOBS_GROUP_KEY)
        .register(
            creativeModeTab -> {
              creativeModeTab.accept(ItemRegistry.EXECUTIONER_SPAWN_EGG);
              creativeModeTab.accept(ItemRegistry.SPHINX_SPAWN_EGG);
              creativeModeTab.accept(ItemRegistry.MUMMY_SPAWN_EGG);
            });
  }
}
