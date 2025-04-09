package net.pixeldreamstudios.valor_mobs;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;

@Config(name = ValorMobs.MOD_ID)
public class ValorMobsConfig implements ConfigData {
  // Executioner
  @ConfigEntry.Category("executioner")
  @ConfigEntry.Gui.NoTooltip
  @ConfigEntry.BoundedDiscrete(min = 1, max = 100)
  public int executionerHealth = 30;

  @ConfigEntry.Category("executioner")
  @ConfigEntry.Gui.NoTooltip
  @ConfigEntry.BoundedDiscrete(min = 1, max = 20)
  public int executionerAttackDamage = 5;

  @ConfigEntry.Category("executioner")
  @ConfigEntry.Gui.NoTooltip
  @ConfigEntry.BoundedDiscrete(max = 100)
  public int executionerSpawnWeight = 10;
}
