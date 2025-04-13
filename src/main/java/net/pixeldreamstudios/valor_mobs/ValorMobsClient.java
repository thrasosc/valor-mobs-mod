package net.pixeldreamstudios.valor_mobs;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;
import net.pixeldreamstudios.valor_mobs.entity.client.renderer.AztecWarriorRenderer;
import net.pixeldreamstudios.valor_mobs.entity.client.renderer.ExecutionerRenderer;
import net.pixeldreamstudios.valor_mobs.entity.client.renderer.MummyRenderer;
import net.pixeldreamstudios.valor_mobs.entity.client.renderer.SphinxRenderer;
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
  }
}
