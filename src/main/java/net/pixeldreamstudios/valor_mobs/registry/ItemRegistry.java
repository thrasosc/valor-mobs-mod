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
  public static final Item SPHINX_SPAWN_EGG =
      register(
          new SpawnEggItem(EntityTypeRegistry.SPHINX, 0xC6A779, 0x402F21, new Item.Properties()),
          "sphinx_spawn_egg");
  public static final Item MUMMY_SPAWN_EGG =
      register(
          new SpawnEggItem(EntityTypeRegistry.MUMMY, 0x655B4E, 0x69584A, new Item.Properties()),
          "mummy_spawn_egg");
  public static final Item AZTEC_WARRIOR_SPAWN_EGG =
      register(
          new SpawnEggItem(
              EntityTypeRegistry.AZTEC_WARRIOR, 0xD5E2D1, 0x5A956A, new Item.Properties()),
          "aztec_warrior_spawn_egg");
  public static final Item JAGUAR_WARRIOR_SPAWN_EGG =
      register(
          new SpawnEggItem(
              EntityTypeRegistry.JAGUAR_WARRIOR, 0xD8AE56, 0x5D411D, new Item.Properties()),
          "jaguar_warrior_spawn_egg");
  public static final Item SET_SERVANT_SPAWN_EGG =
      register(
          new SpawnEggItem(
              EntityTypeRegistry.SET_SERVANT, 0x554A49, 0x8C3D28, new Item.Properties()),
          "set_servant_spawn_egg");
  public static final Item EAGLE_WARRIOR_SPAWN_EGG =
      register(
          new SpawnEggItem(
              EntityTypeRegistry.EAGLE_WARRIOR, 0x4A362E, 0xDBDAD7, new Item.Properties()),
          "eagle_warrior_spawn_egg");

  public static Item register(Item item, String id) {
    ResourceLocation itemID = ResourceLocation.fromNamespaceAndPath(ValorMobs.MOD_ID, id);
    Item registeredItem = Registry.register(BuiltInRegistries.ITEM, itemID, item);

    return registeredItem;
  }

  public static void init() {
    ValorMobs.LOGGER.info("Registering items");
  }
}
