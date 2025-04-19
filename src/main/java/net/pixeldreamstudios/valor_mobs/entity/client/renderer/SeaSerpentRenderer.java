package net.pixeldreamstudios.valor_mobs.entity.client.renderer;

import mod.azure.azurelib.rewrite.render.entity.AzEntityRenderer;
import mod.azure.azurelib.rewrite.render.entity.AzEntityRendererConfig;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.pixeldreamstudios.valor_mobs.ValorMobs;
import net.pixeldreamstudios.valor_mobs.entity.animator.SeaSerpentAnimator;
import net.pixeldreamstudios.valor_mobs.entity.valor_monster.hard.SeaSerpent;

public class SeaSerpentRenderer extends AzEntityRenderer<SeaSerpent> {
  private static final ResourceLocation MODEL =
      ResourceLocation.fromNamespaceAndPath(ValorMobs.MOD_ID, "geo/entity/sea_serpent.geo.json");
  private static final ResourceLocation TEXTURE =
      ResourceLocation.fromNamespaceAndPath(ValorMobs.MOD_ID, "textures/entity/sea_serpent.png");

  public SeaSerpentRenderer(EntityRendererProvider.Context context) {
    super(
        AzEntityRendererConfig.<SeaSerpent>builder(MODEL, TEXTURE)
            .setAnimatorProvider(SeaSerpentAnimator::new)
            .setDeathMaxRotation(0.0F)
            .build(),
        context);
    this.shadowRadius = 0.5F;
  }
}
