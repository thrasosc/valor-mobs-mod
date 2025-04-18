package net.pixeldreamstudios.valor_mobs;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;
import net.pixeldreamstudios.valor_mobs.entity.client.renderer.*;
import net.pixeldreamstudios.valor_mobs.registry.EntityTypeRegistry;

public class ValorMobsClient implements ClientModInitializer {

  @Override
  public void onInitializeClient() {
    EntityRendererRegistry.INSTANCE.register(
        EntityTypeRegistry.EXECUTIONER, ExecutionerRenderer::new);
    EntityRendererRegistry.INSTANCE.register(EntityTypeRegistry.SPHINX, SphinxRenderer::new);
    EntityRendererRegistry.INSTANCE.register(EntityTypeRegistry.MUMMY, MummyRenderer::new);
    EntityRendererRegistry.INSTANCE.register(
        EntityTypeRegistry.AZTEC_WARRIOR, AztecWarriorRenderer::new);
    EntityRendererRegistry.INSTANCE.register(
        EntityTypeRegistry.JAGUAR_WARRIOR, JaguarWarriorRenderer::new);
    EntityRendererRegistry.INSTANCE.register(
        EntityTypeRegistry.SET_SERVANT, SetServantRenderer::new);
  }
}
