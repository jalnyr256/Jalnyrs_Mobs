package net.jalnyr.jalnyrsmobs.entity.client;// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.jalnyr.jalnyrsmobs.entity.animation.CorruptedGuardAnimations;
import net.jalnyr.jalnyrsmobs.entity.animation.DrugdAnimations;
import net.jalnyr.jalnyrsmobs.entity.animation.DrugdBruteAnimations;
import net.jalnyr.jalnyrsmobs.entity.custom.CorruptedGuardEntity;
import net.jalnyr.jalnyrsmobs.entity.custom.DrugdBruteEntity;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;

public class DrugdBruteModel extends HierarchicalModel<DrugdBruteEntity> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "drugd"), "main");
	private final ModelPart drugd;
	private final ModelPart body;
	private final ModelPart leg1;
	private final ModelPart lower;
	private final ModelPart upper;
	private final ModelPart leg2;
	private final ModelPart lower2;
	private final ModelPart upper2;
	private final ModelPart torso;
	private final ModelPart head;
	private final ModelPart arm1;
	private final ModelPart arm2;

	public DrugdBruteModel(ModelPart root) {
		this.drugd = root.getChild("drugd");
		this.body = this.drugd.getChild("body");
		this.leg1 = this.body.getChild("leg1");
		this.lower = this.leg1.getChild("lower");
		this.upper = this.leg1.getChild("upper");
		this.leg2 = this.body.getChild("leg2");
		this.lower2 = this.leg2.getChild("lower2");
		this.upper2 = this.leg2.getChild("upper2");
		this.torso = this.body.getChild("torso");
		this.head = this.torso.getChild("head");
		this.arm1 = this.torso.getChild("arm1");
		this.arm2 = this.torso.getChild("arm2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition drugd = partdefinition.addOrReplaceChild("drugd", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 1.0F));

		PartDefinition body = drugd.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition leg1 = body.addOrReplaceChild("leg1", CubeListBuilder.create(), PartPose.offset(6.0F, -9.0F, -1.0F));

		PartDefinition lower = leg1.addOrReplaceChild("lower", CubeListBuilder.create().texOffs(24, 17).addBox(-2.0F, 5.0F, -1.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 3.0F, -2.0F));

		PartDefinition cube_r1 = lower.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(14, 36).addBox(-2.0F, -6.0F, -1.0F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.0F, 3.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition upper = leg1.addOrReplaceChild("upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r2 = upper.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(38, 36).addBox(-2.0F, -5.0F, -1.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 3.0F, -4.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition leg2 = body.addOrReplaceChild("leg2", CubeListBuilder.create(), PartPose.offset(-6.0F, -10.0F, -1.0F));

		PartDefinition lower2 = leg2.addOrReplaceChild("lower2", CubeListBuilder.create().texOffs(24, 23).addBox(-2.0F, 5.0F, -1.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 4.0F, -2.0F));

		PartDefinition cube_r3 = lower2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(26, 36).addBox(-2.0F, -6.0F, -1.0F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.0F, 3.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition upper2 = leg2.addOrReplaceChild("upper2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r4 = upper2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(40, 0).addBox(-2.0F, -7.0F, -1.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.0F, -5.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition torso = body.addOrReplaceChild("torso", CubeListBuilder.create(), PartPose.offset(0.0F, -11.0F, 0.0F));

		PartDefinition cube_r5 = torso.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -2.0F, -8.0F, 10.0F, 7.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0119F, -0.2667F, -0.7854F, 0.0F, 0.0F));

		PartDefinition head = torso.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 17).addBox(-3.0F, -7.0F, -13.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 3.0119F, -0.2667F));

		PartDefinition arm1 = torso.addOrReplaceChild("arm1", CubeListBuilder.create(), PartPose.offset(5.0F, 1.0119F, -6.2667F));

		PartDefinition cube_r6 = arm1.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(14, 29).addBox(-1.0F, -2.0F, -4.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 5.0F, -1.0F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r7 = arm1.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 29).addBox(-1.0F, -2.0F, -4.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0F, 1.0F, 1.1781F, 0.0F, 0.0F));

		PartDefinition arm2 = torso.addOrReplaceChild("arm2", CubeListBuilder.create(), PartPose.offset(-7.0F, 1.0119F, -6.2667F));

		PartDefinition cube_r8 = arm2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 36).addBox(-1.0F, -2.0F, -4.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 5.0F, -1.0F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r9 = arm2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(28, 29).addBox(-1.0F, -2.0F, -4.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0F, 1.0F, 1.1781F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}
    private void applyHeadRotation(float pNetHeadYaw, float pHeadPitch, float pAgeInTicks) {
        pNetHeadYaw = Mth.clamp(pNetHeadYaw, -30.0F, 30.0F);
        pHeadPitch = Mth.clamp(pHeadPitch, -25.0F, 45.0F);

        this.head.yRot = pNetHeadYaw * ((float)Math.PI / 180F);
        this.head.xRot = pHeadPitch * ((float)Math.PI / 180F);
    }
    @Override
    public void setupAnim(DrugdBruteEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
        this.applyHeadRotation(netHeadYaw, headPitch, ageInTicks);

        this.animateWalk(DrugdBruteAnimations.WALK, limbSwing, limbSwingAmount, 2f, 1.5f);
        this.animate(entity.getAnimationState("idle"), DrugdBruteAnimations.IDLE, ageInTicks, 1f);
        this.animate(entity.getAnimationState("attack"), DrugdBruteAnimations.HIT, ageInTicks, 1f);
    }

    @Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		drugd.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

    @Override
    public ModelPart root() {
        return drugd;
    }

}