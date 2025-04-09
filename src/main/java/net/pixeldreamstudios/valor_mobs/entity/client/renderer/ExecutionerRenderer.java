package net.pixeldreamstudios.valor_mobs.entity.client.renderer;

import mod.azure.azurelib.rewrite.render.entity.AzEntityRenderer;
import mod.azure.azurelib.rewrite.render.entity.AzEntityRendererConfig;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.pixeldreamstudios.valor_mobs.ValorMobs;
import net.pixeldreamstudios.valor_mobs.entity.animator.ExecutionerAnimator;
import net.pixeldreamstudios.valor_mobs.entity.valor_monster.hard.Executioner;

public class ExecutionerRenderer extends AzEntityRenderer<Executioner> {
  private static final ResourceLocation MODEL =
      ResourceLocation.fromNamespaceAndPath(ValorMobs.MOD_ID, "geo/entity/executioner.geo.json");
  private static final ResourceLocation TEXTURE =
      ResourceLocation.fromNamespaceAndPath(ValorMobs.MOD_ID, "textures/entity/executioner.png");

  public ExecutionerRenderer(EntityRendererProvider.Context context) {
    super(
        AzEntityRendererConfig.<Executioner>builder(MODEL, TEXTURE)
            .setAnimatorProvider(ExecutionerAnimator::new)
            .setDeathMaxRotation(0.0F)
            .build(),
        context);
    this.shadowRadius = 1.0F;
  }
}
