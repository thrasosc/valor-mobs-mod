package net.pixeldreamstudios.valor_mobs.entity.client.renderer;

import mod.azure.azurelib.rewrite.render.entity.AzEntityRenderer;
import mod.azure.azurelib.rewrite.render.entity.AzEntityRendererConfig;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.pixeldreamstudios.valor_mobs.ValorMobs;
import net.pixeldreamstudios.valor_mobs.entity.animator.EagleWarriorAnimator;
import net.pixeldreamstudios.valor_mobs.entity.valor_monster.normal.EagleWarrior;

public class EagleWarriorRenderer extends AzEntityRenderer<EagleWarrior> {
  private static final ResourceLocation MODEL =
      ResourceLocation.fromNamespaceAndPath(ValorMobs.MOD_ID, "geo/entity/eagle_warrior.geo.json");
  private static final ResourceLocation TEXTURE =
      ResourceLocation.fromNamespaceAndPath(ValorMobs.MOD_ID, "textures/entity/eagle_warrior.png");

  public EagleWarriorRenderer(EntityRendererProvider.Context context) {
    super(
        AzEntityRendererConfig.<EagleWarrior>builder(MODEL, TEXTURE)
            .setAnimatorProvider(EagleWarriorAnimator::new)
            .setDeathMaxRotation(0.0F)
            .build(),
        context);
    this.shadowRadius = 0.5F;
  }
}
