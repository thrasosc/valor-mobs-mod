package net.pixeldreamstudios.valor_mobs.entity.valor_monster.normal;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.Level;

public class Sphinx extends NormalMonster {
  public Sphinx(EntityType<? extends Monster> entityType, Level level) {
    super(entityType, level);
  }

  @Override
  public void tick() {
    super.tick();
    moveAnalysis.update();

    if (this.level().isClientSide) {
      var isMovingOnGround = moveAnalysis.isMovingHorizontally() && onGround();
      Runnable animationRunner;
      if (isMovingOnGround) {
        animationRunner = animationDispatcher::walk;
      } else {
        animationRunner = animationDispatcher::idle;
      }
      animationRunner.run();
    }
  }

  @Override
  protected SoundEvent getAmbientSound() {
    playSound(SoundEvents.GHAST_AMBIENT, 1.0f, 0.25f);
    return null;
  }

  @Override
  protected SoundEvent getHurtSound(DamageSource source) {
    playSound(SoundEvents.GHAST_HURT, 1.0f, 0.25f);
    return null;
  }

  @Override
  protected SoundEvent getDeathSound() {
    playSound(SoundEvents.GHAST_DEATH, 1.0f, 0.25f);
    return null;
  }
}
