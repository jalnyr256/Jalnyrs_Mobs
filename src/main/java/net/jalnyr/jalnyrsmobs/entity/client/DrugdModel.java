package net.jalnyr.jalnyrsmobs.entity.client;// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.jalnyr.jalnyrsmobs.entity.animation.DrugdAnimations;
import net.jalnyr.jalnyrsmobs.entity.custom.DrugdEntity;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;

public class DrugdModel extends HierarchicalModel<DrugdEntity> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "drugd"), "main");
	private final ModelPart drugd;
	private final ModelPart body;
	private final ModelPart leg1;
	private final ModelPart leg2;
	private final ModelPart torso;
	private final ModelPart head;
	private final ModelPart hand1;
	private final ModelPart hand2;

	public DrugdModel(ModelPart root) {
		this.drugd = root.getChild("drugd");
		this.body = this.drugd.getChild("body");
		this.leg1 = this.body.getChild("leg1");
		this.leg2 = this.body.getChild("leg2");
		this.torso = this.body.getChild("torso");
		this.head = this.torso.getChild("head");
		this.hand1 = this.torso.getChild("hand1");
		this.hand2 = this.torso.getChild("hand2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition drugd = partdefinition.addOrReplaceChild("drugd", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body = drugd.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition leg1 = body.addOrReplaceChild("leg1", CubeListBuilder.create().texOffs(16, 9).addBox(-1.0F, -1.0F, -3.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = leg1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 17).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 1.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition leg2 = body.addOrReplaceChild("leg2", CubeListBuilder.create().texOffs(16, 14).addBox(-1.0F, -1.0F, -3.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, 0.0F, 0.0F));

		PartDefinition cube_r2 = leg2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(8, 17).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 1.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition torso = body.addOrReplaceChild("torso", CubeListBuilder.create(), PartPose.offset(0.0F, -4.0F, 0.0F));

		PartDefinition cube_r3 = torso.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -4.0F, -3.0F, 6.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, -2.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition head = torso.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 9).addBox(-2.0F, -4.0F, -6.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition hand1 = torso.addOrReplaceChild("hand1", CubeListBuilder.create(), PartPose.offset(3.0F, -1.0F, -2.0F));

		PartDefinition cube_r4 = hand1.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 22).addBox(0.0F, -2.0F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0F, -2.0F, -0.4363F, 0.0F, -3.1416F));

		PartDefinition cube_r5 = hand1.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(16, 19).addBox(-1.0F, -1.0F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0F, 0.0F, 1.1781F, 0.0F, 0.0F));

		PartDefinition hand2 = torso.addOrReplaceChild("hand2", CubeListBuilder.create(), PartPose.offset(-4.0F, -1.0F, -2.0F));

		PartDefinition cube_r6 = hand2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(22, 4).addBox(0.0F, -2.0F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0F, -2.0F, -0.4363F, 0.0F, -3.1416F));

		PartDefinition cube_r7 = hand2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(22, 0).addBox(-1.0F, -1.0F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0F, 0.0F, 1.1781F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}
	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		drugd.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

    @Override
    public ModelPart root() {
        return drugd;
    }

    @Override
    public void setupAnim(DrugdEntity pEntity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);

        this.animateWalk(DrugdAnimations.WALK, limbSwing, limbSwingAmount, 2f, 2.5f);
        this.animate(((DrugdEntity) pEntity).idleAnimationState, DrugdAnimations.IDLE, ageInTicks, 1f);
    }
}