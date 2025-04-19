package net.pixeldreamstudios.valor_mobs.entity.valor_monster.hard;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.Level;

public class SeaSerpent extends HardMonster {

  public SeaSerpent(EntityType<? extends Monster> entityType, Level level) {
    super(entityType, level);
  }

  @Override
  protected SoundEvent getAmbientSound() {
    playSound(SoundEvents.GUARDIAN_AMBIENT, 1.0f, 0.25f);
    return null;
  }

  @Override
  protected SoundEvent getHurtSound(DamageSource source) {
    playSound(SoundEvents.GUARDIAN_HURT, 1.0f, 0.25f);
    return null;
  }

  @Override
  protected SoundEvent getDeathSound() {
    playSound(SoundEvents.GUARDIAN_DEATH, 1.0f, 0.25f);
    return null;
  }
}
