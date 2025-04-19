package net.pixeldreamstudios.valor_mobs.registry;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.pixeldreamstudios.valor_mobs.ValorMobs;
import net.pixeldreamstudios.valor_mobs.entity.valor_monster.easy.AztecWarrior;
import net.pixeldreamstudios.valor_mobs.entity.valor_monster.easy.Mummy;
import net.pixeldreamstudios.valor_mobs.entity.valor_monster.hard.Executioner;
import net.pixeldreamstudios.valor_mobs.entity.valor_monster.hard.SetServant;
import net.pixeldreamstudios.valor_mobs.entity.valor_monster.normal.EagleWarrior;
import net.pixeldreamstudios.valor_mobs.entity.valor_monster.normal.JaguarWarrior;
import net.pixeldreamstudios.valor_mobs.entity.valor_monster.normal.Sphinx;

public class EntityTypeRegistry {
  public static final EntityType<Executioner> EXECUTIONER =
      register(Executioner::new, "executioner", 1.25F, 3);
  public static final EntityType<Sphinx> SPHINX = register(Sphinx::new, "sphinx", 2, 2);
  public static final EntityType<Mummy> MUMMY = register(Mummy::new, "mummy", 1, 2);
  public static final EntityType<AztecWarrior> AZTEC_WARRIOR =
      register(AztecWarrior::new, "aztec_warrior", 1, 2);
  public static final EntityType<JaguarWarrior> JAGUAR_WARRIOR =
      register(JaguarWarrior::new, "jaguar_warrior", 1, 2);
  public static final EntityType<SetServant> SET_SERVANT =
      register(SetServant::new, "set_servant", 1.5F, 3.1F);
  public static final EntityType<EagleWarrior> EAGLE_WARRIOR =
      register(EagleWarrior::new, "eagle_warrior", 1.0F, 2.0F);

  public static <T extends Entity> EntityType<T> register(
      EntityType.EntityFactory<T> factory, String id, float width, float height) {
    ResourceLocation entityTypeID = ResourceLocation.fromNamespaceAndPath(ValorMobs.MOD_ID, id);
    EntityType<T> registeredEntityType =
        Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            entityTypeID,
            EntityType.Builder.of(factory, MobCategory.MONSTER).sized(width, height).build(id));

    return registeredEntityType;
  }

  public static void init() {
    ValorMobs.LOGGER.info("Registering entities");

    FabricDefaultAttributeRegistry.register(EXECUTIONER, Executioner.createAttributes());
    FabricDefaultAttributeRegistry.register(SPHINX, Sphinx.createAttributes());
    FabricDefaultAttributeRegistry.register(MUMMY, Mummy.createAttributes());
    FabricDefaultAttributeRegistry.register(AZTEC_WARRIOR, AztecWarrior.createAttributes());
    FabricDefaultAttributeRegistry.register(JAGUAR_WARRIOR, JaguarWarrior.createAttributes());
    FabricDefaultAttributeRegistry.register(SET_SERVANT, SetServant.createAttributes());
    FabricDefaultAttributeRegistry.register(EAGLE_WARRIOR, EagleWarrior.createAttributes());
  }
}
