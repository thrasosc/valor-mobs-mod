package net.pixeldreamstudios.valor_mobs.entity.client.renderer;

import mod.azure.azurelib.rewrite.render.entity.AzEntityRenderer;
import mod.azure.azurelib.rewrite.render.entity.AzEntityRendererConfig;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.pixeldreamstudios.valor_mobs.ValorMobs;
import net.pixeldreamstudios.valor_mobs.entity.animator.MummyAnimator;
import net.pixeldreamstudios.valor_mobs.entity.valor_monster.easy.Mummy;

public class MummyRenderer extends AzEntityRenderer<Mummy> {
  private static final ResourceLocation MODEL =
      ResourceLocation.fromNamespaceAndPath(ValorMobs.MOD_ID, "geo/entity/mummy.geo.json");
  private static final ResourceLocation TEXTURE =
      ResourceLocation.fromNamespaceAndPath(ValorMobs.MOD_ID, "textures/entity/mummy.png");

  public MummyRenderer(EntityRendererProvider.Context context) {
    super(
        AzEntityRendererConfig.<Mummy>builder(MODEL, TEXTURE)
            .setAnimatorProvider(MummyAnimator::new)
            .setDeathMaxRotation(0.0F)
            .build(),
        context);
    this.shadowRadius = 0.5F;
  }
}
