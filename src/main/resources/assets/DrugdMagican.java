// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class DrugdMagican<T extends DrugdMagicanModel> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "drugdmagican"), "main");
	private final ModelPart magican;
	private final ModelPart body;
	private final ModelPart leg1;
	private final ModelPart leg2;
	private final ModelPart torso;
	private final ModelPart arm1;
	private final ModelPart hand1;
	private final ModelPart book;
	private final ModelPart arm2;
	private final ModelPart head;
	private final ModelPart ball;
	private final ModelPart spike;
	private final ModelPart spike6;
	private final ModelPart spike2;
	private final ModelPart spike7;
	private final ModelPart spike3;
	private final ModelPart spike8;
	private final ModelPart spike4;
	private final ModelPart spike5;

	public DrugdMagican(ModelPart root) {
		this.magican = root.getChild("magican");
		this.body = this.magican.getChild("body");
		this.leg1 = this.body.getChild("leg1");
		this.leg2 = this.body.getChild("leg2");
		this.torso = this.body.getChild("torso");
		this.arm1 = this.torso.getChild("arm1");
		this.hand1 = this.arm1.getChild("hand1");
		this.book = this.hand1.getChild("book");
		this.arm2 = this.torso.getChild("arm2");
		this.head = this.torso.getChild("head");
		this.ball = this.body.getChild("ball");
		this.spike = this.body.getChild("spike");
		this.spike6 = this.body.getChild("spike6");
		this.spike2 = this.body.getChild("spike2");
		this.spike7 = this.body.getChild("spike7");
		this.spike3 = this.body.getChild("spike3");
		this.spike8 = this.body.getChild("spike8");
		this.spike4 = this.body.getChild("spike4");
		this.spike5 = this.body.getChild("spike5");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition magican = partdefinition.addOrReplaceChild("magican", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body = magican.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition leg1 = body.addOrReplaceChild("leg1", CubeListBuilder.create(), PartPose.offset(9.0F, -26.0F, 0.0F));

		PartDefinition cube_r1 = leg1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(38, 49).addBox(-2.2954F, -12.6257F, -2.5126F, 4.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 12.0F, -3.0F, -0.4363F, -0.3054F, 0.0F));

		PartDefinition cube_r2 = leg1.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(38, 32).addBox(-2.0F, -13.0F, -2.0F, 4.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.3054F, -0.3054F, 0.0F));

		PartDefinition cube_r3 = leg1.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(54, 50).addBox(-2.0F, -2.0F, -5.0F, 4.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 26.0F, 0.0F, 0.0F, -0.3054F, 0.0F));

		PartDefinition leg2 = body.addOrReplaceChild("leg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-9.0F, -26.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition cube_r4 = leg2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(16, 51).addBox(-2.2954F, -12.6257F, -2.5126F, 4.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 12.0F, -3.0F, -0.4363F, -0.3054F, 0.0F));

		PartDefinition cube_r5 = leg2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 51).addBox(-2.0F, -13.0F, -2.0F, 4.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.3054F, -0.3054F, 0.0F));

		PartDefinition cube_r6 = leg2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(54, 58).addBox(-2.0F, -2.0F, -5.0F, 4.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 26.0F, 0.0F, 0.0F, -0.3054F, 0.0F));

		PartDefinition torso = body.addOrReplaceChild("torso", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -26.0F, -3.0F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r7 = torso.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, -11.0F, -3.0F, 16.0F, 18.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.0F, 0.0F, 1.0036F, 0.0F, 0.0F));

		PartDefinition arm1 = torso.addOrReplaceChild("arm1", CubeListBuilder.create(), PartPose.offsetAndRotation(8.0F, 1.0F, -6.0F, 0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r8 = arm1.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(60, 0).addBox(-2.0F, -2.0F, -4.0F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 4.0F, -1.0F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r9 = arm1.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(46, 66).addBox(-2.5067F, 0.2995F, -1.6649F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.0F, 2.0F, -0.3963F, -0.4404F, -0.37F));

		PartDefinition hand1 = arm1.addOrReplaceChild("hand1", CubeListBuilder.create().texOffs(54, 32).addBox(-2.0F, -1.0F, -4.0F, 4.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, 5.0F, -7.0F));

		PartDefinition book = hand1.addOrReplaceChild("book", CubeListBuilder.create().texOffs(74, 23).addBox(0.0F, -3.0F, -3.0F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -3.0F, 0.0F));

		PartDefinition cube_r10 = book.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(60, 16).addBox(0.0F, -4.0F, -4.0F, 1.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition cube_r11 = book.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 75).addBox(0.0F, -3.0F, -3.0F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.6545F));

		PartDefinition cube_r12 = book.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(74, 71).addBox(0.0F, -3.0F, -3.0F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5236F));

		PartDefinition cube_r13 = book.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(74, 64).addBox(0.0F, -3.0F, -3.0F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition cube_r14 = book.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(74, 57).addBox(0.0F, -3.0F, -3.0F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition cube_r15 = book.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(74, 50).addBox(0.0F, -3.0F, -3.0F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition cube_r16 = book.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(74, 16).addBox(0.0F, -3.0F, -3.0F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1309F));

		PartDefinition cube_r17 = book.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(24, 68).addBox(0.0F, -3.0F, -3.0F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition cube_r18 = book.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(16, 68).addBox(0.0F, -3.0F, -3.0F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition cube_r19 = book.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(8, 68).addBox(0.0F, -3.0F, -3.0F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5236F));

		PartDefinition cube_r20 = book.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(0, 68).addBox(0.0F, -3.0F, -3.0F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.6545F));

		PartDefinition cube_r21 = book.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(32, 66).addBox(-1.0F, -4.0F, -4.0F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition arm2 = torso.addOrReplaceChild("arm2", CubeListBuilder.create().texOffs(54, 41).addBox(-5.0F, 5.0F, -13.0F, 4.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.0F, 0.0F, -2.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r22 = arm2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(60, 8).addBox(-2.0F, -2.0F, -4.0F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 5.0F, -3.0F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r23 = arm2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(60, 66).addBox(-1.0F, -2.0F, -1.0F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 1.0F, -1.0F, -0.6312F, 0.3259F, 0.3933F));

		PartDefinition head = torso.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r24 = head.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(0, 32).addBox(-5.0F, -5.0F, -7.0F, 10.0F, 10.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -10.0F, 0.4363F, 0.0F, 0.0F));

		PartDefinition ball = body.addOrReplaceChild("ball", CubeListBuilder.create().texOffs(60, 27).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(8, 75).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(16, 75).addBox(1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(24, 75).addBox(-1.0F, -1.0F, 1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(46, 75).addBox(-1.0F, 1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(54, 75).addBox(-1.0F, -1.0F, -3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(62, 75).addBox(-3.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(32, 51).addBox(-2.0F, -2.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(32, 54).addBox(1.0F, -2.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(32, 57).addBox(1.0F, 1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(32, 60).addBox(-2.0F, 1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(70, 75).addBox(-2.0F, -1.0F, -2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(32, 76).addBox(1.0F, -1.0F, -2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(76, 32).addBox(1.0F, -1.0F, 1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(76, 35).addBox(-2.0F, -1.0F, 1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(32, 63).addBox(-1.0F, -2.0F, 1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(68, 27).addBox(-1.0F, 1.0F, 1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(68, 29).addBox(-1.0F, 1.0F, -2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(74, 30).addBox(-1.0F, -2.0F, -2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, -26.0F, -2.0F));

		PartDefinition spike = body.addOrReplaceChild("spike", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-1.0F, -8.0F, -3.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(1.0F, -9.0F, -2.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-3.0F, -6.0F, -2.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -20.0F, -1.0F));

		PartDefinition spike6 = body.addOrReplaceChild("spike6", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-1.0F, -8.0F, -3.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(1.0F, -9.0F, -2.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-3.0F, -6.0F, -2.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -21.0F, -1.0F));

		PartDefinition spike2 = body.addOrReplaceChild("spike2", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-1.0F, -8.0F, -3.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(1.0F, -9.0F, -2.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-3.0F, -6.0F, -2.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -21.0F, -1.0F));

		PartDefinition spike7 = body.addOrReplaceChild("spike7", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-1.0F, -8.0F, -3.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(1.0F, -9.0F, -2.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-3.0F, -6.0F, -2.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -20.0F, -1.0F));

		PartDefinition spike3 = body.addOrReplaceChild("spike3", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-1.0F, -8.0F, -3.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(1.0F, -9.0F, -2.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-3.0F, -6.0F, -2.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -19.0F, 0.0F));

		PartDefinition spike8 = body.addOrReplaceChild("spike8", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-1.0F, -8.0F, -3.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(1.0F, -9.0F, -2.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-3.0F, -6.0F, -2.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -18.0F, -1.0F));

		PartDefinition spike4 = body.addOrReplaceChild("spike4", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-1.0F, -8.0F, -3.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(1.0F, -9.0F, -2.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-3.0F, -6.0F, -2.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -20.0F, 0.0F));

		PartDefinition spike5 = body.addOrReplaceChild("spike5", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-1.0F, -8.0F, -3.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(1.0F, -9.0F, -2.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-3.0F, -6.0F, -2.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -19.0F, -1.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(DrugdMagicanModel entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		magican.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}