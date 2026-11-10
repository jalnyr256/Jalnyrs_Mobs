package net.jalnyr.jalnyrsmobs.entity.client;// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.jalnyr.jalnyrsmobs.entity.animation.CorruptedGuardAnimations;
import net.jalnyr.jalnyrsmobs.entity.custom.CorruptedGuardEntity;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;

public class CorruptedGuardModel extends HierarchicalModel<CorruptedGuardEntity> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "guard"), "main");
	private final ModelPart guard;
	private final ModelPart body;
	private final ModelPart torso;
	private final ModelPart head;
	private final ModelPart hand1;
	private final ModelPart arm1;
	private final ModelPart hand2;
	private final ModelPart arm2;
	private final ModelPart leg1;
	private final ModelPart foot1;
	private final ModelPart leg2;
	private final ModelPart foot2;

	public CorruptedGuardModel(ModelPart root) {
		this.guard = root.getChild("guard");
		this.body = this.guard.getChild("body");
		this.torso = this.body.getChild("torso");
		this.head = this.torso.getChild("head");
		this.hand1 = this.torso.getChild("hand1");
		this.arm1 = this.hand1.getChild("arm1");
		this.hand2 = this.torso.getChild("hand2");
		this.arm2 = this.hand2.getChild("arm2");
		this.leg1 = this.body.getChild("leg1");
		this.foot1 = this.leg1.getChild("foot1");
		this.leg2 = this.body.getChild("leg2");
		this.foot2 = this.leg2.getChild("foot2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition guard = partdefinition.addOrReplaceChild("guard", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body = guard.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition torso = body.addOrReplaceChild("torso", CubeListBuilder.create().texOffs(56, 61).addBox(-4.0F, -8.0F, -6.0F, 8.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -22.0F, 0.0F));

		PartDefinition cube_r1 = torso.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-10.0F, -8.0F, -6.0F, 21.0F, 11.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -10.0F, -5.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r2 = torso.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 22).addBox(-6.0F, -5.0F, -6.0F, 8.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition head = torso.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, -19.0F, -3.0F));

		PartDefinition cube_r3 = head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 50).addBox(-2.0F, -2.0F, -4.0F, 7.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -7.0F, -4.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition cube_r4 = head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(62, 44).addBox(-4.0F, -7.0F, -2.0F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 0.0F, -2.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hand1 = torso.addOrReplaceChild("hand1", CubeListBuilder.create(), PartPose.offsetAndRotation(7.0F, -20.0F, -4.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r5 = hand1.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 59).addBox(-1.0F, -3.0F, -2.0F, 10.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.0F, 2.0F, -2.0F, 0.6505F, 0.4242F, 1.0446F));

		PartDefinition cube_r6 = hand1.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(30, 37).addBox(-1.0F, -1.0F, -3.0F, 9.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3491F, 0.0F));

		PartDefinition arm1 = hand1.addOrReplaceChild("arm1", CubeListBuilder.create(), PartPose.offsetAndRotation(9.0F, 8.0F, -8.0F, 0.0F, -0.48F, 0.0F));

		PartDefinition cube_r7 = arm1.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(32, 22).addBox(-1.0F, -2.0F, -9.0F, 3.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3041F, 0.9316F, -1.0625F));

		PartDefinition cube_r8 = arm1.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(62, 22).addBox(-3.0F, -3.0F, -4.0F, 6.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.0F, 3.0F, -6.0F, -0.3041F, 0.9316F, -1.0625F));

		PartDefinition hand2 = torso.addOrReplaceChild("hand2", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.0F, -17.0F, -2.0F, -0.3927F, 0.0F, -3.1416F));

		PartDefinition cube_r9 = hand2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(28, 61).addBox(-1.0F, -3.0F, -2.0F, 10.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.0F, 2.0F, -2.0F, -0.5078F, 0.5198F, -0.7044F));

		PartDefinition cube_r10 = hand2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(30, 49).addBox(-1.0F, -1.0F, -3.0F, 9.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3491F, 0.0F));

		PartDefinition arm2 = hand2.addOrReplaceChild("arm2", CubeListBuilder.create(), PartPose.offsetAndRotation(10.0F, -4.0F, -8.0F, -0.1466F, -0.3124F, 1.6073F));

		PartDefinition cube_r11 = arm2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 35).addBox(-1.0F, -2.0F, -9.0F, 3.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3041F, 0.9316F, -1.0625F));

		PartDefinition cube_r12 = arm2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(62, 33).addBox(-3.0F, -3.0F, -4.0F, 6.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.0F, 5.0F, -6.0F, -0.3041F, 0.9316F, -1.0625F));

		PartDefinition leg1 = body.addOrReplaceChild("leg1", CubeListBuilder.create().texOffs(64, 16).addBox(-1.0F, 10.0F, -3.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(6.0F, -25.0F, -3.0F));

		PartDefinition cube_r13 = leg1.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(24, 69).addBox(-1.0F, -11.0F, -2.0F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 11.0F, -1.0F, -0.2292F, 0.9648F, -0.317F));

		PartDefinition foot1 = leg1.addOrReplaceChild("foot1", CubeListBuilder.create(), PartPose.offset(0.0F, 11.0F, 0.0F));

		PartDefinition cube_r14 = foot1.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(64, 0).addBox(-2.0F, -2.0F, -5.0F, 4.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 14.0F, 1.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition cube_r15 = foot1.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 67).addBox(-1.0F, -13.0F, -2.0F, 3.0F, 13.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 13.0F, 1.0F, 0.1298F, -0.017F, 0.1298F));

		PartDefinition leg2 = body.addOrReplaceChild("leg2", CubeListBuilder.create().texOffs(48, 70).addBox(-1.0F, 10.0F, -2.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.0F, -25.0F, -4.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r16 = leg2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(36, 69).addBox(-1.0F, -11.0F, -2.0F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 11.0F, 0.0F, -0.2292F, 0.9648F, -0.317F));

		PartDefinition foot2 = leg2.addOrReplaceChild("foot2", CubeListBuilder.create(), PartPose.offset(0.0F, 11.0F, 0.0F));

		PartDefinition cube_r17 = foot2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(12, 67).addBox(-1.0F, -13.0F, -2.0F, 3.0F, 13.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 13.0F, 2.0F, 0.1298F, -0.017F, 0.1298F));

		PartDefinition cube_r18 = foot2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(64, 8).addBox(-2.0F, -2.0F, -5.0F, 4.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 14.0F, 2.0F, 0.0F, -0.7854F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}
    private void applyHeadRotation(float pNetHeadYaw, float pHeadPitch, float pAgeInTicks) {
        pNetHeadYaw = Mth.clamp(pNetHeadYaw, -30.0F, 30.0F);
        pHeadPitch = Mth.clamp(pHeadPitch, -25.0F, 45.0F);

        this.head.yRot = pNetHeadYaw * ((float)Math.PI / 180F);
        this.head.xRot = pHeadPitch * ((float)Math.PI / 180F);
    }
	@Override
	public void setupAnim(CorruptedGuardEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
        this.applyHeadRotation(netHeadYaw, headPitch, ageInTicks);

        this.animateWalk(CorruptedGuardAnimations.WALK, limbSwing, limbSwingAmount, 2f, 1.5f);
        this.animate(entity.getAnimationState("idle"), CorruptedGuardAnimations.IDLE, ageInTicks, 1f);
        this.animate(entity.getAnimationState("attack"), CorruptedGuardAnimations.PUNCH, ageInTicks, 1.25f);
        this.animate(entity.getAnimationState("attack2"), CorruptedGuardAnimations.SMASH, ageInTicks, 1f);
        this.animate(entity.getAnimationState("attack3"), CorruptedGuardAnimations.BODY_SLAM, ageInTicks, 1f);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		guard.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

    @Override
    public ModelPart root() {
        return guard;
    }
}