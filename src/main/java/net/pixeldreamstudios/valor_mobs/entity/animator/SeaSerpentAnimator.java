package net.pixeldreamstudios.valor_mobs.entity.animator;

import mod.azure.azurelib.rewrite.animation.controller.AzAnimationController;
import mod.azure.azurelib.rewrite.animation.controller.AzAnimationControllerContainer;
import mod.azure.azurelib.rewrite.animation.controller.keyframe.AzKeyframeCallbacks;
import mod.azure.azurelib.rewrite.animation.impl.AzEntityAnimator;
import net.minecraft.resources.ResourceLocation;
import net.pixeldreamstudios.valor_mobs.ValorMobs;
import net.pixeldreamstudios.valor_mobs.entity.valor_monster.hard.SeaSerpent;
import org.jetbrains.annotations.NotNull;

public class SeaSerpentAnimator extends AzEntityAnimator<SeaSerpent> {
  private static final ResourceLocation ANIMATIONS =
      ResourceLocation.fromNamespaceAndPath(
          ValorMobs.MOD_ID, "animations/entity/sea_serpent.animation.json");

  @Override
  public void registerControllers(AzAnimationControllerContainer azAnimationControllerContainer) {
    azAnimationControllerContainer.add(
        AzAnimationController.builder(this, "base_controller")
            .setKeyframeCallbacks(AzKeyframeCallbacks.<SeaSerpent>builder().build())
            .setTransitionLength(10)
            .build());
  }

  @Override
  public @NotNull ResourceLocation getAnimationLocation(SeaSerpent seaSerpent) {
    return ANIMATIONS;
  }
}
