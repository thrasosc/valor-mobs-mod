package net.pixeldreamstudios.valor_mobs.entity.client.renderer;

import mod.azure.azurelib.rewrite.render.entity.AzEntityRenderer;
import mod.azure.azurelib.rewrite.render.entity.AzEntityRendererConfig;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.pixeldreamstudios.valor_mobs.ValorMobs;
import net.pixeldreamstudios.valor_mobs.entity.animator.AztecWarriorAnimator;
import net.pixeldreamstudios.valor_mobs.entity.valor_monster.easy.AztecWarrior;

public class AztecWarriorRenderer extends AzEntityRenderer<AztecWarrior> {
  private static final ResourceLocation MODEL =
      ResourceLocation.fromNamespaceAndPath(ValorMobs.MOD_ID, "geo/entity/aztec_warrior.geo.json");
  private static final ResourceLocation TEXTURE =
      ResourceLocation.fromNamespaceAndPath(ValorMobs.MOD_ID, "textures/entity/aztec_warrior.png");

  public AztecWarriorRenderer(EntityRendererProvider.Context context) {
    super(
        AzEntityRendererConfig.<AztecWarrior>builder(MODEL, TEXTURE)
            .setAnimatorProvider(AztecWarriorAnimator::new)
            .setDeathMaxRotation(0.0F)
            .build(),
        context);
    this.shadowRadius = 0.5F;
  }
}
