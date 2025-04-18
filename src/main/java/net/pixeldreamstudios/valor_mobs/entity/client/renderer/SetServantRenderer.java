package net.pixeldreamstudios.valor_mobs.entity.client.renderer;

import mod.azure.azurelib.rewrite.render.entity.AzEntityRenderer;
import mod.azure.azurelib.rewrite.render.entity.AzEntityRendererConfig;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.pixeldreamstudios.valor_mobs.ValorMobs;
import net.pixeldreamstudios.valor_mobs.entity.animator.SetServantAnimator;
import net.pixeldreamstudios.valor_mobs.entity.valor_monster.hard.SetServant;

public class SetServantRenderer extends AzEntityRenderer<SetServant> {
  private static final ResourceLocation MODEL =
      ResourceLocation.fromNamespaceAndPath(ValorMobs.MOD_ID, "geo/entity/set_servant.geo.json");
  private static final ResourceLocation TEXTURE =
      ResourceLocation.fromNamespaceAndPath(ValorMobs.MOD_ID, "textures/entity/set_servant.png");

  public SetServantRenderer(EntityRendererProvider.Context context) {
    super(
        AzEntityRendererConfig.<SetServant>builder(MODEL, TEXTURE)
            .setAnimatorProvider(SetServantAnimator::new)
            .setDeathMaxRotation(0.0F)
            .build(),
        context);
    this.shadowRadius = 0.5F;
  }
}
