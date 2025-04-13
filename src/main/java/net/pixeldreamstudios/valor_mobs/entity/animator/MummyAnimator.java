package net.pixeldreamstudios.valor_mobs.entity.animator;

import mod.azure.azurelib.rewrite.animation.controller.AzAnimationController;
import mod.azure.azurelib.rewrite.animation.controller.AzAnimationControllerContainer;
import mod.azure.azurelib.rewrite.animation.controller.keyframe.AzKeyframeCallbacks;
import mod.azure.azurelib.rewrite.animation.impl.AzEntityAnimator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.pixeldreamstudios.valor_mobs.ValorMobs;
import net.pixeldreamstudios.valor_mobs.entity.valor_monster.easy.Mummy;
import org.jetbrains.annotations.NotNull;

public class MummyAnimator extends AzEntityAnimator<Mummy> {
  private static final ResourceLocation ANIMATIONS =
      ResourceLocation.fromNamespaceAndPath(
          ValorMobs.MOD_ID, "animations/entity/mummy.animation.json");

  @Override
  public void registerControllers(AzAnimationControllerContainer azAnimationControllerContainer) {
    azAnimationControllerContainer.add(
        AzAnimationController.builder(this, "base_controller")
            .setKeyframeCallbacks(
                AzKeyframeCallbacks.<Mummy>builder()
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
                                    SoundEvents.HUSK_STEP,
                                    SoundSource.HOSTILE,
                                    1.0F, // volume
                                    0.75F, // pitch
                                    true // should have distance delay
                                    );
                          }
                        })
                    .build())
            .setTransitionLength(10)
            .build());
  }

  @Override
  public @NotNull ResourceLocation getAnimationLocation(Mummy mummy) {
    return ANIMATIONS;
  }
}
