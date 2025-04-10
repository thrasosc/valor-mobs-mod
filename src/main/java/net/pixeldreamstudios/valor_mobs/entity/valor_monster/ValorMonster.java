package net.pixeldreamstudios.valor_mobs.entity.valor_monster;

import mod.azure.azurelib.rewrite.util.MoveAnalysis;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.pixeldreamstudios.valor_mobs.entity.helper.AnimationDispatcher;

public abstract class ValorMonster extends Monster {
  public final AnimationDispatcher animationDispatcher;
  public final MoveAnalysis moveAnalysis;

  public ValorMonster(EntityType<? extends Monster> entityType, Level level) {
    super(entityType, level);
    this.animationDispatcher = new AnimationDispatcher(this);
    this.moveAnalysis = new MoveAnalysis(this);
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
  public boolean doHurtTarget(Entity entity) {
    Runnable animationRunner = animationDispatcher::attack;
    animationRunner.run();
    return super.doHurtTarget(entity);
  }

  @Override
  protected void registerGoals() {
    this.goalSelector.addGoal(0, new FloatGoal(this));
    this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.0D, true));
    this.goalSelector.addGoal(2, new WaterAvoidingRandomStrollGoal(this, 0.75D));
    this.goalSelector.addGoal(3, new LookAtPlayerGoal(this, Player.class, 8.0F));
    this.goalSelector.addGoal(4, new RandomLookAroundGoal(this));

    this.targetSelector.addGoal(0, new NearestAttackableTargetGoal<>(this, Player.class, true));
  }
}
