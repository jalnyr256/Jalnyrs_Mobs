package net.jalnyr.jalnyrsmobs.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.jalnyr.jalnyrsmobs.Jalnyrsmobs;
import net.jalnyr.jalnyrsmobs.entity.custom.CorruptedGuardEntity;
import net.jalnyr.jalnyrsmobs.entity.custom.DrugdEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class DrugdRenderer extends MobRenderer<DrugdEntity, DrugdModel> {

    public DrugdRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new DrugdModel(pContext.bakeLayer(ModModelLayers.DRUGD_LAYER)), 1f);
    }

    @Override
    public ResourceLocation getTextureLocation(DrugdEntity pEntity) {
        return new ResourceLocation(Jalnyrsmobs.MOD_ID, "textures/entity/drugd.png");
    }

    @Override
    public void render(DrugdEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack, MultiBufferSource pBuffer, int pPackedLight) {
        if(pEntity.isBaby()) {
            pMatrixStack.scale(1f, 3f, 1f);
        }

        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}
