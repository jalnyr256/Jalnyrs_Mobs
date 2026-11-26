package net.jalnyr.jalnyrsmobs.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.jalnyr.jalnyrsmobs.Jalnyrsmobs;
import net.jalnyr.jalnyrsmobs.entity.custom.DrugdBruteEntity;
import net.jalnyr.jalnyrsmobs.entity.custom.DrugdMagicanEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class DrugdMagicanRenderer extends MobRenderer<DrugdMagicanEntity, DrugdMagicanModel> {

    public DrugdMagicanRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new DrugdMagicanModel(pContext.bakeLayer(ModModelLayers.DRUGD_MAGICAN_LAYER)), 1f);
    }

    @Override
    public ResourceLocation getTextureLocation(DrugdMagicanEntity pEntity) {
        return new ResourceLocation(Jalnyrsmobs.MOD_ID, "textures/entity/drugd_magican.png");
    }

    @Override
    public void render(DrugdMagicanEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack, MultiBufferSource pBuffer, int pPackedLight) {
        if(pEntity.isBaby()) {
            pMatrixStack.scale(1f, 3f, 1f);
        }

        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}
