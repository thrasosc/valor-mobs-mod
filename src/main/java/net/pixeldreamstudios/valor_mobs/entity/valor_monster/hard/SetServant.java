package net.pixeldreamstudios.valor_mobs.entity.valor_monster.hard;

import mod.azure.azurelib.common.api.common.ai.pathing.AzureNavigation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.Level;

public class SetServant extends HardMonster {
  public SetServant(EntityType<? extends Monster> entityType, Level level) {
    super(entityType, level);
    this.navigation = new AzureNavigation(this, level);
  }

  @Override
  protected SoundEvent getAmbientSound() {
    playSound(SoundEvents.PILLAGER_AMBIENT, 1.0f, 0.25f);
    return null;
  }

  @Override
  protected SoundEvent getHurtSound(DamageSource source) {
    playSound(SoundEvents.PILLAGER_HURT, 1.0f, 0.25f);
    return null;
  }

  @Override
  protected SoundEvent getDeathSound() {
    playSound(SoundEvents.PILLAGER_DEATH, 1.0f, 0.5f);
    return null;
  }
}
