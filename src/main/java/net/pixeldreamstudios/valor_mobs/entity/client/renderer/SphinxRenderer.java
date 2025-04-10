package net.pixeldreamstudios.valor_mobs.entity.client.renderer;

import mod.azure.azurelib.rewrite.render.entity.AzEntityRenderer;
import mod.azure.azurelib.rewrite.render.entity.AzEntityRendererConfig;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.pixeldreamstudios.valor_mobs.ValorMobs;
import net.pixeldreamstudios.valor_mobs.entity.animator.SphinxAnimator;
import net.pixeldreamstudios.valor_mobs.entity.valor_monster.normal.Sphinx;

public class SphinxRenderer extends AzEntityRenderer<Sphinx> {
  private static final ResourceLocation MODEL =
      ResourceLocation.fromNamespaceAndPath(ValorMobs.MOD_ID, "geo/entity/sphinx.geo.json");
  private static final ResourceLocation TEXTURE =
      ResourceLocation.fromNamespaceAndPath(ValorMobs.MOD_ID, "textures/entity/sphinx.png");

  public SphinxRenderer(EntityRendererProvider.Context context) {
    super(
        AzEntityRendererConfig.<Sphinx>builder(MODEL, TEXTURE)
            .setAnimatorProvider(SphinxAnimator::new)
            .setDeathMaxRotation(0.0F)
            .build(),
        context);
    this.shadowRadius = 1.25F;
  }
}
