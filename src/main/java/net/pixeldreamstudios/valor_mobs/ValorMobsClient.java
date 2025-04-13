package net.pixeldreamstudios.valor_mobs;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;
import net.pixeldreamstudios.valor_mobs.entity.client.renderer.ExecutionerRenderer;
import net.pixeldreamstudios.valor_mobs.entity.client.renderer.MummyRenderer;
import net.pixeldreamstudios.valor_mobs.entity.client.renderer.SphinxRenderer;
import net.pixeldreamstudios.valor_mobs.registry.EntityTypeRegistry;

public class ValorMobsClient implements ClientModInitializer {

  @Override
  public void onInitializeClient() {
    EntityRendererRegistry.INSTANCE.register(
        EntityTypeRegistry.EXECUTIONER, (context) -> new ExecutionerRenderer(context));
    EntityRendererRegistry.INSTANCE.register(
        EntityTypeRegistry.SPHINX, (context) -> new SphinxRenderer(context));
    EntityRendererRegistry.INSTANCE.register(
        EntityTypeRegistry.MUMMY, (context) -> new MummyRenderer(context));
  }
}
