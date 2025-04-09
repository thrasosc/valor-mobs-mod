package net.pixeldreamstudios.valor_mobs.registry;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SpawnEggItem;
import net.pixeldreamstudios.valor_mobs.ValorMobs;

public class ItemRegistry {
  public static final Item EXECUTIONER_SPAWN_EGG =
      register(
          new SpawnEggItem(
              EntityTypeRegistry.EXECUTIONER, 0xD5D0C1, 0x484237, new Item.Properties()),
          "executioner_spawn_egg");

  public static Item register(Item item, String id) {
    ResourceLocation itemID = ResourceLocation.fromNamespaceAndPath(ValorMobs.MOD_ID, id);
    Item registeredItem = Registry.register(BuiltInRegistries.ITEM, itemID, item);

    return registeredItem;
  }

  public static void init() {
    ValorMobs.LOGGER.info("Registering items");
  }
}
