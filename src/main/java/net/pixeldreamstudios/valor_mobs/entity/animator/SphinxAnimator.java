package net.pixeldreamstudios.valor_mobs.entity.animator;

import mod.azure.azurelib.rewrite.animation.controller.AzAnimationController;
import mod.azure.azurelib.rewrite.animation.controller.AzAnimationControllerContainer;
import mod.azure.azurelib.rewrite.animation.controller.keyframe.AzKeyframeCallbacks;
import mod.azure.azurelib.rewrite.animation.impl.AzEntityAnimator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.pixeldreamstudios.valor_mobs.ValorMobs;
import net.pixeldreamstudios.valor_mobs.entity.valor_monster.normal.Sphinx;
import org.jetbrains.annotations.NotNull;

public class SphinxAnimator extends AzEntityAnimator<Sphinx> {
  private static final ResourceLocation ANIMATIONS =
      ResourceLocation.fromNamespaceAndPath(
          ValorMobs.MOD_ID, "animations/entity/sphinx.animation.json");

  @Override
  public void registerControllers(AzAnimationControllerContainer azAnimationControllerContainer) {
    azAnimationControllerContainer.add(
        AzAnimationController.builder(this, "base_controller")
            .setKeyframeCallbacks(
                AzKeyframeCallbacks.<Sphinx>builder()
                    .setSoundKeyframeHandler(
                        event -> {
                          if (event.getKeyframeData().getSound().equals("step")) {
                            event
                                .getAnimatable()
                                .level()
                                .playLocalSound(
                                    event.getAnimatable().getX(),
                                    event.getAnimatable().getY(),
                                    event.getAnimatable().getZ(),
                                    SoundEvents.COW_STEP,
                                    SoundSource.HOSTILE,
                                    1.0F, // volume
                                    0.5F, // pitch
                                    true // should have distance delay
                                    );
                          }
                        })
                    .build())
            .setTransitionLength(10)
            .build());
  }

  @Override
  public @NotNull ResourceLocation getAnimationLocation(Sphinx sphinx) {
    return ANIMATIONS;
  }
}
