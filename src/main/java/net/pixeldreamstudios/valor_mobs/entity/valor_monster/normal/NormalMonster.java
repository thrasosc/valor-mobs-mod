package net.pixeldreamstudios.valor_mobs.entity.valor_monster.normal;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.Enemy;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.Level;
import net.pixeldreamstudios.valor_mobs.entity.valor_monster.ValorMonster;

public abstract class NormalMonster extends ValorMonster {
  public NormalMonster(EntityType<? extends Monster> entityType, Level level) {
    super(entityType, level);
    this.xpReward = Enemy.XP_REWARD_MEDIUM;
  }

  public static AttributeSupplier.Builder createAttributes() {
    return Mob.createMobAttributes()
        .add(Attributes.MAX_HEALTH, 40)
        .add(Attributes.ARMOR, 1)
        .add(Attributes.KNOCKBACK_RESISTANCE, 0.5)
        .add(Attributes.ATTACK_DAMAGE, 4)
        .add(Attributes.ATTACK_KNOCKBACK, 1)
        .add(Attributes.MOVEMENT_SPEED, 0.23);
  }
}
